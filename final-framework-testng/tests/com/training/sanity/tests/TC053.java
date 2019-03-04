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
import com.training.pom.TC053POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC053 {

	private WebDriver driver;
	private String baseUrl;
	private TC053POM tc053POM;
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
		tc053POM = new TC053POM(driver); 
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
	public void validLoginTest() throws InterruptedException{
		//To Enter UserName in the Login page//
		tc053POM.sendUserName("admin");
		Thread.sleep(1000);
		//To Enter Password in the Login page//
		tc053POM.sendPassword("123456");
		Thread.sleep(1000);
		//To Click Login Button in the Login page//
		tc053POM.clickLoginBtn(); 
		Thread.sleep(1000);
		//To Click UserandGroups Link in the Home page//
		tc053POM.clickUserandGroupsLnk(); 
		Thread.sleep(1000);
		//To Click LoansGroups Link in the Home page//
		tc053POM.clickLoanGroupsLnk(); 
		Thread.sleep(1000);
		//To Click SUbmit Button in the Search Loan Groups page//
		tc053POM.clickSubmitBtn(); 
		Thread.sleep(1000);
		//To Enter Group Name in the New Loan Group page//
		tc053POM.sendloanGroupname("ravi");
		Thread.sleep(1000);
		//To Enter Description in the New Loan Group page//
		tc053POM.sendloanGroup2("ravis loan");
		Thread.sleep(1000);
		//To Click Submit Button in the Login page//
		tc053POM.clickSubmitBtn2();
		Thread.sleep(1000);
		//To Click Modify Link in the Search Loan Groups page//
		tc053POM.clickModifyLnk();
		Thread.sleep(1000);
		//To Enter MemberLogin in the Modify Loan Group page//
		tc053POM.sendMemberLogin1("Divya");
		Thread.sleep(1000);
		//To Enter Full Name in the Modify Loan Group page//
		tc053POM.sendFullName("Divya Nandimalla");
		Thread.sleep(1000);
		//To Click Add Button in the Modify Loan Group page//
		tc053POM.clickAddBtn();
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
