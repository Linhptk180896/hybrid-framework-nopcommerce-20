package javaBasic;

public class Topic02_Casting {
	public static void main(String[] args) {
//		//Ép kiểu ngầm định, không bị mất dữ liệu 
//		byte bNumber = 126;
//		System.out.println(bNumber);
//		short sNumber = bNumber;//--> Ép kiểu implicit: widening
//		System.out.println(sNumber);
//		int iNumber = sNumber;
//		System.out.println(iNumber);
//		long lNumber = iNumber;
//		System.out.println(lNumber);
//		float fNumber = lNumber;
//		System.out.println(fNumber);
//		double dNumber = fNumber;
//		System.out.println(dNumber);
		
		//Ép kiểu tường minh
		double dNumber =  654321789741259d;
		System.out.println(dNumber);
		float fNumber = (float) dNumber;
		System.out.println(fNumber);
		long lNumber = (long) fNumber;
		System.out.println(lNumber);
		int iNumber = (int) lNumber;
		System.out.println(iNumber);
	}

}
