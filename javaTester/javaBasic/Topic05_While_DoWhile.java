package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic05_While_DoWhile {
	//While: Kiểm tra điều kiến trước rồi mới vào phần thân 
	//Do while: Chạy trước 1 lần rồi mới kiểm tra điều kiện để vào phần thân 
	//----------------WHILE--------------------
//	public static void main (String[]args) {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("For: "+i);
//			
//			if (i==3) {
//				break;}
//			
//		}
//		
//		//--> In ra for 0.1.2.3 rồi mới break vì thực hiện phần thân trước sau đó mới tăng i lên 
//		
//		int i = 0;
//		while (i<5) {
//			System.out.println("While: " + i);
//			i++;
//			if (i==3) {
//			break;}
//		}
//		
//		//--> In ra 0.1.2 vì tăng i trước để  kierm tra đk rồi mới vào phần in
//
//	}
	//--------------DO-WHILE-------------------------
//	public static void main (String[]args) {
//		int i = 0;
//		for (i=0; i<5; i++) {
//			System.out.println("For: "+i);
//			
//		}	
//		System.out.println("Biến i sau khi chạy hết vòng for: " + i);
//		
//		//Biến i sau khi chạy hết vòng for: 5 -> nên không chạy vòng while 
//		while (i<5) {
//			System.out.println("While: " + i);			
//		}
//		int j = 6;
//		//Do while thì thực hiện do trước, in ra ít nhất 1 lần , check điều kiện không thỏa mãn nên không in ra nữa
//		do {
//			System.out.println("Do-While: " + j);
//		} while (j<5);
//	
//}
	
	public static void main (String[]args) {
		
		
	}
	Scanner scan = new Scanner(System.in);
	
	
	public void BT01_While() {
		int n = scan.nextInt();
		while (n<100) {
			if (n%2==0) {
				System.out.println(n);		
			}	
			n++;
		}
		
	}
	
	
	
	public void BT01_For	() {
		int n = scan.nextInt();
		for (int i = n; i < 100; i++) {
			if(i%2==0) {
			System.out.println(i);
			}
			
		}
	}
	
	public void BT01_DoWhile() {
		int n = scan.nextInt();
		do {
			System.out.println(n);	
			n++;
			
		} while (n<100);
		
	}
	
	
	public void BT02_While() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		while (a<b) {
			if (a%3==0 && a%5==0) {
				System.out.println(a);		
				
			}	
			a++;
			
			
		}
		
	}
	
	public void BT03_While() {
		int n = scan.nextInt();
		int sum = 0;
		while (n>0) {
			if (n%2!=0) {
				sum = sum+n;
				
			}
		n--;
		
		}
		System.out.println(sum);
	}
	
	
	public void Continue() {
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				continue; //Loại trừ 1 điều kiện
				
			}
			System.out.println(i);
			
		}
	}
	
	@Test
	public void Continue2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i" + i);
			for (int j = 0; j < 15; j++) {
				if (j==4) {
					continue;
								
				}
				System.out.println("j" + j);
				
			}
		}
	}
}
