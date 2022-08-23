package javaOopPolymorphism;

public class Testing {

	public static void main(String[] args) {
		Pig pig = new Pig();
		pig.eat();
		Bird bird = new Bird();
		bird.eat();
		
		Animal animal = new Animal();
		animal = new Pig();
		animal.eat();
		
		animal = new Bird();
		animal.eat();
	}

}
