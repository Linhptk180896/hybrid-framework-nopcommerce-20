package javaException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionType {
	
	FirefoxDriver driver;
	
	@Test
	public void TC_01_NoSuchElement() {
		//Các ví dụ mẫu về exception đều ở trong doc
		System.out.println("Step 01");
		//1. No such element
		//Trên cùng 1 page mà không có
		//Trên cùng 1 page mà tìm element tại page khác
		//Trên cùng 1 page mà tìm element tại frame/iframe khác
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://live.techpanda.org/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Automation Testing']")).click();
		
	}
	
	@Test
	public void TC_02_NotInteractable_Equals_ElementNotVisible() {
		//Các ví dụ mẫu về exception đều ở trong doc
		System.out.println("Step 01");
		//1. No such element
		//Trên cùng 1 page mà không có
		//Trên cùng 1 page mà tìm element tại page khác
		//Trên cùng 1 page mà tìm element tại frame/iframe khác
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://live.techpanda.org/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='header-account']//a[text()='My Account']")).click();
		
	}
	@Test
	public void TC_03_Stale() {
		
	}
	@Test
	public void TC_04_NoAlertPresence() {
		driver.get("https://live.techpanda.org/index.php");
		driver.switchTo().alert().accept();
		
	}
	
	
	@Test
	public void TC_05_CssExp() {
		driver.get("https://live.techpanda.org/index.php");
		driver.findElement(By.cssSelector("//div[@id='header-account']//a[text()='My Account']")).click();
		
		
	}
	
	@Test
	public void TC_06_DisableExp() {
		driver.get("https://live.techpanda.org/index.php");
		driver.findElement(By.xpath("//input[@id='disable_password']")).sendKeys("acvbn");

		
	}
	
	@AfterClass
	public void AfterClass() {
		driver.quit();
	}

}
