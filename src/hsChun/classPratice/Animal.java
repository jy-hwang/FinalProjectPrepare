package hsChun.classPratice;

public class Animal {
	
	/*
	 2. 다음의 주어진 조건으로 'Animal' 을 추상화하고 인수생성자를 이용해 초기화 하시오.
	  멤버메서드 showAnimal 을 만들어 'Animal' 객체의 정보를 출력하시오.
	  속성 : 종, 이름, 키,몸무게, 짖는소리
	  =console 출력 결과=
	  해당 Animal 의 종은 개 이고 이름은 백구 입니다. 멍멍 하고 짖습니다.
	  해당 Animal 의 종은 고양이 이고 이름은 나비 입니다. 야옹 하고 짖습니다.
	  ===================
	 */
	
	String species;
	String name;
	int height;
	int weight;
	String bark;
	
	public Animal(String species, String name, int height, int weight, String bark) {
		
		this.species = species;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bark = bark;
	}
	
	public void showAnimal() {
		System.out.printf("해당 Animal 의 종은 %s 이고 이름은 %s 입니다. %s 하고 짖습니다.\n", species, name, bark);
	}

	public static void main(String[] args) {

		Animal baekGu = new Animal("개", "백구", 30, 20, "멍멍");
		baekGu.showAnimal();

		Animal nabi = new Animal("고양이", "나비", 20, 10, "야옹");
		nabi.showAnimal();
	}

}
