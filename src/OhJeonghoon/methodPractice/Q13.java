package OhJeonghoon.methodPractice;

import java.util.Arrays;

public class Q13 {

//	 13.1~45 까지의 수중 중복 없이 6개의 수를 뽑아 1차원 배열에 저장하고 정렬하는
//	  메서드 lottoDesc() 를 만들고 다음과 같은 형식으로 main Method를 작성하시오
//	  (단, 출력 형식은 오름차순임 예제 : 1,8,15,22,29,36 )

	public static void main(String[] args) {
		
		lottoDesc();

	}

	private static void lottoDesc() {
		
		int[] lottonum = new int[6];
		
		for(int a=0 ; a<lottonum.length; a++) {
			lottonum[a] = (int)(Math.random()*45+1);
			
			for(int b=0 ; b<a; b++) {
				if(lottonum[a]==lottonum[b]) {
					a--;
					break;
				}
			}
		}
		
		Arrays.sort(lottonum);
		
		for(int i=0; i<lottonum.length; i++) {
			System.out.print(lottonum[i] + " ");
		}
	}

}
