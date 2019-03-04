package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TC055POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC055 {

	private WebDriver driver;
	private String baseUrl;
	private TC055POM tc055POM;
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
		tc055POM = new TC055POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	/*@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	@Test
	public void validLoginTest() throws InterruptedException{
		
		//To Clcik Submit Button in the Login page  //
		tc055POM.clickSubmitBtn(); 
		//To Enter Member in the Member Registration Page  //
		tc055POM.sendMember("param9");
		//To Enter Full Name in the Member Registration Page  //
		tc055POM.sendFullName("param9 band"); 
		Thread.sleep(1000);
		//To Enter Email in the Member Registration Page  //
		tc055POM.sendEmail("param9@gmail.com");  
		Thread.sleep(1000);
		//To Click Calender Icon in the Member Registration Page  //
		tc055POM.clickCalenderIcon(); 
		Thread.sleep(1000);
		//To Enter Birthday in the Member Registration Page  //
		tc055POM.sendBirthday("25031990");
		Thread.sleep(1000);
		//To Enter Gender in the Member Registration Page  //
		tc055POM.clickGender();
		//To Enter Address in the Member Registration Page  //
		tc055POM.sendAddress("Hyd");
		Thread.sleep(1000);
		//To Enter Postal Code in the Member Registration Page  //
        tc055POM.sendPostalCode("500079");
        Thread.sleep(1000);
        //To Enter City in the Member Registration Page  //
        tc055POM.sendCity("Hanuman Nagr");
        Thread.sleep(1000);
        //To Click Area in the Member Registration Page  //
        tc055POM.clickArea();
        Thread.sleep(1000);
        //To  Click Area Option in the Member Registration Page  //
        tc055POM.clickAreaOption();
        Thread.sleep(1000);
        //To Enter Phone in the Member Registration Page  //
        tc055POM.sendPhone("8765432190");
        Thread.sleep(1000);
        //To Enter MobilePhone in the Member Registration Page  //
        tc055POM.sendMobilePhone("8011117380");
        Thread.sleep(1000);
        //To Enter Fax in the Member Registration Page  //
        tc055POM.sendFax("7684593383");
        Thread.sleep(1000);
        //To Enter URL in the Member Registration Page  //
        tc055POM.sendURL("www.google.com");
        Thread.sleep(1000);
        //To Enter Password in the Member Registration Page  //
        tc055POM.sendPassword("123456");
        //To Enter ConfirmPassword in the Member Registration Page  //
        tc055POM.sendConfirmPassword("123456");
        //To Enter Captcha Value in the Member Registration Page  //
        String CaptchaVal = JOptionPane.showInputDialog("Please enter the Captcha value:");	
        tc055POM.sendCaptchaText(CaptchaVal);
        Thread.sleep(3000);
        //To Click Submiut Button in the Member Registration Page  //
        tc055POM.clickSubmit();
        Thread.sleep(1000);
        //To Enter OK in the Overlay //
        tc055POM.clickOK();
        Thread.sleep(1000);
        //To Enter UserName in the Login Page  //
        tc055POM.sendUserName("admin");
        Thread.sleep(1000);
        //To Enter Password in the Login Page  //
		tc055POM.sendPassword1("123456");
		Thread.sleep(1000);
		//To Click Login Button in the Login Page//
		tc055POM.clickLoginBtn();
		//To Enter Member Login  in the Home Page//
		tc055POM.sendLogin("param9");
		//To Click SUbmit Button of Change Permissions in teh Profile Page//
		tc055POM.clickSubmit3();
		Thread.sleep(1000);
		//To Enter New Group in the Change Permissions Group Page//
		tc055POM.clickNewGroup();
		Thread.sleep(1000);
		//To Click Dropdown in the Change Permissions Group Page//
		tc055POM.clickDropdown();
		Thread.sleep(1000);
		//To Enter Text Area in the Change Permissions Group Page//
		tc055POM.sendTextArea("Full Access to Members");
		Thread.sleep(1000);
		//To Click SUbmit Button in the Change Permissions Group Page//
		tc055POM.clickSubmit4();
		Thread.sleep(1000);
		//To Click Back Button in the Change Permissions Group Page//
		tc055POM.clickBackBtn();
		Thread.sleep(1000);
		//To Click Granbt Loan in the Profile  Page//
		tc055POM.clickGrantLoan();
		Thread.sleep(1000);
		//To Enter Loan AMount in the Grant Loan to Member  Page//
		tc055POM.sendLoanAmount("1000");
		Thread.sleep(1000);
		//To Enter Description in the Grant Loan to Member  Page//
		tc055POM.sendDescription("Full Grant Loan");
		Thread.sleep(1000);
		//To Click Submit Button  in the Grant Loan to Member  Page//
		tc055POM.clickSubmit6();
		Thread.sleep(1000);
		//To Click Submit Button in the Grantted Loan to Member  Page//
		tc055POM.clickSubmit7();
		Thread.sleep(1000);
		screenShot.captureScreenShot("First");
		
		//compare the actual title of the page with the expected one//
		//assertions//
		 String Expected1 ="Thanks for registering! Your account has been created and needs to be activated by the administration.";
			String Expected = Expected1.replaceAll("\\s", "");
			String myWindowHandle = driver.getWindowHandle();
			driver.switchTo().window(myWindowHandle);
	}
}
