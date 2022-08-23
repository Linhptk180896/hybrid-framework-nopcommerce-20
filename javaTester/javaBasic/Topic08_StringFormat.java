package javaBasic;

import org.testng.annotations.Test;

public class Topic08_StringFormat {
	public  static final String ADDRESS_LINK = "Xpath=//div[@class='side-2']//a[text()='Addresses']/parent::li";
	public static final String REWARD_POINT_LINK = "XPATH=//div[@class='side-2']//a[text()='Reward points']/parent::li";
	public static final String MY_PRODUCT_REVIEW_LINK = "xpath=//div[@class='side-2']//a[text()='My product reviews']/parent::li";
	public static final String CUSTOMER_INFO_LINK = "xpath=//div[@class='side-2']//a[text()='Customer info']/parent::li";
	
	public static  String DYNAMIC_SIDE_BAR_LINK_BY_PAGE_NAME ="xpath=//div[@class='side-2']//a[text()='%s']/parent::li";
	
	
	public static  String DYNAMIC_LINK_BY_PAGE_NAME ="xpath=//div[contains(@class,'%s')]//a[text()='%s']/parent::li";
	//Hàm có 1 tham số động
	public static void clickToLink(String dynamicLocator, String pageName) {
		String locator = String.format(dynamicLocator, pageName);
		System.out.println("Locator " + locator);
	}	
	//hàm có 2 tham số động 
	public static void clickToLink(String dynamicLocator,String areaName ,String pageName) {
		String locator = String.format(dynamicLocator, areaName, pageName);
		System.out.println("Locator " + locator);
	}	
	
	//Hàm có n tham số động
	public static void clickToLink(String dynamicLocator, String...params) {
		String locator = String.format(dynamicLocator, (Object[]) params);
		System.out.println("Locator " + locator);
	}	
	public static void main (String[] args) {
		clickToLink(DYNAMIC_SIDE_BAR_LINK_BY_PAGE_NAME, "Addresses");
		clickToLink(DYNAMIC_SIDE_BAR_LINK_BY_PAGE_NAME, "Reward points");
		clickToLink(DYNAMIC_SIDE_BAR_LINK_BY_PAGE_NAME, "My product reviews");
		clickToLink(DYNAMIC_SIDE_BAR_LINK_BY_PAGE_NAME, "Customer info");
		
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "footer-upper","Addresses");
}
	
	
}