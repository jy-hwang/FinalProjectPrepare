package hsChun.javaPratice1;

import java.util.Scanner;

public class Q8 {

	/*
	 8. 정수 5개를 입력하면 최댓값과 최솟값을 구하는 메서드 getMinMax(int [] array)를
	  만들고 다음과 같은 형식으로  main Method를 작성하시오.
      (단, 출력형식은 "입력하신 값은 10,7,-4,8,21 으로 최댓값은 21 이고 최솟값은 -4 입니다." )
	 */
	public static void getMinMax() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 5개 입력받아 배열을 만듭니다...");
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int i = scan.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		int j = scan.nextInt();
		System.out.print("세번째 정수를 입력해주세요 : ");
		int k = scan.nextInt();
		System.out.print("네번째 정수를 입력해주세요 : ");
		int l = scan.nextInt();
		System.out.print("다섯번째 정수를 입력해주세요 : ");
		int m = scan.nextInt();
		
		int[] array = {i, j, k, l, m};
		int min = array[0];
		int max = array[0];
		
		for(int x=0 ; x<array.length ; x++) if(array[x] < min) min = array[x];
		for(int x=0 ; x<array.length ; x++) if(array[x] > max) max = array[x];
		
		System.out.printf("입력하신 값은 %d, %d, %d, %d, %d 으로 최대값은 %d 이고 최소값은 %d 입니다.", i, j, k, l, m, max, min);
	}
	
	public static void main(String[] args) {

		getMinMax();
	}

}
