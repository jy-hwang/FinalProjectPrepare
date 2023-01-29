package hsChun.javaPratice1;

public class Q3 {
	
	/*
	 3. 1~10 까지의 수를 합한 결과를 출력하는 메서드 sum1to10() 을
	  만들고 다음과 같은 형식으로 main Method 를 구성하시오.
      (단, 출력형식은 "1부터 10까지의 합계 : xxx" 으로 하시오.)
	 */
	
	public static void sum1to10() {
		int sum = 0; 
		for(int i=1 ; i<=10 ; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합계 : " + sum);
	}

	public static void main(String[] args) {

		sum1to10();
	}

}
