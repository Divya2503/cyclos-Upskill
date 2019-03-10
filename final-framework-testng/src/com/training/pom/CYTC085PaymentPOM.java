package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CYTC085PaymentPOM {
	private WebDriver driver; 

	public CYTC085PaymentPOM(WebDriver driver) {
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


	//To find Messages in the home page//
	@FindBy(xpath = "//*[@id=\"menu8\"]/span[2]")
	private WebElement Messages;

	//To find Messages Link in the home page//
	@FindBy(xpath = "//*[@id=\"submenu8.0\"]/span[2]")
	private WebElement MessagesLnk;


	//To find MessageBox in the Message List Page//
	@FindBy(xpath = "//*[@id=\"messageBoxSelect\"]")
	private WebElement MessageBox ;

	//To find SentItems Dropdown in the Message List Page//
	@FindBy(xpath = "//*[@id=\"messageBoxSelect\"]/option[2]")
	private WebElement SentItemsDropdown ;

	//To find Submit Button  in the Message List Page //
	@FindBy(xpath = "//*[@id=\"newButton\"]")
	private WebElement Submit1 ;


	//To find MemberLogin  in the Send Message Page//
	@FindBy(id = "memberUsername")
	private WebElement MemberLogin ;
	
    //To find Subject  in the Send Message Page//
	@FindBy(name = "message(subject)")
	private WebElement Subject ;

	//To find Subject  in the Send Message Page//
	@FindBy(xpath = "//iframe[@title='Rich text editor, bodyText']")
	private WebElement Body ;
	
	//To find Submit  in the Send Message Page//
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement Submit2 ;
	
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

	public void clickMessages() {
		this.Messages.click(); 
	}
	
	public void clickMessagesLnk() {
		this.MessagesLnk.click(); 
	}
	
	public void clickMessageBox() {
		this.MessageBox.click(); 
	}
	
	public void clickSentItemsDropdown() {
		this.SentItemsDropdown.click(); 
	}
	
	public void clickSubmit1() {
		this.Submit1.click(); 
	}


	public void sendMemberLogin(String MemberLogin) {
		this.MemberLogin.clear();
		this.MemberLogin.sendKeys(MemberLogin);
	}
	
	public void sendSubject(String Subject) {
		this.Subject.clear();
		this.Subject.sendKeys(Subject);
	}
	
	public void sendBody(String Body) {
		this.Body.sendKeys(Body);
	}
	
	public void clickSubmit2() {
		this.Submit2.click(); 
	}
	
	
	}
	
	
	
	
	
	
	
	
	














