package com.wordpress.posts;

import org.testng.annotations.Test;


import commons.BaseTest;
import commons.BaseTestWordPress;
import commons.PageGeneratorManager;
import commons.PageGeneratorManagerWordpress;
import pageObject.wordpress.admin.AdminAddNewPostPageObject;
import pageObject.wordpress.admin.AdminDashboardPageObject;
import pageObject.wordpress.admin.AdminLoginPageObject;
import pageObject.wordpress.admin.AdminSearchPostPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Post_01_Create_Read_Update_Delete_Search extends BaseTestWordPress{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String adminUsername = "linhptk" ;
	String adminPassword = "Linh1808/";
	String adminSearchPostUrl;
	int randomNumber = randomNumber();
	String postTitle = "Post title " + randomNumber;
	String postBody = "Post body " + randomNumber;
	AdminDashboardPageObject adminDashboardPage;
	AdminSearchPostPageObject adminSearchPostPage;
	AdminLoginPageObject adminLoginPageObject;
	AdminAddNewPostPageObject adminAddNewPostPage;
	@Parameters({"browserName","adminUrl"})
	@BeforeClass
	  public void beforeClass(String browserName, String adminUrl) {
		
		log.info("Pre-Condition - Step 01: Open browser and navigate to Admin login page ");
		driver = getBrowser(browserName, adminUrl);
		adminLoginPageObject= PageGeneratorManagerWordpress.getAdminLoginPage(driver);
		
		log.info("Pre-Condition - Step 02: Enter Email " + adminUsername);
		adminLoginPageObject.inputToEmailTextbox(adminUsername);
		
		log.info("Pre-Condition - Step 03: Enter Email " + adminPassword);
		adminLoginPageObject.inputToPasswordTextbox(adminPassword);
		log.info("Pre-Conditon - Step 04: Click on btn Login and navigate to Admin Dashboard Page");
		adminDashboardPage = adminLoginPageObject.clickOnLoginButton();
		
	  }
	
	
	@Test
	public void Post_01_Create_New_Post() {
		log.info("Step: 01: click on Post menu and navigate to Admin Search Post Page ");
		adminSearchPostPage = adminDashboardPage.clickOnPostMenu();
		
		log.info("Step 02: Get Admin Search Post Url");
		adminSearchPostUrl = adminSearchPostPage.getPageUrl(driver);
		
		log.info("Step 02: click on Add new  button and navigate to Admin New Post Page ");
		adminAddNewPostPage = adminSearchPostPage.clickOnAddNewButton();
		
		log.info("Step 05: Send key to Post title");
		adminAddNewPostPage.inputToPostTitle(postTitle);
		
		log.info("Step 06: Send key to Post body");
		adminAddNewPostPage.inputToPostBody(postBody);
		
		
		log.info("Step 07: Click on Pre-Publish button");
		adminAddNewPostPage.clickOnPrePublishButton();
		
		log.info("Step 08: Click on Publish button");
		adminAddNewPostPage.clickOnPublishButton();
		
		log.info("Step 09: Verify Post Published message is displayed");
		verifyTrue(adminAddNewPostPage.isPostPublishedMessageDisplayed());
		
	}
	
	
	@Test
	public void Post_02_Search_Post() {
		
		log.info("Step 01: Open Admin Search Post Page ");
		adminSearchPostPage = adminAddNewPostPage.openSearchPostPageUrl(adminSearchPostUrl);
		
		log.info("Step 02: Verify New published post is displayed ");
		adminSearchPostPage.isNewPublishedPostIsDisplayed("1","Title");	
	}
	
	@Test
	public void Post_03_View_Post() {
		
	}
	
	@Test
	public void Post_04_Edit_Post() {
		
	}
	
	  @AfterClass 
	  public void afterClass() {
		
	  }

}


//Lưu ý khi viết hàm
//1--Access Modifier: public/protected/default/private
//2--Kiểu dữ liệu trả về: public/void/String/boolean/...Kiểu dữ liệu trả về sẽ liên quan đến chức năng trong thân hàm
//3--Tên hàm: Đặt tên  tuân theo chức năng đang cần viết.Convention tuân theo chuẩn của ngôn ngữ lập trinh java (camelCase)
//4--Tham số: Có tham số hoặc không có tham số, tùy vào chức năng cần viết
//5--Return kiểu dữ liệu trả về cho hàm: Nếu có return dữ liệu thì sẽ khớp với kiểu dữ liệu ở ý 2. Và return là dòng cuối cùng để kết thúc hàm.
//----------------
//Abstract page/Base page: là 1 class dùng chung đã wrapper lại functions của selenium 
