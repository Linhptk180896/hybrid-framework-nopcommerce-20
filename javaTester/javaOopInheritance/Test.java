package javaOopInheritance;

public class Test {

	public static void main(String[] args) {
		Husky dog = new Husky();
		dog.eat();
		dog.run();
		dog.hunt();
		Test test = new Test();
		test.toString();
		System.out.println(test.toString());
		Dog dog1= new Dog();
		dog1.setAge(1);
		dog1.getAge();
		System.out.println(dog1.getAge());
		}
	public String toString() {
		return "Override";
	}

}
