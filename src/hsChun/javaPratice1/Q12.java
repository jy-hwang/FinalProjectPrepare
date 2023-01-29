package hsChun.javaPratice1;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
	
	/*
	 12. 정수 5개를 입력하면 1차원 배열을 이용하여 정렬하는 메서드 sortArray(int [] arr) 를
      만들고 다음과 같은 형식으로  main Method를 작성하시오.
      (단, 출력형식은 내림차순임, 예제 : 21, 10, 8, 7, -4 )
	 */
	
	static int[] arr = new int[5];
	
	public static void sortArray(int[] arr) {
		
		int rNum = arr.length;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		for(int i=0 ; i<5 ; i++) {
			System.out.print(i+1 +"번째 숫자를 입력하세요 : ");
			arr[i] = scan.nextInt();
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=1 ; j<rNum ; j++) {
				if(arr[j-1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			rNum--;	
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		sortArray(arr);
	}

}
