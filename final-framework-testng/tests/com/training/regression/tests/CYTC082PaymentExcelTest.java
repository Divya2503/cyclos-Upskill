package com.training.regression.tests;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
import com.training.pom.CYTC082PaymentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC082PaymentExcelTest {
	private WebDriver driver;
	private String baseUrl;
	private CYTC082PaymentPOM CYTC082PaymentPOM;
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
		CYTC082PaymentPOM = new CYTC082PaymentPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	/*@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}*/

//The main Objectiveof this Scripting is to To verify whether application allows member to make payment to registered member & received member should able to view payment //
	@Test 
	public void validLoginTest(){
	
		//Member login
		CYTC082PaymentPOM.sendUserName("Divya");
		CYTC082PaymentPOM.sendPassword("12345");
		CYTC082PaymentPOM.clickLoginBtn();
		
		//Do payment to different member
		CYTC082PaymentPOM.clickAccountLnk();
		CYTC082PaymentPOM.clickMemberPaymentLnk();
		CYTC082PaymentPOM.sendLoginRecipeint("Mahesh");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Mouse hover operation to select the reciepeint
		
		WebElement user= driver.findElement(By.id("membersByUsername"));
		Actions act= new Actions(driver);
		act.moveToElement(user).build().perform();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"membersByUsername\"]/ul/li[1]")).click();
		
		CYTC082PaymentPOM.sendLoginAmount("100");
		CYTC082PaymentPOM.sendDescription("Selenium");
		CYTC082PaymentPOM.clickSubmit2();
		CYTC082PaymentPOM.clickSubmit3();
		CYTC082PaymentPOM.clickLogout();
		CYTC082PaymentPOM.sendUserName("Divya");
		CYTC082PaymentPOM.sendPassword("12345");
		CYTC082PaymentPOM.clickLoginBtn();
		CYTC082PaymentPOM.clickAccountLnk1();
		CYTC082PaymentPOM.clickAccountInformation();
		CYTC082PaymentPOM.clickPaymentType();
		CYTC082PaymentPOM.clickMemberPayment();
		CYTC082PaymentPOM.clickViewIcon();
		CYTC082PaymentPOM.clickBack();	
		
	
		String Expected= "Search results";
		String Actual = driver.findElement(By.xpath("//*[@id=\"tdContents\"]/table[1]/tbody/tr[1]/td[1]")).getText();
		
		assertEquals(Expected,Actual);
		
		
		
					
	}

}