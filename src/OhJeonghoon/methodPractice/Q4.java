package OhJeonghoon.methodPractice;

public class Q4 {

	private static void sumNtoM(int i, int j) {
		
		int sum=0;
		
		for(int a = i ; a<=j ; a++) {
			
			sum += a;
		}
		
		System.out.println("n부터 m까지의 합계 :"+sum);
		
		
		
	}
	public static void main(String[] args) {
		
		sumNtoM(10,50);

	}


}
