package assign2_1;

import java.util.Scanner;

public class assign2_1 {

	public assign2_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		char c=scn.next().charAt(0);
		if(c=='+'){
			System.out.println(a+b);
		}
		else if(c=='-'){
			System.out.println(a-b);
		}
		else if(c=='*') {
			System.out.println(a*b);
		}
		else {
			System.out.println(a/b);
		}
	}

}
