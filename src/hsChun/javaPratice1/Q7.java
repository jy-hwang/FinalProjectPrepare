package hsChun.javaPratice1;

import java.util.Scanner;

public class Q7 {

	/*
	  7. 사용자로 부터 세 수를 입력받아 그 값의 합과 평균을 구하는 메서드
	   sumAndAvg() 를 만들고 x 또는 X 를 입력하면 종료하는 프로그램을 작성하시오.
       다음과 같은 형식의 출력양식을 따르시오.
	   =======================================================
	   1번째 수를 입력하세요(종료는 x(X)) >>  90
	   2번째 수를 입력하세요(종료는 x(X)) >>  80
	   3번째 수를 입력하세요(종료는 x(X)) >>  100
	   입력하신 값은 90, 80, 100 으로 총합은 270 이고 평균은 90입니다.
	   1번째 수를 입력하세요(종료는 x(X)) >> x
	   =======================================================
	 */
	public static void sumAndAvg() {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("==================================================================");
			System.out.print("1번째 수를 입력하세요(종료는 X) >> ") ;
			String i = scan.nextLine();
			if(i.equalsIgnoreCase("x")) {
				System.out.println("==================================================================");
				break;
			}
			System.out.print("2번째 수를 입력하세요(종료는 X) >> ") ;
			String j = scan.nextLine();
			if(j.equalsIgnoreCase("x")) {
				System.out.println("==================================================================");
				break;
			}
			System.out.print("3번째 수를 입력하세요(종료는 X) >> ") ;
			String k = scan.nextLine();
			if(k.equalsIgnoreCase("x")) {
				System.out.println("==================================================================");
				break;
			}
			int sum = Integer.parseInt(i) + Integer.parseInt(j) + Integer.parseInt(k);
			double avg = (double)(Integer.parseInt(i) + Integer.parseInt(j) + Integer.parseInt(k)) / 3; 
			System.out.printf("입력하신 값은 %s, %s, %s 으로 총합은 %d 이고 평균은 %.1f입니다.\n", i, j, k, sum, avg);			
			continue;
		}
	}
	
	public static void main(String[] args) {
		
		sumAndAvg();
	}
}
