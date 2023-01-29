package hsChun.javaPratice1;

public class Q6 {

	/*
	 6. 세 수를 입력하면 그 값의 합과 평균, 일반학사관리 기준에 따른 학점을 구하는
   	  getHakjum(int i, int j, int k) 함수를 만들고 00을 입력하면 종료하는 프로그램을
   	  작성하고 다음과 같은 형식으로 main Method 를 작성하시오.
      (단, 출력형식은 "입력하신 값은 90, 80, 100 으로 총합은 270 이고 평균은 90 이며
       학점은 A입니다.)
	 */
	public static void getHakjum(int i, int j, int k) {
		
		int sum = i + j + k;
		double avg = (double)(i + j + k) / 3;
		String grade = "";
		
		if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else grade = "F";
		
		System.out.printf("총합은 %d 이고 평균은 %.1f 이며 학점은 %s 입니다.", sum, avg, grade);
	}
	
	public static void main(String[] args) {
		
		getHakjum(90, 80, 100);
	}

}
