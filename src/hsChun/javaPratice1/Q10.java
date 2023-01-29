package hsChun.javaPratice1;

public class Q10 {

	/*
	 10. 2차원 배열을 이용하여 다음과 같이 출력하는 프로그램을 작성하시오.
	  ==========================================
	  [0,0]
	  [1,0][1,1]
	  [2,0][2,1][2,2]
	  ==========================================
	 */
	
	public static void main(String[] args) {
		
		int[][] array = new int[3][3];
		
		System.out.println("==========================================");
		for(int i=0 ; i<array.length ; i++) {
			for(int j=0 ; j<=i ; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}
		System.out.println("==========================================");
	}

}
