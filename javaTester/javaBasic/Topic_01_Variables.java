package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_01_Variables {
	// Toàn cục
	String homePageUrl ="";
	static final String BROWSER_NAME="Chrome";
	//--> Biến trên là hằng số: const
	

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	System.out.println(name);
	System.out.print(name);

	}
	
	@Test
	public void TC_01() {
		//Cục bộ: Sử dụng trong phạm vi của testcase/hàm
		String homePageUrl ="";
		System.out.println(homePageUrl);
		//Block code
		if (3<5) {
			//Cục bộ 
			String homePageTitle = "";
			System.out.println(homePageTitle);
		
		}
		
		System.out.println(Topic_01_Variables.BROWSER_NAME);
	}

}
