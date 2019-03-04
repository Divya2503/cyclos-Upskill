package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TC052POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC052 {

	private WebDriver driver;
	private String baseUrl;
	private TC052POM tc052POM;
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
		tc052POM = new TC052POM(driver); 
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
	public void validLoginTest() throws InterruptedException{
		//To Enter UserName  in the Login Page//
		tc052POM.sendUserName("srujana");
		Thread.sleep(1000);
		//To Enter Password  in the Login Page//
		tc052POM.sendPassword("12345");
		Thread.sleep(1000);
		//To Cick Login Button  in the Login Page//
		tc052POM.clickLoginBtn(); 
		Thread.sleep(1000);
		//To Click Personal Link  in the Home Page//
		tc052POM.clickPersonalLnk(); 
		Thread.sleep(1000);
		//To Click Contacts Link  in the Home Page//
		tc052POM.clickContacts(); 
		Thread.sleep(1000);
		//To Enter Member   in the Home Page//
		tc052POM.sendMemberLogin("Divya"); 
		Thread.sleep(1000);
		//To Click Submit Button in the Home page //
		tc052POM.clickSubmitBtn();
		Thread.sleep(1000);
		//To Click AddedContact in the Contact List Page//
		tc052POM.clickAddedContact();
		Thread.sleep(1000);
		//To Click Submit button of Make a Payment Section in teh profile of added conatct Page//
		tc052POM.clickSubmit2();
		Thread.sleep(1000);
		//To Enter Amount in the Payment to Member Page//
		tc052POM.sendAmount("75");
		Thread.sleep(1000);
		//To Enter Description in the Payment to Member Page//
		tc052POM.sendDescription("text");
		Thread.sleep(1000);
		//To Click Submit Button  in the Payment to Member Page//
		tc052POM.clickSubmit3();
		Thread.sleep(1000);
		//To Click Submit Button in the  Transaction Confirmation page//
		tc052POM.clickSubmit4();
		Thread.sleep(1000);
		//To Click Logout  in the Home page
		tc052POM.clickLogout();
		Thread.sleep(1000);
		
		//compare the actual title of the page with the expected one//
        //assertions//
        
        String Expected1 ="The payment has been performed";
		String Expected = Expected1.replaceAll("\\s", "");
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		
		screenShot.captureScreenShot("First");
	}
}
