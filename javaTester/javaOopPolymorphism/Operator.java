package javaOopPolymorphism;

public class Operator {
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(double a, double b) {
		System.out.println(a+b);
	}
	public void sum(float a, float b) {
		System.out.println(a+b);
	}
	public void sum(long a, long b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Operator operator = new Operator();
		// Trình biên dịch sẽ lựa chọn phương thức nào 
		//Kiểu nạp chồng = đa hình lúc biên dịch (compile)
		operator.sum(10, 11);
		operator.sum(10000d, 11111d);
	}

}
