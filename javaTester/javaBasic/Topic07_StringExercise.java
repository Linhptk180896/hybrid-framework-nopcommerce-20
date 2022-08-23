package javaBasic;

import org.testng.annotations.Test;

public class Topic07_StringExercise {
	String courseName = "Automation Testing Advanced";
	
	@Test
	public void  TC01_BT1() {
		char courseNameArr[] = courseName.toCharArray();
		int countUpper = 0;
		int countLower = 0;	
		int countNumber = 0;
		//Count upper
		for (char character : courseNameArr) {
			if ('A' <= character && character <= 'Z') {
				countUpper++;
				
			}
			
		
		if ('a' <= character && character <= 'z') {
				countLower++;
			}
		
			
				if ('0' <= character && character <= '9') {
					countNumber++;
							
						}			
				
		}
		System.out.println("UpperCase = " + countUpper);
		System.out.println("LowerCase = " + countLower);
		System.out.println("Number = " + countNumber);
		
	}
	
	@Test
	public void  TC02_BT2() {
		char courseNameArr[] = courseName.toCharArray();
		int count = 0;
		for (char c : courseNameArr) {
			if (c =='a') {
				count++;
				
			}		
			
		}
		System.out.println(count);
	}

	
	@Test
	public void  TC03_BT3() {
		char courseNameArr[] = courseName.toCharArray();
		for (int i = courseNameArr.length-1; i>=0 ;i--) {
			System.out.println(courseNameArr[i]);
			
		}
		}
}
