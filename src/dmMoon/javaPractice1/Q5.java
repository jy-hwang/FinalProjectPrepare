package dmMoon.javaPractice1;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("입력한 값:");
		int n=scanner.nextInt();
		System.out.print("입력한 값:");
		int m=scanner.nextInt();
		sumAnyNum(n, m);
	}
	static void sumAnyNum(int n, int m) {
		int sum=0;
		for(int i=n; i<=m; i++) {
			sum+=i;
		}
		System.out.printf("%d~%d까지의 합은:%d", n, m, sum);
	}

}