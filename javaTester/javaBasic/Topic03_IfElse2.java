package javaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic03_IfElse2 {
	String projectPath = System.getProperty("user.dir");
	WebDriver driver;
	@Test
	public void TC01_If_Else() {
		//Có tới 2 điều kiện: Nếu đúng thì vào if, sai thì vào else
		
		//Nếu driver start với browser như Chrome/safari/firefox thì dùng hàm click thông thường
		
		
		//Nếu driver start với browser như IE thì dùng hàm click jsexecutor
		
		
		
		// IE
//		System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();
//		driver.manage().window().maximize();
		// Chrome
//		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		System.out.println(driver.toString());
//		
//		if(driver.toString().contains("internet explorer")) {
//			System.out.println("Click by JS");
//			
//		}
//		else {
//			System.out.println("Click by selenium driver");
//		}
	}
//	
	
	@Parameters("browsers")
	@Test
	public void TC01_If_Else_If_Else(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe" );
			driver = new ChromeDriver();		
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe" );
			driver = new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe" );
			driver = new InternetExplorerDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe" );
			driver = new EdgeDriver();
			
		}
		else{
			throw new RuntimeException("please input correct the browser name");
			
		}
		System.out.println(browserName);
		System.out.println(driver.toString());
		driver.quit();
		}
		
	@Test
	public void TC02_If_Else_If_Else() {
		//Page Object
		//Dynamic page
		String pageName = "Login";
		if (pageName.equals("Login")) {
//			LoginPage = new LoginPage();
			//return LoginPage;
			
		}
		else if (pageName.equals("Register")) {
//			RegisterPage = new RegisterPage();
			//return RegisterPage;
		
	}
		else if (pageName.equals("New Customer")) {
//			NewCustomerPage = new NewCustomerPage();
			//return NewCustomerPage;
		
	}
		
	}
	
	@Test
	public void TC03_If_Else_If_Else() {
	
	int age = 20;
	String access = (age<18)? "You can not access":"Welcome";
	 if (age<18) {
		 access = "You can not access";
		
	} else {
		access = "Welcome";
	}
	
	
	}
}
