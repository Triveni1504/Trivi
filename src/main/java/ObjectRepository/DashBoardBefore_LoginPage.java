package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardBefore_LoginPage {
	
	// Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
	@FindBy (xpath = "//button[.=' Register ']")private WebElement RegisterButn;
	@FindBy (xpath = "//button[.='Login']")private WebElement LoginButn;
	
	
	// Creating A Constructor to Intialize These WebElements.
	
	 public DashBoardBefore_LoginPage(WebDriver driver) {
	     PageFactory.initElements(driver,this);
		}
	 
	// Using Getters to Get Those WebElememts
	 
	 public WebElement getRegisterButn() {
			return RegisterButn;
		}


		public WebElement getLoginButn() {
			return LoginButn;
		}
		
		
	// Creating Business Libraries To Perform The Action What We Need	
			
		
		public void clickregister() {
			RegisterButn.click();
		}
		public void clicklogin() {
			LoginButn.click();
		}
		 

}
