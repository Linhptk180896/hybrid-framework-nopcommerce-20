package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Topic04_For {
	
	WebDriver driver;
	
	@Test
	public void TC_01_For() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		//Array
		String[] cityName = {"Hà nội", "Đà nẵng","HCM", "Can tho"};
		for (int i = 0; i < cityName.length; i++) {
			System.out.println(cityName[i]);
			
		}
		for (int i = 1; i < cityName.length; i++) {
			System.out.println(cityName[i]);		
	}
		//For each dùng để chạy qua hết tất cả giá trị 
		 for (String city : cityName) {
			 System.out.println(city);
			
		}
		 
		 //For iterate: có biến đếm, dùng để dừng vòng lặp khi không thỏa mãn điều kiện
		 //For kết hợp if: Thỏa mãn điều kiện mới action 
		 //Biến đếm: Dùng điều kiện để filter
		 for (int i = 0; i < cityName.length; i++) {
			 if (cityName[i].equals("Đà nẵng")) {
				 //action
				 System.out.println("Do action!");
				 //Có break là không kiếm tra các giá trị phía sau khi đã tìm thấy giá trị cần tìm.
				 //Không có beak thì sẽ chạy qua tất cả các giá trị dù đã tìm được giá trị thỏa mãn điều kiện
				 break;
				
			}
			
		}
		 
		
		 
	
	
}
	
	 @Test
		public void TC_02_ForEach() {
		 String[] cityName = {"Hà nội", "Đà nẵng","HCM", "Can tho"};
		 //Loại dữ liệu của vòng for phải cùng với loại dữ liệu của array
		 for (String city : cityName) {
			 System.out.println(city);
			
		}
		 
		 List<String> cityAddress = new ArrayList<String>();
		 System.out.println(cityAddress.size());
		 
		 
		 
		 //Add thêm dữ liệu vào list<string> khi:
		 //--> Khi Compile: trong quá trình coding
		 cityAddress.add("Bắc Giang");
		 cityAddress.add("Hà Giang");
		 cityAddress.add("Sa Pa");
		 cityAddress.add("Vũng Tàu");
		
		 System.out.println(cityAddress.size());
		 
		 
		 //--> Khi Running: Trong quá trinh chạy
		 for (String city : cityName) {
			 cityAddress.add(city);
	 }
		 System.out.println(cityAddress.size());
		 
		 
		 List<WebElement> links = driver.findElements(By.xpath("a"));
		 for (WebElement link : links) {
			 //Chuyển page -> Refresh DOM/HTML -> Ko còn tồn tại -> không tìm thấy link trong list List<WebElement> links StaleElementException
			
		}
}
}