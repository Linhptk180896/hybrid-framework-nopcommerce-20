package javaAccModFirst;

public class MainStudent {

	public static void main(String[] args) {
		//Nếu chỉ khai báo int age; thì tại class này sẽ không check được giá trị là valid và invalid
		Student student = new Student();
//		student.age = 15;
//		student.age = -15;
		
		student.setAge(-15);
		System.out.println("In tuối âm: " + student.getAge());
		
		student.setAge(15);
		System.out.println("In tuối âm: " + student.getAge());
	
	}

}
