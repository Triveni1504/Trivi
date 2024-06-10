package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GolBharath_LoginPage {
	
  // Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
	@FindBy (xpath = "//input[@formcontrolname='phone']")private WebElement EnterYourNumberEdit;
	 
	 @FindBy (xpath = "//button[.='Login']")private WebElement LoginBtn;
	 
	 @FindBy (xpath = "//span[.='Register']")private WebElement RegisterLink;
	 
	 
	 
   // Creating A Constructor to Intialize These WebElements. 
	 
	 public GolBharath_LoginPage(WebDriver driver) {
	     PageFactory.initElements(driver,this);
		}

   // Using Getters to Get Those WebElememts
	
	 public WebElement getEnterYourNumberEdit() {
			return EnterYourNumberEdit;
		}

		public WebElement getLoginBtn() {
			return LoginBtn;
		}
		public WebElement getRegisterLink() {
			return RegisterLink;
		}

		
  // Creating Business Libraries To Perform The Action What We Need
	
	public void loginOperation(String pnum) {
		EnterYourNumberEdit.sendKeys(pnum);
		LoginBtn.click(); 
	}
	

}
