package pageObject.wordpress.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerWordpress;
import pageUIs.wordpress.admin.AdminAddPostPageUI;

public class AdminAddNewPostPageObject  extends BasePage{
	WebDriver driver;

	public AdminAddNewPostPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToPostTitle(String postTitle) {
		waitForElementVisible(driver, AdminAddPostPageUI.POST_TITLE);
		sendKeyToElement(driver, AdminAddPostPageUI.POST_TITLE, postTitle);
		
	}

	public void inputToPostBody(String postBody) {
		//CLICK
		waitForElementClickable(driver, AdminAddPostPageUI.POST_BODY_BEFORE_CLICK);
		clickToElement(driver, AdminAddPostPageUI.POST_BODY_BEFORE_CLICK);
		//SENDKEY
		waitForElementVisible(driver, AdminAddPostPageUI.POST_BODY_AFRER_CLICK);
		sendKeyToElement(driver, AdminAddPostPageUI.POST_BODY_AFRER_CLICK, postBody);		
	}

	public void clickOnPrePublishButton() {
		waitForElementClickable(driver, AdminAddPostPageUI.PRE_PUBLISH_BUTTON);
		clickToElement(driver, AdminAddPostPageUI.PRE_PUBLISH_BUTTON);
	}

	public void clickOnPublishButton() {
		waitForElementClickable(driver, AdminAddPostPageUI.PUBLISH_BUTTON);
		clickToElement(driver, AdminAddPostPageUI.PUBLISH_BUTTON);		
	}

	public boolean isPostPublishedMessageDisplayed() {
		waitForElementVisible(driver, AdminAddPostPageUI.POST_PUBLISHED_MESSAGE);
		return isElementDisplayed(driver, AdminAddPostPageUI.POST_PUBLISHED_MESSAGE);
	}

	public AdminSearchPostPageObject openSearchPostPageUrl(String adminSearchPostUrl) {
		getUrl(driver, adminSearchPostUrl);
		return PageGeneratorManagerWordpress.getAdminSearchPostPage(driver);
	}

}
