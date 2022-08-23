package javaOOP;

public  class Person {
	public class innerPerson{}
	public static void main(String[] args) {
		Person person = new Person();
		//get nested class
		Person.innerPerson iPerson = new Person().new innerPerson();
	}

}
