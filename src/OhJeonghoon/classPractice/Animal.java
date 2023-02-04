package OhJeonghoon.classPractice;

public class Animal {
	
	String species;
	String name;
	int age;
	int weight;
	String sound;
	
	public Animal(String string, String string2, int i, int j, String string3) {
		this.species=string;
		this.name=string2;
		this.age=i;
		this.weight=j;
		this.sound=string3;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void showAnimal() {
		
		System.out.printf("해당 Animal 의 종은 %s 이고 이름은 %s 입니다. %S 하고 짖습니다.", species, name, sound);
		System.out.println();
		System.out.printf("%s의 나이는 %d이고 몸무게는 %d입니다.",name, age, weight);
		System.out.println();
		
	}

}
