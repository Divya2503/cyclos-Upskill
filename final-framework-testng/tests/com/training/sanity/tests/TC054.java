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
import com.training.pom.TC054POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC054 {

	private WebDriver driver;
	private String baseUrl;
	private TC054POM tc054POM;
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
		tc054POM = new TC054POM(driver); 
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
		//To Click SUbmit Button in the Login Page//
		tc054POM.clickSubmitBtn(); 
		//To Enter Member in the Member Registration Page//
		tc054POM.sendMember("param5");
		//To Enter FullName in the Member Registration Page//
		tc054POM.sendFullName("param5 band"); 
		Thread.sleep(1000);
		//To Enter Email in the Member Registration Page//
		tc054POM.sendEmail("param5@gmail.com");  
		Thread.sleep(1000);
		//To Enter Calender Icon in the Member Registration Page//
		tc054POM.clickCalenderIcon(); 
		Thread.sleep(1000);
		//To Enter Birthday in the Member Registration Page//
		tc054POM.sendBirthday("25031990");
		Thread.sleep(1000);
		//To Enter Gender in the Member Registration Page//
		tc054POM.clickGender();
		//To Enter Address in the Member Registration Page//
		tc054POM.sendAddress("Hyd");
		Thread.sleep(1000);
		//To Enter PostalCode in the Member Registration Page//
        tc054POM.sendPostalCode("500079");
        Thread.sleep(1000);
        //To Enter City in the Member Registration Page//
        tc054POM.sendCity("Hanuman Nagr");
        Thread.sleep(1000);
        //To Enter Area in the Member Registration Page//
        tc054POM.clickArea();
        Thread.sleep(1000);
        //To Enter AreaOption in the Member Registration Page//
        tc054POM.clickAreaOption();
        Thread.sleep(1000);
        //To Enter Phone in the Member Registration Page//
        tc054POM.sendPhone("8765432190");
        Thread.sleep(1000);
        //To Enter MobilePhone in the Member Registration Page//
        tc054POM.sendMobilePhone("8076587380");
        Thread.sleep(1000);
        //To Enter Fax in the Member Registration Page//
        tc054POM.sendFax("7684593383");
        Thread.sleep(1000);
        //To Enter URL in the Member Registration Page//
        tc054POM.sendURL("www.google.com");
        Thread.sleep(1000);
        //To Enter Password in the Member Registration Page//
        tc054POM.sendPassword("123456");
        //To Enter ConfirmPassword in the Member Registration Page//
        tc054POM.sendConfirmPassword("123456");
        //To Enter Captchavalue in the Member Registration Page//
        String CaptchaVal = JOptionPane.showInputDialog("Please enter the Captcha value:");	
        tc054POM.sendCaptchaText(CaptchaVal);
        Thread.sleep(3000);
        //To Click Submit Button in the Member Registration Page//
        tc054POM.clickSubmit();
        Thread.sleep(1000);
        //To Click Ok in the oVerlay//
        tc054POM.clickOK();
        Thread.sleep(1000);
        //To Enter UserName in the Loginpage//
        tc054POM.sendUserName("admin");
        Thread.sleep(1000);
        //To Enter Password in the Loginpage//
		tc054POM.sendPassword1("123456");
		Thread.sleep(1000);
		//To Click LoginButton in the Loginpage//
		tc054POM.clickLoginBtn();
		//To Enter MemberLogin in the Home Page//
		tc054POM.sendLogin("param5");
		//To Enter Submit Button of Chnage Permissions in the Prodile page//
		tc054POM.clickSubmit3();
		Thread.sleep(1000);
		//To Click NewGroup Dropdown in the Chnage Permission Group Page//
		tc054POM.clickNewGroup();
		Thread.sleep(1000);
		//To Click Dropdown in the Chnage Permission Group Page//
		tc054POM.clickDropdown();
		Thread.sleep(1000);
		//To Enter TextArea in the Chnage Permission Group Page//
		tc054POM.sendTextArea("Full Access to Members");
		Thread.sleep(1000);
		//To Click Submit Button in the Chnage Permission Group Page//
		tc054POM.clickSubmit4();
        screenShot.captureScreenShot("First");
        
      //compare the actual title of the page with the expected one//
        //assertions//
        
        String Expected1 ="Thanks for registering! Your account has been created and needs to be activated by the administration.";
		String Expected = Expected1.replaceAll("\\s", "");
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);

	}
}
