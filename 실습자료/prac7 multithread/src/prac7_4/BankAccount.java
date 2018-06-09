package prac7_4;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock; //Deadlock을 해결하기 위한 조건 부여
/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
	private double balance;
	private Lock balanceChangeLock;
	private Condition sufficientFundsCondition;
	
	public BankAccount() {
		balance = 0;
		balanceChangeLock = new ReentrantLock();//7.4
		sufficientFundsCondition = balanceChangeLock.newCondition(); //7.4
	}

	/**
	 * Deposits money into the bank account.
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount) { 
		 balanceChangeLock.lock();//7.3:입금시 락을 걸어서 작업이 다 끝날 때까지 접근 불가하게 만든다.
	      try
	      {
	         System.out.print("Depositing " + amount);
	         double newBalance = balance + amount;
	         System.out.println(", new balance is " + newBalance);
	         balance = newBalance;
	         sufficientFundsCondition.signalAll(); //7.4:돈이 들어오면 신호를 준다.
	      }
	      finally
	      {
	         balanceChangeLock.unlock(); //7.3 락해제
	      }
	}

	/**
	 * Withdraws money from the bank account.
	 * 
	 * @param amount
	 *            the amount to withdraw
	 */
	 public void withdraw(double amount)
	         throws InterruptedException
	   {
	      balanceChangeLock.lock(); //7.3:인출시 락을 걸어서 작업이 다 끝날 때까지 접근 불가하게 만든다. 
	      
	      try
	      {
	         while (balance < amount)
	            sufficientFundsCondition.await(); //7.4:돈이 들어오기 전까지 기다린다.
	       //신호를 받으면 실행되도록한다.
	         System.out.print("Withdrawing " + amount);
	         double newBalance = balance - amount;
	         System.out.println(", new balance is " + newBalance);
	         balance = newBalance;
	      }
	      finally
	      {
	         balanceChangeLock.unlock();//7.3 락해제
	      }
	   }

	/**
	 * Gets the current balance of the bank account.
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

}