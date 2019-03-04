package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC051POM {
	private WebDriver driver; 
	
	public TC051POM(WebDriver driver) {
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
	
	//To find advertisments link after Login//
	@FindBy(xpath ="//*[@id=\"menu6\"]/span[2]")
	private WebElement AdvertisementsLnk; 
	
	//To find ManageCategoriesLink link after Login//
	@FindBy(xpath ="//*[@id=\"submenu6.1\"]/span[2]")
	private WebElement ManageCategoriesLnk;
	
	//To find Submit Button near insert new category Button in the advertiment categories page//
	@FindBy(xpath ="//*[@id=\"newButton\"]")
	private WebElement SubmitBtn ;
	
	//To find Name in the New advertisment Category page//
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/textarea")
	private WebElement Name;
	
    //To find submit Button in the New advertisment Category page//
	@FindBy(xpath ="//*[@id=\"saveButton\"]")
	private WebElement SubmitBtn2 ;
	

	//To find Home Link Link in homepage /
	@FindBy(xpath ="//*[@id=\"menu0\"]/span[2]")
	private WebElement HomeLnk  ;
	
	//To find member login in home page //
	@FindBy(id="memberUsername")
	private WebElement MemberLogin; 
	
	//To find submit button of Manage Advertisments//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/input")
	private WebElement SubmitBtn3 ;
	
	//To find submit button of Insert New Advertisment//
	@FindBy(xpath ="//*[@id=\"newButton\"]")
	private WebElement SubmitBtn4  ;
	
	//To find Title Textbox in New Advertisment Page //
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
	private WebElement Title ;
	
	//To find Category in New Advertisment Page //
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/select")
	private WebElement Category ;
	
	//To find Category Dropdown as New offer in New Advertisment Page //
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/select/option[3]")
	private WebElement newoffer ;
	
	//To find Price in New Advertisment Page //
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input[1]")
	private WebElement Price ;
	
	//To find Checkbox of Not Expirable in New Advertisment Page //
	@FindBy(xpath ="//*[@id=\"notExpirableCheck\"]")
	private WebElement NotExpirable ;
	
	//To find  Description Text box in New Advertisment Page//
	@FindBy(xpath ="/html")
	private WebElement Description ;
	
	//To find Submit Button in New Advertisment Page//
	@FindBy(xpath ="//*[@id=\"saveButton\"]")
	private WebElement SubmitBtn5  ;
	
	//To find Back Button in New Advertisment Page//
	@FindBy(xpath ="//*[@id=\"backButton\"]")
	private WebElement BackBtn  ;
	
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
	
	public void clickAdvertisementsLnk() {
		this.AdvertisementsLnk.click(); 
	}
	
	public void clickManageCategoriesLnk() {
		this.ManageCategoriesLnk.click(); 
	}
	
	public void clickSubmitBtn() {
		this.SubmitBtn.click(); 
	}
	
	public void sendName(String Name) {
		this.Name.clear();
		this.Name.sendKeys(Name);
	}
	
	public void clickSubmitBtn2() {
		this.SubmitBtn2.click(); 
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	
	
	public void clickHomeLnk() {
		this.HomeLnk.click(); 
	}

	public void sendMemberLogin(String MemberLogin) {
		this.MemberLogin.clear(); 
		this.MemberLogin.sendKeys(MemberLogin); 
	}
	
	public void clickSubmitBtn3() {
		this.SubmitBtn3.click(); 
	}
	
	public void clickSubmitBtn4() {
		this.SubmitBtn4.click(); 
	}
	
	public void sendTitle(String Title) {
		this.Title.clear(); 
		this.Title.sendKeys(Title); 
	}
	
	public void clickCategory() {
		this.Category.click(); 
	}
	
	public void clicknewoffer() {
		this.newoffer.click(); 
	}
	
	public void sendPrice(String Price) {
		this.Price.clear(); 
		this.Price.sendKeys(Price); 
	}
	
	public void clickNotExpirable() {
		this.NotExpirable.click(); 
	}
	
	public void sendDescription(String Description) {
		this.Description.clear();
		this.Description.sendKeys(Description);
	}
	

	public void clickSubmitBtn5() {
		this.SubmitBtn5.click(); 
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		}
	
	public void clickBackBtn() {
		this.BackBtn.click(); 
	}
	
	public void clickAdvertismentsLnk() {
		// TODO Auto-generated method stub
		
	}

	


		
	}


	
	
	
	
	


	
	
	
