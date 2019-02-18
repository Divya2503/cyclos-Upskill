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
import com.training.pom.TC023POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC023 {

	private WebDriver driver;
	private String baseUrl;
	private TC023POM tc023POM;
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
		tc023POM = new TC023POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(14000);
		driver.quit();
	}
	@Test
	public void validLoginTest(){
		tc023POM.sendUserName("divya");
		tc023POM.sendPassword("12345");
		tc023POM.clickLoginBtn(); 
		tc023POM.clickAccountLnk(); 
		tc023POM.clickMbrPaymentLnk(); 
		tc023POM.sendRecepient("Srujana");
        tc023POM.sendamount("500");
        tc023POM.senddescription("Money sent");
        tc023POM.clickSubmitBtn();  
		screenShot.captureScreenShot("First");
	}
}

