package javaException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class TryCatchException {

	public static void main(String[] args) {
//		int number = 10;
//		try {
//			//Đúng: Chạy hết đoạn code trong try và không qua catch 
//			//Sai: Gặp exception - nhảy qua catch
//			number = number/0;
//		} catch (ArithmeticException e) {
////			e.printStackTrace();
//		}	
//		System.out.println(number);
//		System.out.println(number);
//		System.out.println(number);
//		
//		
//		String[] browserName = {"Chrome", "Firefox","Edge"};
//		try {
//			browserName[0] = "Chromium edit";
//			browserName[3] = "IE";		
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//		for (String browser : browserName) {
//			System.out.println(browser);
//			
//		}
		
		try {
			int[] array = new int[10];
			array[10] = 30 / 0;
		} catch (ArithmeticException  e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("D://automationfc.jpg");
			outputStream.write(65);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	}
