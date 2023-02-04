package OhJeonghoon.methodPractice;

import java.util.Arrays;

public class Q12 {

	
	public static void main(String[] args) {
		
		int[] sortArray = {10,7,-4,8,21};
		
		descSort(sortArray);
        for (int num : sortArray) {
            System.out.print(num+" ");
        }
	}

	private static void descSort(int[] sortArray) {

		for (int i = 0; i < sortArray.length; i++) {
			
			for (int j = i + 1; j < sortArray.length; j++) {
				
				if (sortArray[i] < sortArray[j]) {
					int temp = sortArray[i];
					sortArray[i] = sortArray[j];
					sortArray[j] = temp;
				}
			}
		}

	}
	

}
