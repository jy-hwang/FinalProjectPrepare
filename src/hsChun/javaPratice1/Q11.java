package hsChun.javaPratice1;

public class Q11 {

	/*
	 11. 1차원형태의 정수 배열을 하나 선언하고 향상된 for문을 사용하여
	   배열 내의 전체합을 출력하시오.
	   =========================================
	   향상된 for문을 이용한 합계 : xxx
	   =========================================
	 */
	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3};
		int sum = 0;
		
		for(int i : intArray) sum += i;
		
		System.out.println("=========================================");
		System.out.println("향상된 for문을 이용한 합계 : " + sum);
		System.out.println("=========================================");
	}

}
