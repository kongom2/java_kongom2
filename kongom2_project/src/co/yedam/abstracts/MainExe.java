package co.yedam.abstracts;

public class MainExe {
	public static void main(String[] args) {
//		Animal animal = new Animal(""); // 못만듬
		Animal animal = new Dog("강아지");
		animal.sound();
		
		animal = new Cat("고양이");
		animal.sound();
	}
}
