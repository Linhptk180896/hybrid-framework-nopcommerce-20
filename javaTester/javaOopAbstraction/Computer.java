package javaOopAbstraction;

public abstract class Computer {
	//Non-abstract
	public void showCPU() {
		System.out.println("Show CPU");
	}
	
	
	protected abstract void setRam();
	
	private void showGPU() {}
	
	void showHDD() {}
	
	
	
	

}
