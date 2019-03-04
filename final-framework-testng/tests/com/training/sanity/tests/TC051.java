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
import com.training.pom.TC051POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC051 {

	private WebDriver driver;
	private String baseUrl;
	private TC051POM tc051POM;
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
		tc051POM = new TC051POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
		
		
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		//To Enter Usernamein the login page//
		tc051POM.sendUserName("admin");
		Thread.sleep(1000);
		//To Enter Password the login page//
		tc051POM.sendPassword("123456");
		Thread.sleep(1000);
		//To Click LoginButton the login page//
		tc051POM.clickLoginBtn(); 
		Thread.sleep(1000);
		//To Click AdvertismentsLink in teh Home page//
		tc051POM.clickAdvertisementsLnk();
		Thread.sleep(1000);
		//To Click ManageCategories in the Home page//
		tc051POM.clickManageCategoriesLnk(); 
		Thread.sleep(1000);
		//To click SUbmit Button of Insert New Category in Advertisment Categories page//
		tc051POM.clickSubmitBtn(); 
	    Thread.sleep(1000);
	    //To Enter Name in the New Adverstisment Category Page//
		tc051POM.sendName("brandnew");
		Thread.sleep(1000);
		//To Click Submit Button in the New Adverstisment Category Page//
		tc051POM.clickSubmitBtn2(); 
		Thread.sleep(1000);
		//To Click Home Link in the Home Page//
		tc051POM.clickHomeLnk();
		Thread.sleep(1000);
		//To Enter MemberLogin the Home page//
		tc051POM.sendMemberLogin("Divya");
		Thread.sleep(1000);
		//To Click Submit Button of ManageAdvertisments in the profile pAGE//
		tc051POM.clickSubmitBtn3(); 
		Thread.sleep(1000);
		//To Click Submit button of Insert New advertisment in Adverstisments page of Member Login//
		tc051POM.clickSubmitBtn4(); 
		Thread.sleep(1000);
		//To Enter Tile  in the New advertisment page//
		tc051POM.sendTitle("new offer");
		Thread.sleep(1000);
		//To Click Category in the New advertisment page//
		tc051POM.clickCategory();
		Thread.sleep(1000);
		//To Click Category Dropdown as NewOffer in the New advertisment page//
		tc051POM.clicknewoffer();
		Thread.sleep(1000);
		//To Enter Price in the New advertisment page //
		tc051POM.sendPrice("50");
		//To Click Checkbox Not Expirable in the New advertisment page //
		tc051POM.clickNotExpirable();
		Thread.sleep(1000);
		//To Enter Description in the New advertisment page//
		tc051POM.sendDescription("new offer for member");
		Thread.sleep(1000);
		//To Click Submit Button in the New advertisment page//
		tc051POM.clickSubmitBtn5(); 
		Thread.sleep(1000);
		//To Click Back Button in the New advertisment page//
		tc051POM.clickBackBtn(); 
		
		//compare the actual title of the page with the expected one
		String Actual="Modify Advertisment Category";
		String Expected=driver.findElement(By.xpath("//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[1]/td[1]")).getText();
		Assert.assertEquals(Actual, Expected);
		
		
		screenShot.captureScreenShot("First");
		
	}
}
