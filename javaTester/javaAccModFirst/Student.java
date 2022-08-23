package javaAccModFirst;

public class Student {
	int age;

	public  int getAge() {
		return age;
	}

	
	public  void setAge(int enterAge) {
		if (enterAge >0) {
			this.age = enterAge;
			
		}else if (enterAge < 0) {
			System.out.println("Invalid data");
			
		}
	}
	

}
