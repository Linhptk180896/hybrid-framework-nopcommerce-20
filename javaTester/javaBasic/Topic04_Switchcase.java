package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic04_Switchcase {
	String projectPath = System.getProperty("user.dir");
	WebDriver driver;
	Scanner scan = new Scanner(System.in);
	
//--> Dùng  break để kết thúc vòng lặp
//	@Parameters("browser")
//	@Test
//	public void TC_01_SwitchCase() {
//		switch ("browser") {
//		case "chrome": {
//			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe" );
//			driver = new ChromeDriver();
//			break;
//		}
//		case "firefox": {
//			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\chromedriver.exe" );
//			driver = new FirefoxDriver();
//			break;
//		}
//		case "ie": {
//			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\chromedriver.exe" );
//			driver = new InternetExplorerDriver();
//			break;
//		}
//		case "edge": {
//			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\chromedriver.exe" );
//			driver = new EdgeDriver();
//			break;
//		}
//			
//		default:
//			throw new RuntimeException("Nhập lại browser");
//		}
//		
//	}
	
//--> Dùng return để kết thúc vòng lặp
	
//	@Parameters("browsers")
//	@Test
//	public void TC_02_Ham(String a) {
//		driver = getBrowserDriver(a);
//		System.out.println(a);
//		System.out.println(driver.toString());
//		driver.quit();
//	}
//	
//	public WebDriver getBrowserDriver(String browserName) {
//		switch (browserName) {
//		case "chrome": {
//			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe" );
//			return new ChromeDriver();
//			
//		}
//		case "firefox": {
//			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe" );
//			return new FirefoxDriver();
//		}
//		case "ie": {
//			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe" );
//			return new InternetExplorerDriver();
//			
//		}
//		case "edge": {
//			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe" );
//			return new EdgeDriver();
//		
//		}
//			
//		}
//		return driver;
//		
//	}
	
	@Test
	public void TC02_BT7() {
		int month = scan.nextInt();
		switch (month) {
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: 
			
			System.out.println("Tháng " + month +" có 31 ngày");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng " + month +" có 30 ngày");
			break;
			
		case 2:
			System.out.println("Tháng " + month +" có 29 ngày");
			break;
		default:
			System.out.println("Tháng " + month +" sai định dạng");
			break;
			
		}
		
		
		}
		
	@Test
	public void TC02_BT8() {
		int month = scan.nextInt();
	
		
		
	
}}



