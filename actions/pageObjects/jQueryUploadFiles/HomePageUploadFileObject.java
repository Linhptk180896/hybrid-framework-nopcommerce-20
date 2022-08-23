package pageObjects.jQueryUploadFiles;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class HomePageUploadFileObject extends BasePage {
	//Tạo constructor để new driver khi gọi hàm trong class LoginPageObject
	WebDriver driver;
	public HomePageUploadFileObject(WebDriver driver) {
		this.driver = driver;
	}
	
	

}
