package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_RegisterPage {
	
	// Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
	 @FindBy (xpath = "//input[@formcontrolname='businessName']")private WebElement BuisnessNameEdit;
	
	 @FindBy (xpath = "//input[@formcontrolname='personName']")private WebElement PersonFullNameEdit;
	 
	 @FindBy (xpath = "//input[@formcontrolname='email']")private WebElement EmailEdit;
	 
	 @FindBy (xpath = "//input[@formcontrolname='phone']")private WebElement PhoneNumberEdit;
	 
	 @FindBy (xpath = "//input[@formcontrolname='establishedDate']")private WebElement ShopEstablishDate;
	 
	 @FindBy (xpath = "//input[@formcontrolname='pincode']")private WebElement PincodeEdit;
	 
	 @FindBy (xpath = "(//input[@formcontrolname='circle'])[4]")private WebElement CircleCheckBox;
	 
	 @FindBy (xpath = "//textarea[@formcontrolname='businessAddress']")private WebElement BuisinessAddressEdit;
	 
	 @FindBy (xpath = "//button[.= ' Register ']")private WebElement RegisterBtn;
	 
	 
	//Creating A Constructor to Intialize These WebElements.
	 
	public GoldBharath_RegisterPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//Using Getters to Get Those WebElememts
	public WebElement getBuisnessNameEdit() {
		return BuisnessNameEdit;
	}

	public WebElement getPersonFullNameEdit() {
		return PersonFullNameEdit;
	}

	public WebElement getEmailEdit() {
		return EmailEdit;
	}

	public WebElement getPhoneNumberEdit() {
		return PhoneNumberEdit;
	}

	public WebElement getShopEstablishDate() {
		return ShopEstablishDate;
	}

	public WebElement getPincodeEdit() {
		return PincodeEdit;
	}

	public WebElement getCircleCheckBox() {
		return CircleCheckBox;
	}

	public WebElement getBuisinessAddressEdit() {
		return BuisinessAddressEdit;
	}

	public WebElement getRegisterBtn() {
		return RegisterBtn;
	}
	
  //Creating Business Libraries To Perform The Action What We Need
   
	public void givingUserDetails(String bname,String pname,String pemail,String pnum,String dat,String pin) {
		BuisnessNameEdit.sendKeys(bname);
		PersonFullNameEdit.sendKeys(pname);
		EmailEdit.sendKeys(pemail);
		PhoneNumberEdit.sendKeys(pnum);
		ShopEstablishDate.sendKeys(dat);
		PincodeEdit.sendKeys(pin);
	 }
	 

	public void givingBuisnessAddress(String badd) {
		CircleCheckBox.click();
		BuisinessAddressEdit.sendKeys(badd);
		RegisterBtn.click();
	 }

}
