package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC025POM {
	private WebDriver driver; 
	
	public TC025POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath ="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement LoginBtn; 
	
	@FindBy(xpath ="//*[@id=\"menu1\"]/span[2]")
	private WebElement PersonalLnk; 
	
	@FindBy(xpath ="//*[@id=\"submenu1.1\"]/span[2]")
	private WebElement MessagesLnk;
	
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form[2]/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/img")
	private WebElement MovetoTrashLnk;

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
	
	public void clickMessagesLnk() {
		this.MessagesLnk.click(); 
	}
	public void clickMovetoTrashLnk() {
		this.MovetoTrashLnk.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}
	
	}
	
	


