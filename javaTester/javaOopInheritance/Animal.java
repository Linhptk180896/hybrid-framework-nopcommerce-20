package javaOopInheritance;

public class Animal {
	public Animal() {
		System.out.println("Parent's Constructor");
	}
	public Animal(String name) {
		System.out.println("Parent's Constructor " + name);
	}
	public Animal(String name, String age) {
		System.out.println("Parent's Constructor " + age );
		System.out.println("Parent's Constructor " + name );
	}
	
	public void eat() {
		System.out.println("Eat");
	}

}
