package javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic03_IfElse {
	int number = 8;

	public static void main(String[] args) {
		//--> Điều kiện if thì cần condition là boolean
		boolean status = 5 > 3;
		System.out.println(status);
		// Hàm if sẽ nhận vào 1 điều kiện đúng 
		if (status) {
			//Đúng thì vào phần thân của if 
			//Sai thì bỏ qua 
			System.out.println("Go to if");
		
		}
		WebDriver driver = new ChromeDriver();
		WebElement salePopup = driver.findElement(By.id(""));
		//Element luôn có trong DOM dù popup có hiển thị hay không
		if (salePopup.isDisplayed()) {
			
		}
		// Element không có trong DOM khi popup không hiển thị 
		List<WebElement> salePopups = driver.findElements(null);
		if (salePopups.size()>0 && salePopups.get(0).isDisplayed()) {
			
		//Phủ định: Element luôn có trong DOM dù popup có hiển thị hay không
			if (!salePopup.isDisplayed()) {
				
			}	
		
		//Gán (assign)
		int number = 10;
		//So sánh
		status = (number == 10);
		System.out.println(status);
		};
		
		//uncheck to checkbox
		WebElement checkbox = driver.findElement(By.id(""));
		if (checkbox.isSelected()) {
			checkbox.click();
			
		}
		
		//Check to checkbox
				
		if (!checkbox.isSelected()) {
					checkbox.click();
					
				}
		
		//---------------------------
		//If else có tới 2 điều kiện: Nếu đúng thì vào if sai thì vào else
		
		
}
}