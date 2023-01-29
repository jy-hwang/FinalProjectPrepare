package hsChun.javaPratice1;

import java.util.Scanner;

public class Q9 {
	
	/*
	 9. 7에서 만든 프로그램을 좀 더 수정하여 3개의 메소드로 분리하고자 한다.
  	  다음과 같은 형식으로 Method 를 작성하시오.
	  ex)
	  public class Q9{
		  static void getHakjum(){
			사용자로부터 입력을 받는 메서드();
			총합과 평균을 구하는 메서드();
			학점을 구하는 메서드();
		  }
		  public static void main(String[] args) {
			getHakjum();
		  }
 	  }
	 */
	static String i = "";
	static String j = "";
	static String k = "";
	static int sum = 0;
	static double avg = 0;
	static String grade = "";
	
	static void input() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("==================================================================");
		System.out.print("1번째 수를 입력하세요(종료는 X) >> ") ;
		i = scan.nextLine();
		if(i.equalsIgnoreCase("x")) {
			System.out.println("==================================================================");
			return;
		}
		System.out.print("2번째 수를 입력하세요(종료는 X) >> ") ;
		j = scan.nextLine();
		if(j.equalsIgnoreCase("x")) {
			System.out.println("==================================================================");
			return;
		}
		System.out.print("3번째 수를 입력하세요(종료는 X) >> ") ;
		k = scan.nextLine();
		if(k.equalsIgnoreCase("x")) {
			System.out.println("==================================================================");
			return;
		}
	}
	
	static void sumAndAvg() {
		
		sum = Integer.parseInt(i) + Integer.parseInt(j) + Integer.parseInt(k);
		avg = (double)sum/3;
	}
	
	static void grade() {
		
		if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "F";
		else grade = "F";
		System.out.printf("입력하신 값은 %s, %s, %s 으로 "
				+ "총합은 %d 이고 평균은 %.1f, 학점은 %s입니다.\n", i, j, k, sum, avg, grade);
	}
	
	public static void getHakjum() {
		
		input();
		sumAndAvg();
		grade();			
	}	

	public static void main(String[] args) {
		
		getHakjum();
	}
}
