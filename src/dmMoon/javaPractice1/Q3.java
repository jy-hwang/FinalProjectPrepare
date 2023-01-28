package dmMoon.javaPractice1;

public class Q3 {
	static int sum1to10() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("1부터 10까지의 합계:"+sum1to10());
	}
}
