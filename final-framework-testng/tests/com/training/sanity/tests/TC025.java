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
import com.training.pom.TC025POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC025 {

	private WebDriver driver;
	private String baseUrl;
	private TC025POM tc025POM;
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
		tc025POM = new TC025POM(driver); 
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
		tc025POM.sendUserName("divya");
		tc025POM.sendPassword("12345");
		tc025POM.clickLoginBtn(); 
		tc025POM.clickPersonalLnk(); 
		tc025POM.clickMessagesLnk(); 
		tc025POM.clickMovetoTrashLnk();
		screenShot.captureScreenShot("First");
	}
}
