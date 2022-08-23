package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.user.UserRegisterPageUI;

//pageObject chứa các actions muốn thực hiện trong 1 page
public class UserRegisterPageObject extends BasePage{
 private WebDriver driver;
 
 	public UserRegisterPageObject(WebDriver driver) {
 		this.driver = driver;
 	}
 
	public UserRegisterPageObject clickToRegisterButton() {
		waitForElementClickable(driver,UserRegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, UserRegisterPageUI.REGISTER_BUTTON);
//		return new HomePageObject(driver) --> Không khởi tạo như này nữa mà gọi qua hàm ở PageGeneratorManager
		return PageGeneratorManager.getRegisterPage(driver);
	}

	public String getErrorMesssageAtFirstNameTextbox() {
		waitForAllElementVisible(driver, UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMesssageAtLastNameTextbox() {
		waitForAllElementVisible(driver, UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMesssageAtEmailTextbox() {
		waitForAllElementVisible(driver, UserRegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMesssageAtPasswordTextbox() {
		waitForAllElementVisible(driver, UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getErrorMesssageAtConfirmPasswordTextbox() {
		waitForAllElementVisible(driver, UserRegisterPageUI.CONFRIM_PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.CONFRIM_PASSWORD_ERROR_MESSAGE);
	}

	public void inputToFirstNameTextbox(String firstName) {
		waitForElementClickable(driver, UserRegisterPageUI.FIRSTNAME_TEXTBOX);
		sendKeyToElement(driver, UserRegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
	}

	public void inputToLastNameTextbox(String lastName) {
		waitForElementClickable(driver, UserRegisterPageUI.LASTNAME_TEXTBOX);
		sendKeyToElement(driver, UserRegisterPageUI.LASTNAME_TEXTBOX, lastName);
		
	}

	public void inputToEmailTextbox(String emailAddress) {
		waitForElementClickable(driver, UserRegisterPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, UserRegisterPageUI.EMAIL_TEXTBOX, emailAddress);
		
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementClickable(driver, UserRegisterPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, UserRegisterPageUI.PASSWORD_TEXTBOX, password);
		
	}

	
	public void inputToConfirmPasswordTextbox(String confirmPassword) {
		waitForElementClickable(driver, UserRegisterPageUI.CONFIRM_PASSWORD);
		sendKeyToElement(driver, UserRegisterPageUI.CONFIRM_PASSWORD, confirmPassword);
		
	}

	public String getRegisterSuccessMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public UserHomePageObject clickToLogoutButton() {
		waitForElementClickable(driver, UserRegisterPageUI.LOGOUT_LINK);
		clickToElement(driver, UserRegisterPageUI.LOGOUT_LINK);
		return PageGeneratorManager.getHomePage(driver);
	}

	public String getErrorExistingEmailMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
	}

}
