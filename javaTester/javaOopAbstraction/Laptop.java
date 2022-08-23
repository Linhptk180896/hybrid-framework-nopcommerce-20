package javaOopAbstraction;

public class Laptop extends Computer {
	//Phải override lại hàm abstract
	@Override
	public void setRam() {
		// TODO Auto-generated method stub
		
	}
	
	// gọi hàm normal dùng luôn
	public void remderVideo() {
		showCPU();
	}
	
}
