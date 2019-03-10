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
import com.training.pom.CYTC081PaymentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC081PaymentExcelTest {
	private WebDriver driver;
	private String baseUrl;
	private CYTC081PaymentPOM CYTC081PaymentPOM;
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
		CYTC081PaymentPOM = new CYTC081PaymentPOM(driver);
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
		CYTC081PaymentPOM.sendUserName("Divya");
		CYTC081PaymentPOM.sendPassword("12345");
		CYTC081PaymentPOM.clickLoginBtn();
		
		//Do payment to different member
		CYTC081PaymentPOM.clickAccountLnk();
		CYTC081PaymentPOM.clickMemberPaymentLnk();
		CYTC081PaymentPOM.sendLoginRecipeint("Mahesh");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Mouse hover operation to select the reciepeint
		
		WebElement user= driver.findElement(By.id("membersByUsername"));
		Actions act= new Actions(driver);
		act.moveToElement(user).build().perform();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"membersByUsername\"]/ul/li[1]")).click();
		
		CYTC081PaymentPOM.sendLoginAmount("100");
		CYTC081PaymentPOM.sendDescription("Selenium");
		CYTC081PaymentPOM.clickSubmit2();
		CYTC081PaymentPOM.clickSubmit3();
			
		
		String Expected= "The payment has been performed";
		String Actual = driver.findElement(By.xpath("//*[@id=\"tdContents\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td")).getText();
		
		assertEquals(Expected,Actual);
		
		
					
	}

}