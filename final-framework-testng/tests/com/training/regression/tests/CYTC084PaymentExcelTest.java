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
import com.training.pom.CYTC084PaymentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC084PaymentExcelTest {
	private WebDriver driver;
	private String baseUrl;
	private CYTC084PaymentPOM CYTC084PaymentPOM;
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
		CYTC084PaymentPOM = new CYTC084PaymentPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	/*@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}*/

	//The Main Objective of this scripting is to To verify whether application displays payment details based on the search criteria in member login page//
		@Test (dataProvider = "excel-inputs2", dataProviderClass = LoginDataProviders.class)
		public void loginDBTest(String MemberLogin, String Fromdate, String ToDate, String Description) throws AWTException
		{
			//Member login
			CYTC084PaymentPOM.sendUserName("divya");
			CYTC084PaymentPOM.sendPassword("12345");
			CYTC084PaymentPOM.clickLoginBtn();
			
			//to disply error message  
			CYTC084PaymentPOM.clickAccountLnk();
			CYTC084PaymentPOM.clickAccountInformation();
			CYTC084PaymentPOM.clickPaymentType();
			CYTC084PaymentPOM.clickAll();
			CYTC084PaymentPOM.clickAdvanced();
			CYTC084PaymentPOM.sendMemberLogin(MemberLogin);
			
	
			//mouse over operation for member login//
			WebElement user= driver.findElement(By.id("memberUsername"));
			Actions act= new Actions(driver);
			act.moveToElement(user).build().perform();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"memberUsername\"]/ul/li[1]")).click();	
			
			CYTC084PaymentPOM.sendFromDate(Fromdate);
			CYTC084PaymentPOM.sendToDate(ToDate);
			CYTC084PaymentPOM.sendDescription(Description);
			CYTC084PaymentPOM.clickSearch();
					
	}

}