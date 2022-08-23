package javaBasic;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic03_IfElseExcersice {
	String projectPath = System.getProperty("user.dir");
	WebDriver driver;
	Scanner scan = new Scanner(System.in);
//	@Test
//	public void TC01_BT1() {
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//	 if (number%2==0) {
//		 System.out.println(number + " Đây là số chẵn");
//		
//	} else {
//		System.out.println(number + " Đây là số lẻ");
//
//	}
//	
//	}
//	
//	
//	@Test
//	public void TC02_BT2() {
//	
//		int numberA = scan.nextInt();
//		int numberB = scan.nextInt();
//		if (numberA > numberB) {
//			System.out.println(numberA + " lớn hơn "+ numberB);
//			
//		} else if(numberA == numberB) {
//			System.out.println(numberA + " nhỏ hơn "+ numberB);
//
//		}
//	}
//	
//	@Test
//	public void TC02_BT3() {
//		String nameA = scan.nextLine();
//		String nameB = scan.nextLine();
//		if (nameA.equalsIgnoreCase(nameB)) {
//			System.out.println("Cùng tên");
//		}else {
//			System.out.println("Khác tên");
//		}
//		
//	}
//	
//	@Test
//	public void TC02_BT4() {
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		int number3 = scan.nextInt();
//		if (number1 > number2 && number1 > number3) {
//			System.out.println("Max = "+number1);
//			
//			
//		} else if (number2 > number3 && number2>number3) {
//			System.out.println("Max = "+number2);
//
//		} else {
//			System.out.println("Max = "+number3);
//		}
//		
//	}
	
//	@Test
//	public void TC02_BT5() {
//		int numberA = scan.nextInt();
//		if (numberA > 10 && numberA < 100) {
//			System.out.println("Number A nằm trong khoảng");
//			
//		} else {
//			System.out.println("Number A nằm ngoài khoảng");
//		}
//		
//	}
	
//	@Test
//	public void TC02_BT6() {
//		float studentPoint = scan.nextFloat();
//		if (studentPoint <= 10 && studentPoint >=8) {
//			System.out.println("Xếp loại A");
//			
//		} else if(studentPoint <= 7.5 && studentPoint >=8.5)
//		{
//			System.out.println("Xếp loại B");
//
//		}
//		else if(studentPoint <= 5 && studentPoint >=7.5)
//		{
//			System.out.println("Xếp loại C");
//
//		}
//		else if(studentPoint <= 0 && studentPoint >=5)
//		{
//			System.out.println("Xếp loại D");
//
//	}
//	}
	
	@Test
	public void TC02_BT7() {
		int month = scan.nextInt();
		
		if (month == 2 ) {
			System.out.println("Tháng " + month +" có 28 ngày");
			
			 
		} else if(month%2==0){
			System.out.println("Tháng " + month +" có 30 ngày");

		} else {
			System.out.println("Tháng " + month +" có 31 ngày");
		}
		
	}
		
}
