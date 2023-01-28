package dmMoon.javaPractice1;

public class Q4 {

	public static int sumNtoM(int n, int m) {
		int sum=n+m;
		for(int i=n; i<=m; i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("n부터 m까지의 합계:"+sumNtoM(0, 0));
	}
}
