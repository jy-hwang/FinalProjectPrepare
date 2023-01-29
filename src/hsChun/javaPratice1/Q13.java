package hsChun.javaPratice1;

import java.util.Arrays;

public class Q13 {

	/*
	 13.1~45 까지의 수중 중복 없이 6개의 수를 뽑아 1차원 배열에 저장하고 정렬하는
      메서드 lottoDesc() 를 만들고 다음과 같은 형식으로 main Method를 작성하시오.
      (단, 출력 형식은 오름차순임. 예제 : 1,8,15,22,29,36 )
	 */
	
	public static void lottoDesc() {
		
		int[] rArray = new int[6];
		
		for(int i=0 ; i<rArray.length ; i++) {
			rArray[i] = (int)(Math.random() * 45) + 1;
			for(int j=0 ; j<i ; j++) {				
				if(rArray[j] == rArray[i]) i--;
			}
		}
		System.out.println(Arrays.toString(rArray));
	}
	
	public static void main(String[] args) {
		
		lottoDesc();
	}

}
