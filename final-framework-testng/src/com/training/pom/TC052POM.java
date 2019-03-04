package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC052POM {
	private WebDriver driver; 
	
	public TC052POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//To find UserName in the Login page//
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	//To find Password in the Login page//
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	//To find Login Button in the Login page//
	@FindBy(xpath ="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement LoginBtn; 
	
	//To find Personal Link in the Home page//
	@FindBy(xpath ="//*[@id=\"menu1\"]/span[2]")
	private WebElement PersonalLnk; 
	
	//To find Contacts Link in the Home page//
	@FindBy(xpath ="//*[@id=\"submenu1.3\"]/span[2]")
	private WebElement Contacts;
	
    //To find MemberLogin in the Contacts List Page//
	@FindBy(id="memberUsername")
	private WebElement MemberLogin; 
	
	//To find MemberLogin in the Contacts List Page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td/input")
	private WebElement SubmitBtn; 
	
	//To find Added Contact in the Contacts List Page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]/a")
	private WebElement AddedContact;
	
    //To find Submit button of Make Payment Section in the profile page of added contact page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
	private WebElement Submit2 ;
	
	//To find amount  in the Payment to member Page//
	@FindBy(id="amount")
	private WebElement Amount; 
	
	//To find Description  in the Payment to member Page//
	@FindBy(id="description")
	private WebElement Description; 
	
	//To find Submit Button  in the Payment to member Page//
	@FindBy(xpath ="//*[@id=\"submitButton\"]")
	private WebElement Submit3 ;
	
	//To find Submit Button  in the Transaction Confirmation Page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[6]/td/input")
	private WebElement Submit4 ;
	
	//To find logout in the Home page//
	@FindBy(xpath ="//*[@id=\"menu7\"]/span[2]")
	private WebElement Logout ;
	
	
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
	
	public void clickPersonalLnk() {
		this.PersonalLnk.click(); 
	}
	
	public void clickContacts() {
		this.Contacts.click(); 
	}


	public void sendMemberLogin(String MemberLogin) {
		this.MemberLogin.clear(); 
		this.MemberLogin.sendKeys(MemberLogin); 
	}
	
	public void clickSubmitBtn() {
		this.SubmitBtn.click(); 
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void clickAddedContact() {
		this.AddedContact.click(); 
	}

	public void clickSubmit2() {
		this.Submit2.click(); 
	}
	
	public void sendAmount(String Amount) {
		this.Amount.clear(); 
		this.Amount.sendKeys(Amount); 
	}
	

	public void sendDescription(String Description) {
		this.Description.clear(); 
		this.Description.sendKeys(Description); 
	}
	
	public void clickSubmit3() {
		this.Submit3.click(); 
	}
	
	public void clickSubmit4() {
		this.Submit4.click(); 
	}
	
	public void clickLogout() {
		this.Logout.click(); 
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	



	public void clickUserandGroupsLnk() {
		// TODO Auto-generated method stub
		
	}

	public void clickLoanGroupsLnk() {
		// TODO Auto-generated method stub
		
	}

	

	public void sendloanGroup1(String string) {
		// TODO Auto-generated method stub
		
	}

	public void sendloanGroup2(String string) {
		// TODO Auto-generated method stub
		
	}

	public void clickSubmitBtn2() {
		// TODO Auto-generated method stub
		
	}

	public void clickModifyLnk() {
		// TODO Auto-generated method stub
		
	}

	

	public void clickAddBtn() {
		// TODO Auto-generated method stub
		
	}

	public void clickMakePayment() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

