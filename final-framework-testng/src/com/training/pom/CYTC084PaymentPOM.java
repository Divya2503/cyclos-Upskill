package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.scanner.Constant;

public class CYTC084PaymentPOM {
	private WebDriver driver; 

	public CYTC084PaymentPOM(WebDriver driver) {
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


	//To find AccountLnk in the home page//
	@FindBy(xpath = "//*[@id=\"menu2\"]/span[2]")
	private WebElement AccountLnk;

	//To find Account Information Link in the home page//
	@FindBy(xpath = "//*[@id=\"submenu2.0\"]/span[2]")
	private WebElement AccountInformation;


	//To find PaymentType in the Search Transaction on Member Account page//
	@FindBy(xpath = "//*[@id=\"filterSelect\"]")
	private WebElement PaymentType ;

	//To find All in the Search Transaction on Member Account page//
	@FindBy(xpath = "//*[@id=\"filterSelect\"]/option[1]")
	private WebElement All ;
		
	//To find Advanced Button Search Transaction on Member Account page //
	@FindBy(xpath = "//*[@id=\"modeButton\"]")
	private WebElement Advanced;

	//To find MemberLogin to Button in the Search Transaction on Member Account page //
	@FindBy(id = "memberUsername")
	private WebElement MemberLogin;
	
	
	
	
	
	//To find   in the Search Transaction on Member Account page//
	@FindBy(xpath = "//*[@id=\"_id1552051883612_704\"]")
	private WebElement FromDate ;
	
	//To find MemberLogin  in the Search Transaction on Member Account page//
	@FindBy(xpath = "//*[@id=\"_id1552051883618_900\"]")
	private WebElement ToDate ;
	
    //To find Subject  in the Search Transaction on Member Account page//
	@FindBy(xpath = "//*[@id=\"tdContents\"]/form/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
	private WebElement Description ;

	//To find Subject  in the Search Transaction on Member Account page//
	@FindBy(xpath = "//*[@id=\"tdContents\"]/form/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
	private WebElement Search ;
	
	

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
	
	public void clickAccountInformation() {
		this.AccountInformation.click(); 
	}
	
	public void clickPaymentType() {
		this.PaymentType.click(); 
	}
	
	public void clickAll() {
		this.All.click(); 
	}
	
	public void clickAdvanced() {
		this.Advanced.click(); 
	}
	
	public void sendMemberLogin(String MemberLogin) {
		this.MemberLogin.clear(); 
		this.MemberLogin.sendKeys(MemberLogin); 
	}
	
	public void sendFromDate(String FromDate) {
		this.FromDate.clear(); 
		this.FromDate.sendKeys(FromDate); 
	}
	
	public void sendToDate(String ToDate) {
		this.ToDate.clear(); 
		this.ToDate.sendKeys(ToDate); 
	}
	
	public void sendDescription(String Description) {
		this.Description.clear(); 
		this.Description.sendKeys(Description); 
	}
	public void clickSearch() {
		this.Search.click(); 
	}

	
		
	}
	

	
	

	
	
	
	
	
	
	
	
	














