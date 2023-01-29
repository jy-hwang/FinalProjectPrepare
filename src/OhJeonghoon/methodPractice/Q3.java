package OhJeonghoon.methodPractice;

public class Q3 {

	
	private static void sum1to10() {
	
		int sum = 0;
		for(int i = 1; i <= 10 ; i++) {
			
			sum += i;
		}
		System.out.println("1부터 10까지의 합계 :" + sum);
	}
	
	
	
	public static void main(String[] args) {
		
		sum1to10();

	}



}
