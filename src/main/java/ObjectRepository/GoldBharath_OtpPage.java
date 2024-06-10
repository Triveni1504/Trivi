package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharath_OtpPage {
	
	// Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
	@FindBy (xpath = "(//input[@type='text'])[1]")private WebElement OtpVerificationEdit;
	
	
	//Creating A Constructor to Intialize These WebElements.
	 
		public GoldBharath_OtpPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}


		
	//Using Getters to Get Those WebElememts
		
		public WebElement getOtpVerificationEdit() {
			return OtpVerificationEdit;
		}
	
	//Creating Business Libraries To Perform The Action What We Need
		public void enterOtp(String validotp) {
			OtpVerificationEdit.sendKeys(validotp);
		}
		

}
