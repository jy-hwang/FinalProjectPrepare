package dmMoon.javaPractice1;

public class Q4 {

	public static void sumNtoM(int n, int m) {
		int sum=0;
		for(int i=n; i<=m; i++) {
			sum+=i;
		}
		System.out.printf("n부터 m까지의 합계:"+sum, n, m);
	}
	public static void main(String[] args) {
		sumNtoM(10, 50);
	}
}
