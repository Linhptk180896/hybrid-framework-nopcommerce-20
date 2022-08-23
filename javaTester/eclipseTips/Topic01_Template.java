package eclipseTips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Topic01_Template {
	WebDriver driver;
	public void Topic_Template() {
		driver.findElement(By.xpath(null));
		driver.findElement(By.cssSelector(null));
		//invisible
//		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		//visible
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		//im
//		driver.manage().timeouts().implicitlyWait(, TimeUnit.SECONDS);

	}

}

