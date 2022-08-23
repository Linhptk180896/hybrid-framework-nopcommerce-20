package javaBasic;

import java.util.Iterator;

import org.testng.Assert;

public class Topic02_Operator {

	public static void main(String[] args) {
		int number = 10;
		number += 5;
		number = number +5;
		System.out.println(number);
		
		//--> number/5 là lấy phần nguyên 20/5 =3
		System.out.println(number/5);
		
		//--> number%7 là lấy phần dư 20%7 = 2 dư 6
		System.out.println(number%7);
		
		//--> ++ là + 1
		System.out.println(number++);
		//--> -- là -1
		System.out.println(number--);
		
		int number2 = 10;
		
		System.out.println(number2++);//-->In ra giá trị = 10 trước. Rồi + 1 = 11
		
		
		System.out.println(++number2); //--> +1 vào giá trị 11 trước ->  = 12. Rồi in ra giá trị = 12
		
		for (int i= 0; i < 3; i++) {
			System.out.println(i); //-> In i = 0 ra trước. Action xong thì mới công thêm 1 vào i. i = 1 lại tiếp tục kiểm tra điều kiện vòng lặp for
		}
		
		for (int i= 0; i < 3; ++i) {
			System.out.println(i); 
		}
			
		Assert.assertTrue( 5 <6 );
		String address = "Hồ Chí Minh";
		if (address != "Hà nội") {
			System.out.println("Address is not the same");
			
		}
		if (!(address == "Hà nội")) {
			System.out.println("Address is not the same");
			
		}
		
		// Biểu thức tam nguyên: cách viết ngắn gọn của if có 3 dấu = ? :
		boolean status = (address == "Hà nội")? true: false;
		System.out.println(status);
		}
		
	}
	
	


