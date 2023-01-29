package hsChun.javaPratice1;

public class Q2 {

	/*
	 2. 1~100 까지의 수를 합한 결과를 출력하는 프로그램을
	  main Method 에 작성하시오.
	  (단, 출력형식은 "1부터 100까지의 합계 : xxx" 으로 하시오.)

	 */
	public static void main(String[] args) {

		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합계 : " + sum);
	}

}
