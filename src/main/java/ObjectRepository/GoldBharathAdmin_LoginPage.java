package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharathAdmin_LoginPage {
	
	// Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
	@FindBy(xpath = "//input[@placeholder='Enter User Name']")private WebElement UserNameEdit;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement PasswordEdit;
	@FindBy (xpath = "//button[@type='submit']")private WebElement LoginButn;
	
	// Creating A Constructor to Intialize These WebElements. 

	public GoldBharathAdmin_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	// Using Getters to Get Those WebElememts

	public WebElement getUserNameEdit() {
		return UserNameEdit;
	}
    public WebElement getPasswordEdit() {
		return PasswordEdit;
	}
    public WebElement getLoginButn() {
		return LoginButn;
	}
	
  //Creating Business Libraries To Perform The Action What We Need

}
