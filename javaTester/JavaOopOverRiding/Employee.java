package JavaOopOverRiding;

import javaOOP.iWork;

public class Employee extends Person implements iWork{
	//Hàm eat này đang overriding hàm eat tại class Person
	//@Override là optional, viết vào để ng đọc code hiểu rằng nó đang override lại hàm cùng tên ở class cha
	@Override
	public void eat(){
		System.out.println("Cơm 30k");
	}
	//Override lại hàm sleep của class abstract person
	@Override
	public void sleep(){
		System.out.println("ngủ 5 tiếng");
	}
	
	@Override
	public void workingTime() {
		System.out.println("ngủ nhiều");
	}
	
	
}