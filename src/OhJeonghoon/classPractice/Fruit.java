package OhJeonghoon.classPractice;

public class Fruit {

	String name;
	String color;
	String taste;
	int price;

	public Fruit(String string, String string2, String string3, int i) {
		
		this.name= string;
		this.color=string2;
		this.taste=string3;
		this.price=i;
	}







	void showFruit() {
		
		System.out.printf
		("해당 Fruit 의 이름은 %s 이고 색상은 %s 이며 당도는 %s 합니다.", name , color, taste);
		System.out.println();
	}

}
