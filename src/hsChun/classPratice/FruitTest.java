package hsChun.classPratice;

public class FruitTest {

	/*
	 1. 다음의 주어진 조건으로 'Fruit'을 추상화하고 인수생성자를 이용해 초기화 하시오.
	  멤버메서드 showFruit 를 만들어 'Fruit' 객체의 정보를 출력하시오.
	  속성 : 이름 , 색상, 당도
	  
	  =console 출력 결과=
	  해당 Fruit 의 이름은 Apple 이고 색상은 red 이며 당도는 Sweet 합니다.
	  해당 Fruit 의 이름은 Lemon 이고 색상은 lemon 이며 당도는 sour 합니다.
	  ===================
	 */
	String name;
	String color;
	String brix;
	int price;
	
	public FruitTest(String name, String color, String brix, int price) {
		this.name = name;
		this.color = color;
		this.brix = brix;
		this.price = price;
	}
	
	public void showFruit() {
		System.out.printf("해당 Fruit 의 이름은 %s 이고 색상은 %s 이며 당도는 %s, 가격은 %d 입니다.\n", name, color, brix, price);
	}
	
	public static void main(String[] args) {
		
		FruitTest apple = new FruitTest("Apple","red","sweet", 3000);
		apple.showFruit();

		FruitTest lemon = new FruitTest("Lemon","lemon","sour", 2000);
		lemon.showFruit();
	}
}
