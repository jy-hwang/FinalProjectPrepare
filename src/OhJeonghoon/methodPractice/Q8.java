package OhJeonghoon.methodPractice;

public class Q8 {

	static void getMinMax(int [] array){
		System.out.print("입력하신 값은 ");

		for(int i : array) {
			System.out.print(" " + i);
		}
		
		int max = 0;
		int min = array[0];
		for (int j=0 ; j<array.length ; j++ ) {
			if(max<array[j]) {
				max=array[j];
			}
			if(min>array[j]) {
				min=array[j];
			}
		}
	
		System.out.printf(" 으로 최대값은 %d 이고 최솟값은 %d 입니다.%n ", max , min);
	
	}
	
	public static void main(String[] args) {
		int [] array = {10 , 7 , -4 , 8 , 21};
		
		getMinMax(array);
	}

	

}
