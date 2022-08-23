package com.jquery.uploadFile;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTestUploadFiles;
import pageObjects.jQueryUploadFiles.HomePageUploadFileObject;
import pageObjects.jQueryUploadFiles.PageGeneratorManager;

public class Level_11_Upload_MultiFile extends BaseTestUploadFiles {
	WebDriver driver;
	HomePageUploadFileObject homePage;
	
	@Parameters({"browser","url"})
	@BeforeClass
	public void BeforeClass(String browserName, String appUrl) {
		driver = getBrowser(browserName, appUrl);
	}
	
	@Test
	public void TC_01_Upload_One_File() {
		String catFileName = "Cat.jpg";
		String cSharpFileName = "cSharp.jpg";
		String rubyName = "Ruby.jpg";
		homePage = PageGeneratorManager.getHomepage(driver);
		homePage.uploadMultipleFiles(driver, catFileName);
	}
		
	}



