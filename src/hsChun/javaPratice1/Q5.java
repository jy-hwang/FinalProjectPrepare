package hsChun.javaPratice1;

import java.util.Scanner;

public class Q5 {

	/*
	 5. 사용자로 부터 두 수를 입력받아 그 사이 값의 합을 출력하는 메서드
	  sumAnyNum() 을 만들고 다음과 같은 형식으로 main Method 를 작성하시오.
      (단, 출력형식은 "입력한 값 : n, m  , n부터 m까지의 합계 : xxx" 으로 하시오)
	 */
	public static void sumAnyNum() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 n의 값을 입력하세요 : ");
		int n = scan.nextInt();
		System.out.print("정수 m의 값을 입력하세요 : ");
		int m = scan.nextInt();
		int sum = 0;
		if(n>m) {
			for(int i=m ; i<=n ; i++) {
				sum += i;
			}
			System.out.printf("입력한 값 : n=%s, m=%s, %s부터 %s까지의 합계 : " + sum, n, m, m, n);
		}
		else if(m>n) {
			for(int i=n ; i<=m ; i++) {
				sum += i;
			}
			System.out.printf("입력한 값 : n=%s, m=%s, %s부터 %s까지의 합계 : " + sum, n, m, n, m);
		}
	}
	
	public static void main(String[] args) {
		
		sumAnyNum();
	}

}
