package hsChun.javaPratice1;

public class Q4 {
	
	/*
	 4. n~m 까지의 수를 합한 결과를 출력하는 메서드 sumNtoM(int n, int m) 을
	  만들고 다음과 같은 형식으로 main Method 를 구성하시오.
  	  (단, 출력형식은 "n부터 m까지의 합계 : xxx" 으로 하시오.)
	 */

	public static void sumNtoM(int n, int m) {
		
		int sum = 0;
		for(int i=n ; i<=m ; i++) {
			sum += i;
		}
		System.out.printf("%s부터 %s까지의 합계 : " + sum, n, m);
	}
	
	public static void main(String[] args) {
		
		sumNtoM(10, 50);
	}

}
