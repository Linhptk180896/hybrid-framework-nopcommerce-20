package javaBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commons.BaseTest;


@Listeners(commons.MethodListener.class)
public class Topic09_Assert extends BaseTest{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	@BeforeClass
	public void beforeClass() {
//		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = getBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	
	
	@Test
	public void TC_01_ValidateCurrentUrl() {
		System.out.println("Assert 01 - Pass");
		String loginPageUrl = driver.getCurrentUrl();
		verifyEquals(loginPageUrl, "https://www.facebook.com/");
	 
		System.out.println("Assert 02 - Failed");
		String loginPageTitle = driver.getTitle();
		verifyEquals(loginPageTitle, "Facebook � log in or sign up...");
	
		System.out.println("Assert 03 - Pass");
		verifyTrue(driver.findElement(By.xpath("//form[@data-testid='royal_login_form']")).isDisplayed());
		
		System.out.println("Assert 04 - Failed");
		verifyTrue(driver.findElement(By.xpath("//input[@name='login_source']")).isDisplayed());
		
		System.out.println("Assert 05 - Pass");
		verifyTrue(driver.findElement(By.xpath("//div[@id='reg_pages_msg']")).isDisplayed());
	}
	

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
