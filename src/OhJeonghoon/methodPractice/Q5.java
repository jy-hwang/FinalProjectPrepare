package OhJeonghoon.methodPractice;

import java.util.Scanner;

public class Q5 {

	void sumAnyNum() {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력값 n:");
		int a = scanner.nextInt();
		System.out.print("입력값 m:");
		int b = scanner.nextInt();
		int sum = 0;
		
		for(int i = a ; i<=b ; i++) {
			sum += i;
		}
		System.out.println( "입력한 값 :" + a + "," + b +"," + "n부터 m까지의 합계 :" +sum);
	}
	
	public static void main(String[] args) {
		
		
		Q5 SN = new Q5();
		SN.sumAnyNum();

	}


}
