package javaBasic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Topic06_Array {

	public static void main(String[] args) {
		
		//---------Cố định
		int number[] = {12,7,5,6,8,97};
		int[] student = {12,7,5,6,8,97};
		
		//Lấy phần tử từ mảng
		System.out.println(number[0]);
		System.out.println(number[1]);
		
		int[] b = new int[3];
		b[0] = 7;
		b[1] = 8;
		b[2] = 9;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
		
		String[] studentName = {"Linh","Hạnh", "Lâm"};
		studentName[0] = "Hồng"; // Giá trị này ghi đè lên "Linh"
		for (int i = 0; i < studentName.length; i++) {
			System.out.println(studentName[i]);
			
		}
		
		//-------------Động
		ArrayList<String> stdName = new ArrayList<String>();
		//Khi chạy vòng for mới add vào array
		for (String std : stdName) {
			stdName.add(std);
			
		}
		
		String[] newstdName = studentName.clone();
		for (int i = 0; i < newstdName.length; i++) {
			System.out.println(newstdName[i]);
			
		}
		
		String stdString = Arrays.toString(studentName);
		System.out.println(stdString);
}
}
