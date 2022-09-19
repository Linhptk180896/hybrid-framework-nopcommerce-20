package pageObject.wordpress.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerWordpress;
import pageUIs.wordpress.admin.AdminSearchPostPageUI;

public class AdminSearchPostPageObject extends BasePage {
	WebDriver driver;

	public AdminSearchPostPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public AdminAddNewPostPageObject clickOnAddNewButton() {
		waitForElementClickable(driver, AdminSearchPostPageUI.ADD_NEW_BUTTON);
		clickToElement(driver, AdminSearchPostPageUI.ADD_NEW_BUTTON);
		return PageGeneratorManagerWordpress.getAdminAddNewPostPage(driver);		
	}

	public boolean isNewPublishedPostIsDisplayed(String rowIndex, String columnName) {
		//1. Get index column depends on columnName
		int columnIndexByName = getElementSize(driver, AdminSearchPostPageUI.COLUMN_BY_NAME, columnName) + 1;
//		getElementText(driver, AdminSearchPostPageUI.DYNAMIC_VALUE_AT_COLUMN_NAME_AND_ROW_INDEX, rowIndex, String.valueOf(columnIndexByName));
		return isElementDisplayed(driver, AdminSearchPostPageUI.DYNAMIC_VALUE_AT_COLUMN_NAME_AND_ROW_INDEX, rowIndex, String.valueOf(columnIndexByName));
	}

}
