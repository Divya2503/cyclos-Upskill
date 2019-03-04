package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC054POM {
	private WebDriver driver; 
	
	public TC054POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	//To find Submit Button in the Login page //
	@FindBy(xpath ="//*[@id=\"loginRegistrationDiv\"]/input")
	private WebElement SumbitBtn; 
	
	//To find LoginName in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
	private WebElement Member;
	
	//To find FullName in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
	private WebElement FullName;
	
	//To find Email in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
	private WebElement Email; 
	
	//To find calenderIcon in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"calendarTrigger0\"]")
	private WebElement CalenderIcon; 
	
	//To find Birthday in the  Member Registration page//
	@FindBy(name="member(customValues).value")
	private WebElement Birthday; 
	
	//To find Gender in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"_radio_2_0\"]")
	private WebElement Gender; 
	
	//To find Address in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input[3]")
	private WebElement Address; 
	
	//To find PostalCode in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[7]/td[2]/input[3]")
	private WebElement PostalCode ; 
	
	//To find City in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[8]/td[2]/input[3]")
	private WebElement City; 
	
	//To find Area in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"custom_field_select_6\"]")
	private WebElement Area; 
	
	//To find AreaOption in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"custom_field_select_6\"]/option[2]")
	private WebElement AreaOption; 
	
	//To find Phone in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[10]/td[2]/input[3]")
	private WebElement Phone; 
	
	//To find MobilePhone in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[11]/td[2]/input[3]")
	private WebElement MobilePhone; 
	
	//To find Fax in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[12]/td[2]/input[3]")
	private WebElement Fax;
	
	//To find URL in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[13]/td[2]/input[3]")
	private WebElement URL; 
	
	//To find Password in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[14]/td[2]/input")
	private WebElement Password; 
	
	//To find ConfirmPassword in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[15]/td[2]/input")
	private WebElement ConfirmPassword; 
	
	//To find CaptchaText in the  Member Registration page//
	@FindBy(xpath="//*[@id=\"tdContents\"]/div/form/table[1]/tbody/tr[2]/td/table/tbody/tr[16]/td/input")
	private WebElement CaptchaText;
	
	//To find Submit Button in the  Member Registration page//
	@FindBy(xpath ="//*[@id=\"saveButton\"]")
	private WebElement Submit; 
	
	//To find OK Button in the Overlay//
	@FindBy(xpath ="//*[@id=\"btn\"]")
	private WebElement OK; 
	
	//To find UserName in the Login page//
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	//To find Password in the Login page//
	@FindBy(id="cyclosPassword")
	private WebElement Password1;
	
	
	//To find Login Button in the Login page//
	@FindBy(xpath ="//*[@id=\"cyclosLogin\"]/table/tbody/tr[3]/td/input")
	private WebElement LoginBtn; 
	
	//To find MemberLogin in the Home page//
	@FindBy(id ="memberUsername")
	private WebElement Login; 
	
	//To find Submit button of Change Permission Groups in the profile page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr[1]/td[4]/input")
	private WebElement Submit3; 
	
	//To find  NewGroup in the change Permission Gorup Page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/select")
	private WebElement NewGroup; 
	
	//To find Dropdown in the change Permission Gorup Page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/select/option[4]")
	private WebElement Dropdown;
	
	//To find TextArea in the change Permission Gorup Page//
	@FindBy(xpath = "//*[@id=\"comments\"]")
	private WebElement TextArea;
	
	
	//To find Submit Button in the change Permission Gorup Page//
	@FindBy(xpath ="//*[@id=\"tdContents\"]/form/table[1]/tbody/tr[2]/td/table/tbody/tr[4]/td/input")
	private WebElement Submit4; 
	
	

	public void clickSubmitBtn() {
		this.SumbitBtn.click(); 
	}
	
	
	public void sendMember(String Member) {
		this.Member.clear(); 
		this.Member.sendKeys(Member); 
	}
	

	public void sendFullName(String FullName) {
		this.FullName.clear(); 
		this.FullName.sendKeys(FullName); 
	}
	
	public void sendEmail(String Email) {
		this.Email.clear(); 
		this.Email.sendKeys(Email); 
	}
	
	public void clickCalenderIcon() {
		this.CalenderIcon.click(); 
	}
	

	public void sendBirthday(String Birthday) {
		this.Birthday.clear(); 
		this.Birthday.sendKeys(Birthday); 
	}
	
	public void clickGender() {
		this.Gender.click(); 
	}
	
	public void sendAddress(String Address) {
		this.Address.clear(); 
		this.Address.sendKeys(Address); 
	}
	
	public void sendPostalCode(String PostalCode) {
		this.PostalCode.clear(); 
		this.PostalCode.sendKeys(PostalCode); 
	}

	public void sendCity(String City) {
		this.City.clear(); 
		this.City.sendKeys(City); 
	}

	public void clickArea() {
		this.Area.click(); 
	}

	public void clickAreaOption() {
		this.AreaOption.click(); 
	}

	public void sendPhone(String Phone) {
		this.Phone.clear(); 
		this.Phone.sendKeys(Phone); 
	}
	
	public void sendMobilePhone(String MobilePhone) {
		this.MobilePhone.clear(); 
		this.MobilePhone.sendKeys(MobilePhone); 
	}
	
	public void sendFax(String Fax) {
		this.Fax.clear(); 
		this.Fax.sendKeys(Fax); 
	}
	
	public void sendURL(String URL) {
		this.URL.clear(); 
		this.URL.sendKeys(URL); 
	}
	
	public void sendPassword(String Password) {
		this.Password.clear(); 
		this.Password.sendKeys(Password); 
	}
	
	public void sendConfirmPassword(String ConfirmPassword) {
		this.ConfirmPassword.clear(); 
		this.ConfirmPassword.sendKeys(ConfirmPassword); 
	}
	
	public void sendCaptchaText(String CaptchaText) {
		this.CaptchaText.clear(); 
		this.CaptchaText.sendKeys(CaptchaText); 
	}
	
	public void clickSubmit() {
		this.Submit.click();
		
		}	
		
	public void clickOK() {
		this.OK.click();
		
		}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword1(String Password1) {
		this.Password1.clear(); 
		this.Password1.sendKeys(Password1); 
	}
	
	public void clickLoginBtn() {
		this.LoginBtn.click(); 
	}
	
	public void sendLogin(String Login) {
		this.Login.clear();
		this.Login.sendKeys(Login);
	}
	
	
	
	public void clickSubmit3() {
		this.Submit3.click(); 
	}
	
	public void clickNewGroup() {
		this.NewGroup.click(); 
	}
	
	public void clickDropdown() {
		this.Dropdown.click(); 
	}
	
	public void sendTextArea(String TextArea) {
		this.TextArea.clear(); 
		this.TextArea.sendKeys(TextArea); 
	}
	
	public void clickSubmit4() {
		this.Submit4.click();
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



	public void clickModifyLnk() {
		// TODO Auto-generated method stub
		
	}

	

	public void clickAddBtn() {
		// TODO Auto-generated method stub
		
	}

	public void clickMakePayment() {
		// TODO Auto-generated method stub
		
	}


	public void SendFullName(String string) {
		// TODO Auto-generated method stub
		
	}


	public void SendEmail(String string) {
		// TODO Auto-generated method stub
		
	}



	public void SendMember(String string) {
		// TODO Auto-generated method stub
		
	}


	

	public void CapthcaText(Object captchaVal) {
		// TODO Auto-generated method stub
		
	}






	


	

		
	


	
}

