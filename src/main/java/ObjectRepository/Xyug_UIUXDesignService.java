package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.WebdriverUtility;

public class Xyug_UIUXDesignService {
	
	
	@FindBy (xpath = "//a[.='Read More']") private WebElement ReadMorebtn;
	@FindBy (xpath = "//a[.='Learn More']") private WebElement LearnMoreBtn;
	@FindBy (xpath = "(//a[@class='collapse'])[1]") private WebElement DesignThinkingApproach;
	@FindBy (xpath = "(//a[@class='collapsed'])[1]") private WebElement VisualDesign;
	@FindBy (xpath = "(//a[contains(@class,'collapsed')])[2]") private WebElement InteractionDesign;
	
	public Xyug_UIUXDesignService(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getReadMorebtn() 
	{
		return ReadMorebtn;
	}
	public WebElement getLearnMoreBtn() 
	{
		return LearnMoreBtn;
	}
	public WebElement getDesignThinkingApproach() 
	{
		return DesignThinkingApproach;
	}
	public WebElement getVisualDesign() 
	{
		return VisualDesign;
	}
	public WebElement getInteractionDesign() 
	{
		return InteractionDesign;
	}
	
	public void PerformeUIUXPage(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		Thread.sleep(5000);
		wu.takeScreenShot(driver, "UI UX Design Page");
		wu.thread(driver);
		ReadMorebtn.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "UI UX Read More Page");
		LearnMoreBtn.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "UI UX Design Learn More Page");
		Thread.sleep(1000);
		wu.scrollUp2(driver);
		wu.thread(driver);
		wu.takeScreenShot(driver, "DesignThinkingApproach DropDown");
		wu.thread(driver);
		DesignThinkingApproach.click();
		Thread.sleep(1000);
		VisualDesign.click();
		Thread.sleep(1000);
		wu.takeScreenShot(driver, "Visual Design DropDown");
		wu.thread(driver);
		InteractionDesign.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "Interaction Design DropDown");
		wu.thread(driver);
		
	}
	


}
