package javaAccModFirst;
// Class Car là final class nên class Dog không kế thừa đc class Car
public class Dog {
	Cat cat = new Cat();
	Animals animals = new Animals();
	Car car = new Car(); //--> Không kế thừa đc nhưng có thể truy cập thông qua việc tạo mới đối tượng được 

}
