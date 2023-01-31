package hsChun.javaPratice1;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleBaseballGame {

	/*
	 간단한 야구게임을 만드시오.
	 1) 컴퓨터가 0~9 사이의 중복되지 않는 임의의 정수 3개를 뽑는다. 이를 사용자는 알지못한다.
	 2) 사용자가 0~9 사이의 중복되지 않는 임의의 정수 3개를 입력한다.
	 3) 사용자가 '컴퓨터가 뽑은 수와 서로 다른 위치에 있는 같은 수를 입력'했다면 Ball
	    사용자가 '컴퓨터가 뽑은 수와 같은 위치에 있는 같은 수를 입력' 했다면 Strike
	 4) 사용자가 0~9 사이의 수를 입력하지 않았다면, 다시 입력하라는 메시지 출력
	 5) 사용자가 99를 입력하면 게임종료.
	 6) 사용자가 게임을 종료하지 않을 경우 3 스트라이크가 나올때 까지 게임을 반복.
 
	 예) 컴퓨터 : { 1, 2, 7 } < 사용자는 알 수 없음.
 		사용자 : { 7, 2, 3 } < 사용자가 입력한 수
	 결과는 1 Ball, 1 Strike 입니다.
 	 첫번째 수를 입력하세요(종료는 99 입력) :  99
 	 게임을 종료합니다.
 
	 */
	
	public static void game() {
		
		int[] comArr = new int[3];
		
		for(int i=1 ; i<3 ; i++) {
			comArr[i] = (int)(Math.random() * 10);
			for(int j=0 ; j<i ; j++) {
				if(comArr[j] == comArr[i]) i=-1;
			}		
		}
		System.out.println(Arrays.toString(comArr));
		
		int[] userArr = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("야구 게임을 시작합니다!");
		while(true) {
			System.out.print("첫번째 수를 입력하세요(종료는 99 입력) : ");
			userArr[0] = scan.nextInt();
			if(userArr[0] == 99) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			System.out.print("두번째 수를 입력하세요(종료는 99 입력) : ");
			userArr[1] = scan.nextInt();
			if(userArr[1] == 99) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			System.out.print("세번째 수를 입력하세요(종료는 99 입력) : ");
			userArr[2] = scan.nextInt();
			if(userArr[2] == 99) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			int strike = 0;
			int ball = 0;
			for(int i=0 ; i<userArr.length ; i++) {
				if(userArr[i] == comArr[i]) strike++;
			}
			for(int i=0 ; i<userArr.length ; i++) {
				for(int j=0 ; j<userArr.length ; j++) {
					if(i != j && userArr[i] == comArr[j]) ball++;
				}
			}
			if(strike == 3) {
				System.out.printf("플레이어가 입력한 숫자는 " + Arrays.toString(userArr) + " 이며 "
						+ "결과는 %d Strike, %d Ball 입니다. 축하합니다!\n", strike, ball);
				break;
			}
			else
				System.out.printf("플레이어가 입력한 숫자는 " + Arrays.toString(userArr) + " 이며 "
						+ "결과는 %d Strike, %d Ball 입니다.\n", strike, ball);
		}
	}
	
	public static void main(String[] args) {

		game();
	}

}
