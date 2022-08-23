package commons;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.jQueryUploadFiles.HomePageUploadFileObject;
import pageObjects.nopCommerce.admin.AdminLoginPageObject;
import pageObjects.nopCommerce.user.UserAddressPageObject;
import pageObjects.nopCommerce.user.UserCustomerInfoPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserMyProductReviewPageObject;
import pageObjects.nopCommerce.user.UserRewardPointPageObject;
import pageUIs.nopCommerce.user.BasePageUI;

public class BasePage {
	public static BasePage getBasePageObject() {
		return new BasePage();
	}
	
//--> Base Page:  sẽ bổ trợ cho cả package pageObjects. BasePage là 1 class sẽ chứa các hàm dùng chung cho pageObject
	//1--Hàm getUrl: nhiệm vụ mở 1 Url ra
	public void getUrl(WebDriver driver, String pageUrl) {
		driver.get(pageUrl);		
	}
	
	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public String getPageUrl(WebDriver driver ) {
		return driver.getCurrentUrl();
		
	}
	public String getSourceCode(WebDriver driver ) {
		return driver.getPageSource();
		
	}
	public void backToPage(WebDriver driver ) {
		driver.navigate().back();
		
	}
	public void forwardToPage(WebDriver driver ) {
		driver.navigate().forward();
		
	}
	public void refreshCurrentPage(WebDriver driver ) {
		driver.navigate().refresh();
		
	}
	
	
	public Alert waitForAlertPresence(WebDriver driver) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		return explicitWait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public void acceptAlert(WebDriver driver) {
		waitForAlertPresence(driver).accept();
	}
		
	public void cancelAlert(WebDriver driver) {
		waitForAlertPresence(driver).dismiss();
	}
	
	public String getAlertText(WebDriver driver) {
		return waitForAlertPresence(driver).getText();
	}
	
	public void switchToWindowById(WebDriver driver, String currentWindowId ) {
		//Lấy hết windowid
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String id : allWindowsId) {
			if(!id.equals(currentWindowId)) {
				driver.switchTo().window(id);
			}
		
		}
		
	}
	
	public void switchToWindowByTitle(WebDriver driver, String expectedTitle) {
		Set<String> allWindowId = driver.getWindowHandles();
		for (String id : allWindowId) {
				driver.switchTo().window(id);
				//Lấy title của page đó ra
				String actualTitle = driver.getTitle();
				if (actualTitle.equals(expectedTitle)) {
					//Thỏa mãn điều kiện là đúng cái page/tab mình cần thì break vòng lặp
					break;
				}
					
				}
				
			}
	
	public void closeAllWindowWithoutParent(WebDriver driver, String parentId) {
		Set<String> allWindowId = driver.getWindowHandles();
		for (String runningWindowId : allWindowId) {
			if (!runningWindowId.equals(parentId)) {
				driver.switchTo().window(parentId);
				driver.close();}
		}
		driver.switchTo().window(parentId);
}
	
//	private By getByXpath(String locatorType) {
//		return  By.xpath(locatorType);
//		
//	} --> Hàm getByXpath này sẽ không dùng nữa
	
	private By getByLocator(String locatorType) {
		By by = null;
		System.out.println("Locator type = " + locatorType);
		if (locatorType.startsWith("id=") ||locatorType.startsWith("ID=") || locatorType.startsWith("Id=")) {
			by = By.id(locatorType.substring(3));
			System.out.println("By = " + by);
		}
		else if (locatorType.startsWith("class=") || locatorType.startsWith("CLASS=")|| locatorType.startsWith("Class=")) {
			by = By.className(locatorType.substring(6));
			System.out.println("By = " + by);
		}
		else if (locatorType.startsWith("name=") || locatorType.startsWith("NAME=") || locatorType.startsWith("Name=")) {
			by = By.name(locatorType.substring(5));
			System.out.println("By = " + by);
		}
		else if (locatorType.startsWith("css=") || locatorType.startsWith("CSS=") || locatorType.startsWith("Css=")) {
			by = By.cssSelector(locatorType.substring(4));
			System.out.println("By = " + by);
		}
		else if (locatorType.startsWith("xpath=") || locatorType.startsWith("XPATH=") || locatorType.startsWith("Xpath=")) {
			by = By.xpath(locatorType.substring(6));
			System.out.println("By = " + by);
		}
		else {
			throw new RuntimeException("Locator type  is not supported");
		}
		
		return by;
	}
	
	private String getDynamicXpath(String locatorType, String...dynamicValues) {
		System.out.println("Locator Type Before " + locatorType);
		if (locatorType.startsWith("xpath=") || locatorType.startsWith("XPATH=") || locatorType.startsWith("Xpath=")) {
			locatorType = String.format(locatorType, (Object[]) dynamicValues);
			
		}
//		for (String value : dynamicValues) {
//			System.out.println("Locator Type Before " + value);
//		}
//		
//		System.out.println("Locator Type After " + locatorType);
		return locatorType;
	}
	
	public  WebElement getWebElement(WebDriver driver, String locatorType) {
		return driver.findElement(getByLocator(locatorType));
	} //đã thay = getByLocator
	
	public  WebElement getWebElement(WebDriver driver, String locatorType, String...dynamicValues) {
		return driver.findElement(getByLocator(getDynamicXpath(locatorType, dynamicValues)));
	} //đã thay = getByLocator
	
	public List<WebElement> getListWebElement(WebDriver driver, String locatorType){
		return driver.findElements(getByLocator(locatorType));
	} //đã thay = getByLocator
	
	public void clickToElement(WebDriver driver, String locatorType) {
		getWebElement(driver, locatorType).click();
	}

	public void clickToElement(WebDriver driver, String locatorType, String...dynamicValues) { 
		getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).click();
	}
	
	public void sendKeyToElement(WebDriver driver, String locatorType, String textValue) {
		WebElement element = getWebElement(driver, locatorType);
		element.clear();
		element.sendKeys(textValue);
	}
	
	public void sendKeyToElement(WebDriver driver, String locatorType, String textValue, String...dynamicValues ) {
		WebElement element = getWebElement(driver, getDynamicXpath(locatorType, dynamicValues));
		element.clear();
		element.sendKeys(textValue);
	}
	
	public String getElementText(WebDriver driver, String locatorType) {
		return getWebElement(driver, locatorType).getText();
	}
	
	public String getElementText(WebDriver driver, String locatorType, String...dynamicValues) {
		return getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).getText();
	}
	
	public void selectItemInDefaultDropdown(WebDriver driver, String locatorType, String textItem) {
		Select select = new Select(getWebElement(driver, locatorType));
		select.selectByVisibleText(textItem);
		
	}
	
	public void selectItemInDefaultDropdown(WebDriver driver, String locatorType, String textItem, String...dynamicValues) {
		Select select = new Select(getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)));
		select.selectByVisibleText(textItem);
		
	}
	
	public String getSelectedItemInDefaultDropdown(WebDriver driver, String locatorType) {
		Select select = new Select(getWebElement(driver, locatorType));
		return select.getFirstSelectedOption().getText();
		
	}
	public String getSelectedItemInDefaultDropdown(WebDriver driver, String locatorType, String...dynamicValues) {
		Select select = new Select(getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)));
		return select.getFirstSelectedOption().getText();
		
	}
	
	public boolean isDropdownMultiple(WebDriver driver, String locatorType) {
		Select select = new Select(getWebElement(driver, locatorType));
		return select.isMultiple();
		
	}
	
	public void selectItemInCustomDropdownList(WebDriver driver,String parentLocator, String childLocator, String expectedTextItem) {
		getWebElement(driver, parentLocator).click();
//		sleepInSecond(5);
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getByLocator(childLocator))); // đã thay = getByLocator
		List<WebElement> allItems = driver.findElements(By.cssSelector(childLocator));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		for (WebElement item : allItems) {
			String actualText = item.getText();	
			if (actualText.equals(expectedTextItem)) {
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", item);
				item.click();
				sleepInSecond(2);
				break;
			}
			
		}
	}
	
	public void selectItemInCustomDropdownList(WebDriver driver,String parentLocatorType, String childLocatorType, String expectedTextItem, String...dynamicValues) {
		getWebElement(driver, getDynamicXpath(parentLocatorType, dynamicValues)).click();
//		sleepInSecond(5);
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getByLocator(getDynamicXpath(childLocatorType, dynamicValues)))); // đã thay = getByLocator
		List<WebElement> allItems = driver.findElements(getByLocator(getDynamicXpath(childLocatorType, dynamicValues)));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		for (WebElement item : allItems) {
			String actualText = item.getText();	
			if (actualText.equals(expectedTextItem)) {
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", item);
				item.click();
				sleepInSecond(2);
				break;
			}
		
		}
	}
	
	public void sleepInSecond(long time) {
		try {
			Thread.sleep(time*100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getElementAttribute(WebDriver driver,String locatorType, String attributeName) {
		return getWebElement(driver, locatorType).getAttribute(attributeName);
		
	}
	
	public String getCssValue(WebDriver driver,String locatorType, String propertyName) {
		return getWebElement(driver, locatorType).getCssValue(propertyName);
		
	}
	
	public String getHexaColorFromRgba(String rgbaValue) {
		return Color.fromString(rgbaValue).asHex();
				
	}
	
	public int getElementSize(WebDriver driver, String locatorType){
		return getListWebElement(driver, locatorType).size();
	}
	public int getElementSize(WebDriver driver, String locatorType, String...dynamicValues){
		return getListWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).size();
	}
	
	public void checkToDefaultCheckboxRadio(WebDriver driver, String locatorType) {
		WebElement element = getWebElement(driver, locatorType);
		if (!isElementSelected(driver, locatorType)) {
			element.click();	}
	}
	public void checkToDefaultCheckboxOrRadio(WebDriver driver, String locatorType, String...dynamicValues) {
		WebElement element = getWebElement(driver, getDynamicXpath(locatorType, dynamicValues));
		if (!isElementSelected(driver, getDynamicXpath(locatorType, dynamicValues))) {
			element.click();	}
	}
	public void unCheckToDefaultCheckbox(WebDriver driver, String locatorType, String...dynamicValues) {
		WebElement element = getWebElement(driver, getDynamicXpath(locatorType, dynamicValues));
		if (isElementSelected(driver, getDynamicXpath(locatorType, dynamicValues))) {
			element.click();	}
}
	
	public boolean isElementDisplayed(WebDriver driver, String locatorType) {
		return getWebElement(driver, locatorType).isDisplayed();
		
	}
	public boolean isElementDisplayed(WebDriver driver, String locatorType, String... dynamicValues) {
		return getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).isDisplayed();
	
}
	public boolean isElementEnabled(WebDriver driver, String locatorType) {
		return getWebElement(driver, locatorType).isEnabled();
	
	}
	public boolean isElementSelected(WebDriver driver, String locatorType) {
		return getWebElement(driver, locatorType).isSelected();
		
	}
	public boolean isElementSelected(WebDriver driver, String locatorType, String...dynamicValues) {
	return getWebElement(driver, getDynamicXpath(locatorType, dynamicValues)).isSelected();
		
	}
	
	public void switchToFrameIframe(WebDriver driver, String locatorType) {
		driver.switchTo().frame(getWebElement(driver, locatorType));
	}
	
	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void hoverMouseToElement(WebDriver driver, String locatorType ) {
		Actions action = new Actions(driver);
		action.moveToElement(getWebElement(driver, locatorType)).perform();
	}
	

	public void scrollToBottomPage(WebDriver driver) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}


	public void hightlightElement(WebDriver driver, String locatorType) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement element = getWebElement(driver, locatorType);
		String originalStyle = element.getAttribute("style");
		jsExecutor.executeScript("arguments[0].setAttribute('style', arguments[1])", element, "border: 2px solid red; border-style: dashed;");
		sleepInSecond(3);
		jsExecutor.executeScript("arguments[0].setAttribute('style', arguments[1])", element, originalStyle);
	}

	public void clickToElementByJS(WebDriver driver, String locatorType) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", getWebElement(driver, locatorType));
	}

	public void scrollToElementOnTop(WebDriver driver, String locatorType) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", getWebElement(driver, locatorType));
	}

	public void scrollToElementOnDown(WebDriver driver, String locatorType) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(false);", getWebElement(driver, locatorType));
	}

	

	public void removeAttributeInDOM(WebDriver driver, String locatorType, String attributeRemove) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].removeAttribute('" + attributeRemove + "');", getWebElement(driver, locatorType));
	}
	
	public boolean areJQueryAndJSLoadedSuccess(WebDriver driver) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebDriverWait explicitWait;
		explicitWait = new WebDriverWait(driver, longTimeout);
		
		ExpectedCondition<Boolean>jQueryLoad = 	new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				
				return (Boolean) jsExecutor.executeScript("return(window.jQuery!=null)&&(jQuery.active ===0);");
			}					
		};
			ExpectedCondition<Boolean> jsLoad = 	new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				
				return jsExecutor.executeScript("return document.readyState").toString().equals("complete");
			}					
		};
		return explicitWait.until(jQueryLoad) && explicitWait.until(jsLoad);
		
	}
	
	public String getElementValidationMessage(WebDriver driver, String locatorType) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		return (String) jsExecutor.executeScript("return arguments[0].validationMessage;", getWebElement(driver, locatorType));
	}

	public boolean isImageLoaded(WebDriver driver, String locatorType) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		boolean status = (boolean) jsExecutor.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != 'undefined' && arguments[0].naturalWidth > 0", getWebElement(driver, locatorType));
		if (status) {
			return true;
		}
		return false;

}
	
	public void waitForElementVisible(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByLocator(locatorType))); //đã thay bằng getByLocator
	}		
	public void waitForElementVisible(WebDriver driver, String locatorType,String... dynamicValues) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByLocator(getDynamicXpath(locatorType, dynamicValues)))); //đã thay bằng getByLocator
}		
	
	
	public void waitForElementInvisible(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(getByLocator(locatorType)));//đã thay bằng getByLocator
	}	
	public void waitForElementInvisible(WebDriver driver, String locatorType, String... dynamicValues) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(getByLocator(getDynamicXpath(locatorType, dynamicValues))));//đã thay bằng getByLocator
}	
	
	
	public void waitForAllElementVisible(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(getByLocator(locatorType))); //đã thay bằng getByLocator
	}
	public void waitForAllElementVisible(WebDriver driver, String locatorType, String... dynamicValues) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(getByLocator(getDynamicXpath(locatorType, dynamicValues)))); //đã thay bằng getByLocator
}
	
	public void waitForAllElementInvisible(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.invisibilityOfAllElements(getListWebElement(driver, locatorType)));
	}
	public void waitForAllElementInvisible(WebDriver driver, String locatorType,String... dynamicValues) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.invisibilityOfAllElements(getListWebElement(driver, getDynamicXpath(locatorType, dynamicValues))));
}
	
	public void waitForElementClickable(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.elementToBeClickable(getByLocator(locatorType))); // đã thay bằng getByLocator
	}
	public void waitForElementClickable(WebDriver driver, String locatorType, String... dynamicValues) {
		WebDriverWait explicitWait = new WebDriverWait(driver, longTimeout);
		explicitWait.until(ExpectedConditions.elementToBeClickable(getByLocator(getDynamicXpath(locatorType, dynamicValues)))); // đã thay bằng getByLocator
}
	
	//Tối ưu ở bài Switch Pages
	public UserAddressPageObject openAddressPage(WebDriver driver) {
		waitForElementClickable(driver, BasePageUI.ADDRESS_LINK);
		clickToElement(driver, BasePageUI.ADDRESS_LINK);
		return PageGeneratorManager.getAddressPage(driver);
	}
	public UserMyProductReviewPageObject openMyProductReviewPage(WebDriver driver) {
		waitForElementClickable(driver, BasePageUI.MY_PRODUCT_REVIEW_LINK);
		clickToElement(driver, BasePageUI.MY_PRODUCT_REVIEW_LINK);
		return PageGeneratorManager.getMyProductReviewPage(driver);
	}
	public UserRewardPointPageObject openRewardPointPage(WebDriver driver) {
		waitForElementClickable(driver, BasePageUI.REWARD_POINT_LINK);
		clickToElement(driver, BasePageUI.REWARD_POINT_LINK);
		return PageGeneratorManager. getRewardPointPage(driver);
		
	}
	public UserCustomerInfoPageObject openCustomerInfoPage(WebDriver driver) {
		waitForElementClickable(driver, BasePageUI.CUSTOMER_INFO_LINK);
		clickToElement(driver, BasePageUI.CUSTOMER_INFO_LINK);
		return PageGeneratorManager.getCustomerInfoPage(driver);
		
	}
	
	//Tối ưu ở bài dynamic locator
	public void openPagesAtMyAccountByPageName(WebDriver driver, String pageName ) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA, pageName);
		clickToElement(driver, BasePageUI.DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA, pageName);
		
	}
	public BasePage openPagesAtMyAccountByName(WebDriver driver, String pageName ) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA, pageName);
		clickToElement(driver, BasePageUI.DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA, pageName);
		switch (pageName) {
		case "Addresses": {
			return PageGeneratorManager.getAddressPage(driver);
		}
		case "Reward points": {
			return PageGeneratorManager.getRewardPointPage(driver);
		}
		case "My product reviews": {
			return PageGeneratorManager.getMyProductReviewPage(driver);
		}
		case "Customer info": {
			return PageGeneratorManager.getCustomerInfoPage(driver);
		}
		default:
			throw new RuntimeException("Invalid Page Name At My Account Area");
		}
	}
	
	public void uploadMultipleFiles(WebDriver driver, String...fileNames ) { 
		String filePath = GlobalConstans.UPLOAD_FILE;
		String fileFullName ="";
		for (String file : fileNames) {
			fileFullName = fileFullName + filePath + file + "\n"; 
			System.out.println("File = " + file);
			System.out.println("Before trim: = "+ fileFullName);
			
		}
		fileFullName.trim();
		System.out.println("After trim: = "+fileFullName);
		getWebElement(driver, BasePageUI.INPUT_UPLOAD_FILE).sendKeys(fileFullName);;
		System.out.println("sendKey = "+fileFullName);
		
	}
	
	//---------- Switch Role-------------
	//Vì ở bất kỳ màn hình nào cũng thấy hàm logout và có thể tương tác lên nó  nên sẽ để ở màn basepage
	public UserHomePageObject  clickToLogOutLinkAtUserPage(WebDriver driver) {
		waitForElementClickable(driver, BasePageUI.LOGOUT_LINK_AT_USER);
		clickToElement(driver, BasePageUI.LOGOUT_LINK_AT_USER);
		return PageGeneratorManager.getHomePage(driver);
		
	}
	
	public AdminLoginPageObject clickToLogOutLinkAtAdminPage(WebDriver driver) {
		waitForElementClickable(driver, BasePageUI.LOGOUT_LINK_AT_ADMIN);
		clickToElement(driver, BasePageUI.LOGOUT_LINK_AT_ADMIN);
		return PageGeneratorManager.getAdminLoginPageObject(driver);
	}
	
	private long longTimeout = GlobalConstans.LONG_TIMEOUT;
	private long shortTimeout = GlobalConstans.SHORT_TIMEOUT;
	
	public int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(999);
	}
}