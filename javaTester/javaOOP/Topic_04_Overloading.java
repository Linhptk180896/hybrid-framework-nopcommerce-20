package javaOOP;

public class Topic_04_Overloading {
	static int plusMethodInt(int x, int y) {
		return x +y;
	}
	
	static double plusMethodInt(double x, double y) {
		return x +y;
	}
	
	//Áp dụng overloading chỉ đặt tên hàm là plusMethod
	
	static int plusMethod(int x, int y) {
		return x +y;
	}
	
	static double plusMethod(double x, double y) {
		return x +y;
	}
	public static void main(String[] args) {
		int myNum1 = plusMethodInt(5, 6);
		double myNum2 = plusMethodInt(5.5, 6.6);
		System.out.println("My num 1 " + myNum1);
		System.out.println("My num 2 " + myNum2);
		int myNumInt = plusMethod(5, 6);
		double myNumFloat = plusMethod(5.5, 6.6);
		System.out.println("My num 1 " + myNum1);
		System.out.println("My num 2 " + myNum2);
		}
}
