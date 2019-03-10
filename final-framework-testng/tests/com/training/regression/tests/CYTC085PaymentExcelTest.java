package com.training.regression.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.CYTC085PaymentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC085PaymentExcelTest {
	private WebDriver driver;
	private String baseUrl;
	private CYTC085PaymentPOM CYTC085PaymentPOM;
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
		CYTC085PaymentPOM = new CYTC085PaymentPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	/*@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}*/

//The Main Objective of this scripting is to To verify whether application displays error message upon entering invalid details in message modules//
	@Test (dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String MemberLogin, String Subject, String Body) throws AWTException
	{
		//Admin  login
		CYTC085PaymentPOM.sendUserName("Admin");
		CYTC085PaymentPOM.sendPassword("123456");
		CYTC085PaymentPOM.clickLoginBtn();
		
		//to disply error message  
		CYTC085PaymentPOM.clickMessages();
		CYTC085PaymentPOM.clickMessagesLnk();
		CYTC085PaymentPOM.clickMessageBox();
		CYTC085PaymentPOM.clickSentItemsDropdown();
		CYTC085PaymentPOM.clickSubmit1();
		CYTC085PaymentPOM.sendMemberLogin(MemberLogin);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//mouse hover operation for memberlogin//
		WebElement user= driver.findElement(By.xpath("//*[@id=\"memberName\"]"));
		Actions act= new Actions(driver);
		act.moveToElement(user).build().perform();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"membersByUsername\"]/ul/li[1]")).click();
		
		CYTC085PaymentPOM.sendSubject(Subject);
		System.out.println("executed till entering the subject");
		CYTC085PaymentPOM.sendBody(Body);
		System.out.println("entered the body");
				
		CYTC085PaymentPOM.clickSubmit2();
		
		
		String Expected= "Body is required";
		
		Alert alert = driver.switchTo().alert();
		String Actual = alert.getText();
		 
		assertTrue(Actual.contains(Expected));	
	
					
	}

}