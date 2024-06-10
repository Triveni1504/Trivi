package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Xyug_ContactUsPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
	
	@FindBy (xpath = "//input[@placeholder='Enter Your Name']") private WebElement NameEdit;
	@FindBy (xpath = "//input[@placeholder='Enter Your Mail']") private WebElement EmailEdit;
	@FindBy (xpath = "//input[@placeholder='Enter Your Mobile Number']") private WebElement  MobileNumEdit;
	@FindBy (xpath = "//textarea[@class='form-control']") private WebElement MessageEdit;
	@FindBy (xpath = "//button[.='SUBMIT']") private WebElement SubmitButn;
	
	
	//Creating A Constructor To Initialize These WebElements
	
	public Xyug_ContactUsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	
	 //Using Getters To Get Those WebElements


	public WebElement getNameEdit() {
		return NameEdit;
	}


	public WebElement getEmailEdit() {
		return EmailEdit;
	}


	public WebElement getMobileNumEdit() {
		return MobileNumEdit;
	}


	public WebElement getMessageEdit() {
		return MessageEdit;
	}


	public WebElement getSubmitButn() {
		return SubmitButn;
	}

	//Creating Business Libraries To Perform The Action What We Need
     
}
