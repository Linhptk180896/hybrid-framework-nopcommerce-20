package javaOOP;

public interface IComputer {
	//Nếu không gán từ khóa abstract cho hàm thì cũng tự hiểu là hàm abstract luôn 
	public void showComputerPerformance() ; // Trong interface đều phải chứa abstract method
	
	//Khung để cho các class con kế thừa phải override (implement lại)
	//Abstract method chỉ đc nằm trong abstract class
	public abstract void showComputerRam() ;

}
