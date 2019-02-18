package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC022POM {
	private WebDriver driver; 
	
	public TC022POM(WebDriver driver) {
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
	
	@FindBy(xpath ="//*[@id=\"submenu2.3\"]/span[2]")
	private WebElement LoansLnk;
	
	@FindBy(xpath ="//*[@id=\"tdContents\"]/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[4]/img")
	private WebElement ViewLnk;
	
	@FindBy(id="amountText")
	private WebElement amount; 
	
	@FindBy(xpath ="//*[@id=\"repayForm\"]/table/tbody/tr[3]/td/input")
	private WebElement RepayBtn;
	
	
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
	
	public void clickLoansLnk() {
		this.LoansLnk.click(); 
	}

	public void clickViewLnk() {
		this.ViewLnk.click(); 
	}
	
	public void sendamount(String amount) {
		this.amount.clear();
		this.amount.sendKeys(amount);
	}
	

	public void clickRepayBtn() {
		this.RepayBtn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
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

	

	

}

