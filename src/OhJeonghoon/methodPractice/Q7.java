package OhJeonghoon.methodPractice;

import java.util.Scanner;

public class Q7 {

	void sumAndAvg(){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1번째 수를 입력하세요");
		int firstnum = scanner.nextInt();
		System.out.println("2번째 수를 입력하세요");
		int secondnum = scanner.nextInt();
		System.out.println("3번째 수를 입력하세요");
		int thirdnum = scanner.nextInt();
		
		int sum= firstnum + secondnum + thirdnum;
		int avg = sum/3;
		System.out.println
		("입력하신 값은 "+ firstnum + "," + secondnum + "," + thirdnum + 
		"으로 총합은 " + sum + "이고 " + "평균은 " + avg + "입니다.");
		
		
		
	}
	
	public static void main(String[] args) {
	
		
		
		
		Q7 savg = new Q7();
		savg.sumAndAvg();
		
		
		//sumAndAvg();
		
		
	}

}
