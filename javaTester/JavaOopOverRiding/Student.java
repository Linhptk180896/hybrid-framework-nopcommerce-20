package JavaOopOverRiding;

import javaOOP.iWork;

public class Student extends Person implements iWork{
	@Override
	public void eat(){
		System.out.println("Cơm 10k");
	}
	
	//Override lại hàm sleep của class abstract person
	@Override
	public void sleep(){
		System.out.println("ngủ 8 tiếng");
	}
	
	
	@Override
	public void workingTime() {
		System.out.println("ngủ ít");
	}
	
	public final void walk(String name) {
		System.out.println("đi bộ  ");
	}
	public static void run	(String name) {
	System.out.println("chạy ");
}
	
}
