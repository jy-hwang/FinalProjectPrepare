package OhJeonghoon.methodPractice;

public class Q6 {

	void getHakjum(int i, int j, int k) {
		
		
	int sum = 0;
	double avg = 0.0;
	String grade = "";

		System.out.print("입력하신 값은 "+i+","+j+","+k);
			
			sum = i + j + k;
			avg = sum/3;
			
			int result = (int)avg / 10;
			
			switch(result) {
			case 10: case 9:
				grade = "A학점";break;
			case 8:
				grade = "B학점";break;
			case 7:
				grade = "C학점";break;
			case 6:
				grade = "D학점";break;
			default:
				grade = "F학점";
			}
		
		System.out.printf(" 으로 총합은 %d 이고 평균은 %f 이며 학점은 %s 입니다.%n ", sum , avg , grade );
	
	}



	public static void main(String[] args) {
		Q6 hak = new Q6();
		
		hak.getHakjum(90,80,100);
	}





}
