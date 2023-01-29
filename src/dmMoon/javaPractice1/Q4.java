package dmMoon.javaPractice1;

public class Q4 {

	public static int sumNtoM(int n, int m) {
		int sum=n+m;
		for(int i=n; i<=m; i++) {
			sum+=i;
		}
		System.out.printf("n부터 m까지의 합계:", n, m, sum);
		return sum;
	}
	public static void main(String[] args) {
	}
}
