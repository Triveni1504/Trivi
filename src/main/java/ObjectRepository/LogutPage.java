package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogutPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "//button[.='Ok']")private WebElement OkButn;
	@FindBy (xpath = "//button[.='Cancel']")private WebElement CancelButn;
	
	//Creating A Constructor To Initialize These WebElement
	 
	 public LogutPage(WebDriver driver) 
	    {
		PageFactory.initElements(driver,this);
	    }
    // Using Getters To Get Those WebElements

	public WebElement getOkButn() {
		return OkButn;
	}

	public WebElement getCancelButn() {
		return CancelButn;
	}
	 
	// Creating Business Libraries To Perform The Action What We Need 
	

}
