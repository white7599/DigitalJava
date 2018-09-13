package kr.ch8Interface;

class Cat implements Soundable{

	public String sound() {
		return "�߿�";
	}	
}

class Dog implements Soundable{
	public String sound() {
		return "�۸�";
	}
}

public class Ex8_3 {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
