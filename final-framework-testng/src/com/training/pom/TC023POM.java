package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC023POM {
	private WebDriver driver; 
	
	public TC023POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath ="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement LoginBtn; 
	
	@FindBy(xpath ="//*[@id=\"menu2\"]/span[2]")
	private WebElement AccountLnk; 
	
	@FindBy(xpath ="//*[@id=\"submenu2.4\"]/span[2]")
	private WebElement MbrPaymentLnk;
	
	@FindBy(id="memberUsername")
	private WebElement Recepient; 

	

	@FindBy(id="amount")
	private WebElement amount; 
	
	@FindBy(id="description")
	private WebElement description;
	
	@FindBy(xpath ="//*[@id=\"submitButton\"]")
	private WebElement SubmitBtn; 

	
	
	
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
	
	public void clickMbrPaymentLnk() {
		this.MbrPaymentLnk.click(); 
	}
	
	public void sendRecepient(String Recepient) {
		this.Recepient.clear(); 
		this.Recepient.sendKeys(Recepient); 
	}
	
		public void sendamount(String amount) {
		this.amount.clear(); 
		this.amount.sendKeys(amount); 
	}
	

	public void senddescription(String description) {
		this.description.clear(); 
		this.description.sendKeys(description); 
	}
	
	public void clickSubmitBtn() {
		this.SubmitBtn.click(); 
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	
	

	public void clickPersonalLnk() {
		// TODO Auto-generated method stub
		
	}

	public void clickMessagesLnk() {
		// TODO Auto-generated method stub
		
	}

	public void clickViewMessagesLnk() {
		// TODO Auto-generated method stub
		
	}

	public void sendAmount(String string) {
		// TODO Auto-generated method stub
		
	}

	

	public void clicMemberPaymentLnk() {
		// TODO Auto-generated method stub
		
	}

	public void clicMbrPaymentLnk() {
		// TODO Auto-generated method stub
	
	}

	

	

}

