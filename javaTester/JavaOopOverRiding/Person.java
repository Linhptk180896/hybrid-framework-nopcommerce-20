package JavaOopOverRiding;

public abstract class Person {
	public void eat(){
		System.out.println("Cơm 20k");
	}
	
	public void sleep(){
		System.out.println("Ngủ");
	}
	
	public final void walk() {
		System.out.println("đi bộ  ");
	}
	public static void run() {
	System.out.println("chạy ");
}
	
	private void dating() {
		System.out.println("Dating");
	}
}
