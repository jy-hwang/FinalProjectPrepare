package OhJeonghoon.methodPractice;

import java.util.Scanner;

public class Q9 {
	
	static int fSub;
	static int sSub;
	static int tSub;
	static int sum;
	static double avg;
	
	static String grade = "";
	
	static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1과목 점수를 입력해주세요.");
		fSub = scanner.nextInt();
		System.out.println("2과목 점수를 입력해주세요.");
		sSub = scanner.nextInt();
		System.out.println("3과목 점수를 입력해주세요.");
		tSub = scanner.nextInt();
	}
	
	static void sumNavg() {
		
		
		sum = fSub + sSub + tSub;
		avg = sum/3;
	}
	
	static void hakjum() {
		
		
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
	
		System.out.printf("총합은 %d 이고 평균은 %f 이며 학점은 %s 입니다.%n ", sum , avg , grade);

		
		
	}
	
	static void getHakjum() {
		
		input();
		sumNavg();
		hakjum();
		
		
	}



		public static void main(String[] args) {
			
			
			getHakjum();
		}

}
