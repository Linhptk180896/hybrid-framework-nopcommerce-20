package javaOOP;

public abstract  class Computer {
	//Normal method
	public void showComputerPerformance() {
		System.out.println("Show computer performance");
	}
	
	//Abstract method là: Khung để cho các class con kế thừa phải override (implement lại)
	//Abstract method chỉ đc nằm trong abstract class
	public abstract void showComputerRam() ;
	
	

}
