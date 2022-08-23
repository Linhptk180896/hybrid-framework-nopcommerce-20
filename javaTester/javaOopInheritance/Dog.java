package javaOopInheritance;

public class Dog extends Animal{
	int age;
	public Dog() {
		System.out.println("Children's constructor");
	}
	
	public void run() {
		System.out.println("Run");
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
			
		}else {
			this.age = 0;
		}
	}
	public int getAge() {
		return this.age;
	}
}
