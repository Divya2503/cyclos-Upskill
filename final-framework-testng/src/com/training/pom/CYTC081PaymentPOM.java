package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CYTC081PaymentPOM {
	private WebDriver driver; 

	public CYTC081PaymentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//To find UserName in Loginpage//
	@FindBy(id="cyclosUsername")
	private WebElement userName; 

	//To find Password in Loginpage//
	@FindBy(id="cyclosPassword")
	private WebElement password;

	//To find  LoginButton in Loginpage//
	@FindBy(xpath ="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement LoginBtn;


	//To find Account in the home page//
	@FindBy(xpath = "//*[@id=\"menu2\"]/span[2]")
	private WebElement AccountLnk;

	//To find MemberPayment in the home page//
	@FindBy(xpath = "//*[@id=\"submenu2.4\"]/span[2]")
	private WebElement MemberPaymentLnk;


	//To find LoginReciepient in the Payemnt to Member page//
	@FindBy(id = "memberUsername")
	private WebElement LoginRecipeint;

	//To find Amount in the Payemnt to Member page//
	@FindBy(xpath = "//*[@id=\"amount\"]")
	private WebElement Amount ;

	//To find Description in the Payemnt to Member page//
	@FindBy(xpath = "//*[@id=\"description\"]")
	private WebElement Description ;

	//To find Submit2 Button in the Payemnt to Member page//
	@FindBy(xpath = "//*[@id=\"submitButton\"]")
	private WebElement Submit2 ;

	//To find Submit3 Button in the Payemnt to Transaction Confimration page//
	@FindBy(xpath = "//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[6]/td/input")
	private WebElement Submit3 ;

	
	
		

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}

	public void clickLoginBtn() {
		this.LoginBtn.click(); 
	}

	public void clickAccountLnk() {
		this.AccountLnk.click(); 
	}

	public void clickMemberPaymentLnk() {
		this.MemberPaymentLnk.click(); 
	}


	public void sendLoginRecipeint(String LoginRecipeint) {
		this.LoginRecipeint.clear();
		this.LoginRecipeint.sendKeys(LoginRecipeint);
	}

	public void sendLoginAmount(String Amount) {
		this.Amount.clear();
		this.Amount.sendKeys(Amount);
	}

	public void sendDescription(String Description) {
		this.Description.clear();
		this.Description.sendKeys(Description);
	}

	public void clickSubmit2() {
		this.Submit2.click(); 
	}

	public void clickSubmit3() {
		this.Submit3.click(); 
	}
	
	

	

	
}












