package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharathAdmin_LogoutPage {
	
	

	// Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
		@FindBy(xpath = "//button[.='Yes']")private WebElement LogoutYesButn;
		@FindBy(xpath = "(//button[.='No'])[2]")private WebElement LogoutNoButn;
		
	// Creating A Constructor to Intialize These WebElements. 

		public GoldBharathAdmin_LogoutPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
					}
    // Using Getters to Get Those WebElememts

		public WebElement getLogoutYesButn() {
			return LogoutYesButn;
		}

		public WebElement getLogoutNoButn() {
			return LogoutNoButn;
		}
		
   // Creating Business Libraries To Perform The Action What We Need	

}
