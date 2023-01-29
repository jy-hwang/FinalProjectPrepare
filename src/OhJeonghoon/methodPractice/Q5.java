package OhJeonghoon.methodPractice;

import java.util.Scanner;

public class Q5 {

	private static void sumAnyNum(int n, int m) {
		 
		int sum = 0;
		
		for(int i = n ; i<=m ; i++) {
			sum += i;
		}
		System.out.println( "입력한 값 :" + n + "," + m +"," + "n부터 m까지의 합계 :" +sum);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력값 n:");
		int n = scanner.nextInt();
		System.out.print("입력값 m:");
		int m = scanner.nextInt();
		
		
		sumAnyNum(n,m);

	}


}
