package prac7_4;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock; //Deadlock�� �ذ��ϱ� ���� ���� �ο�
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
		 balanceChangeLock.lock();//7.3:�Աݽ� ���� �ɾ �۾��� �� ���� ������ ���� �Ұ��ϰ� �����.
	      try
	      {
	         System.out.print("Depositing " + amount);
	         double newBalance = balance + amount;
	         System.out.println(", new balance is " + newBalance);
	         balance = newBalance;
	         sufficientFundsCondition.signalAll(); //7.4:���� ������ ��ȣ�� �ش�.
	      }
	      finally
	      {
	         balanceChangeLock.unlock(); //7.3 ������
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
	      balanceChangeLock.lock(); //7.3:����� ���� �ɾ �۾��� �� ���� ������ ���� �Ұ��ϰ� �����. 
	      
	      try
	      {
	         while (balance < amount)
	            sufficientFundsCondition.await(); //7.4:���� ������ ������ ��ٸ���.
	       //��ȣ�� ������ ����ǵ����Ѵ�.
	         System.out.print("Withdrawing " + amount);
	         double newBalance = balance - amount;
	         System.out.println(", new balance is " + newBalance);
	         balance = newBalance;
	      }
	      finally
	      {
	         balanceChangeLock.unlock();//7.3 ������
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