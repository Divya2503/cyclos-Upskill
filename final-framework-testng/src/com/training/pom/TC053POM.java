package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC053POM {
	private WebDriver driver; 
	
	public TC053POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//To find Username in the Login page//
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	//To find Password in the Login page//
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	//To find LoginButton in the Login page//
	@FindBy(xpath ="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement LoginBtn; 
	
	//To find UserandGroups Link in the Home page//
	@FindBy(xpath ="//*[@id=\"menu5\"]/span[2]")
	private WebElement UserandGroupsLnk; 
	
	//To find LoansGroups Link in the Home page//
	@FindBy(xpath ="//*[@id=\"submenu5.9\"]/span[2]")
	private WebElement LoanGroupsLnk;
	
	//To find Submit Button of Create Loan Group Section in the Search Loans page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
	private WebElement SubmitBtn ;
	
	//To find Groupname in the New Loan Group page//
	@FindBy(xpath="//*[@id=\"tdContents\"]/form/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
	private WebElement loanGroupname;
	
	//To find Description in the New Loan Group page//
	@FindBy(id="descriptionText")
	private WebElement loanGroup2;
	
	//To find Submit Button in the New Loan Group page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td/input")
	private WebElement SubmitBtn2 ;
	
	//To find Modify Link  in the Search Loan Groups page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table[2]/tbody/tr[2]/td/table/tbody/tr[2]/td[3]/img[1]")
	private WebElement ModifyLnk;
	
	//To find MemberlOgin in the Modify Loan Group page//
	@FindBy(id="memberUsername")
	private WebElement MemberLogin1;
	
	//To find FullName in the Modify Loan Group page//
	@FindBy(id="memberName")
	private WebElement FullName;
	
	//To find Add Button in the Modify Loan Group page//
	@FindBy(xpath="//*[@id=\"addMemberButton\"]")
	private WebElement AddBtn ;
	
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
	
	public void clickUserandGroupsLnk() {
		this.UserandGroupsLnk.click(); 
	}
	
	public void clickLoanGroupsLnk() {
		this.LoanGroupsLnk.click(); 
	}
	
	public void clickSubmitBtn() {
		this.SubmitBtn.click(); 
	}
	
	public void sendloanGroupname(String loanGroupname) {
		this.loanGroupname.clear();
		this.loanGroupname.sendKeys(loanGroupname);
	}
	
	public void sendloanGroup2(String loanGroup2) {
		this.loanGroup2.clear();
		this.loanGroup2.sendKeys(loanGroup2);
	}

	public void clickSubmitBtn2() {
		this.SubmitBtn2.click(); 
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void clickModifyLnk() {
		this.ModifyLnk.click(); 
	}

	public void sendMemberLogin1(String MemberLogin1) {
		this.MemberLogin1.clear();
		this.MemberLogin1.sendKeys(MemberLogin1);
	}

	public void sendFullName(String FullName) {
		this.FullName.clear();
		this.FullName.sendKeys(FullName);
	}
	
	public void clickAddBtn() {
		this.AddBtn.click(); 
		Alert alert = driver.switchTo().alert();
		alert.accept();
		} 
	
}


	
	
	
