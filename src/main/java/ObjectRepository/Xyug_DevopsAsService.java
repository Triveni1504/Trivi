package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenricUtility.WebdriverUtility;

public class Xyug_DevopsAsService {
	
//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	
    @FindBy (xpath = "//button[.='Read More']") private WebElement ReadMoreBtn;
	
//Creating A Constructor To Initialize These WebElements
    
    public Xyug_DevopsAsService(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
  
//Using Getters To Get Those WebElements	
    
    public WebElement getReadMoreBtn() 
	{
		return ReadMoreBtn;
	}
	
 // Creating Business Libraries To Perform The Action What We Need
    
    public void performeDevops(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.waitforloadelements(driver);
		wu.thread(driver);
		wu.takeScreenShot(driver, "Devops As Service Home Page");
		ReadMoreBtn.click();
		Thread.sleep(5000);
		wu.takeScreenShot(driver, "Devops As Service Read More Page");
		wu.thread(driver);
	}
	
}



