package eclipseTips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic_Debug {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	@Test
	public void TC01_Debug() {
		System.setProperty("webdriver.chrome.driver", projectPath +"\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String header = driver.findElement(By.xpath("//div[@id='globalContainer']//h2")).getText();
		Assert.assertEquals(header, "Facebook giúp bạn kết nối và chia sẻ với mọi người trong cuộc sống của bạn.");
		
		boolean loginStatus = driver.findElement(By.name("logi")).isDisplayed();
		Assert.assertTrue(loginStatus);
		
	}

}
