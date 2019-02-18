package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TC024POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC024 {

	private WebDriver driver;
	private String baseUrl;
	private TC024POM tc024POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		tc024POM = new TC024POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(9000);
		driver.quit();
	}
	@Test
	public void validLoginTest(){
		tc024POM.sendUserName("divya");
		tc024POM.sendPassword("12345");
		tc024POM.clickLoginBtn(); 
		tc024POM.clickPersonalLnk(); 
		tc024POM.clickMessagesLnk(); 
		tc024POM.clickViewMessagesLnk(); 
		screenShot.captureScreenShot("First");
	}
}
