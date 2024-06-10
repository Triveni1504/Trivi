package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.WebdriverUtility;

public class Xyug_VFXVedioEditingService {
	
//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
	
	@FindBy (xpath = "//button[contains(text(),'Read')] ") private WebElement ReadMoreBtn;
	@FindBy (xpath = "(//button[.='Contact us'])[2]") private WebElement ContactUsBtn;
	@FindBy (xpath = "(//div[@title='Menu'])[1]") private WebElement MoreBtn1;
	@FindBy (xpath = "//div[@title='Zoom In']") private WebElement ZoomInBtn;
	@FindBy (xpath = "//div[@title='Zoom Out']") private WebElement ZoomOutBtn;
	@FindBy (xpath = "//div[@title='Selection Zoom']") private WebElement SelectionZoomBtn;
	@FindBy (xpath = "//div[@title='Panning']") private WebElement planningBtn;
	@FindBy (xpath = "//div[@title='Reset Zoom']") private WebElement ResetZoomBtn;
	@FindBy (xpath = "(//div[@title='Menu'])[2]") private WebElement MoreBtn2;
	@FindBy (xpath = "(//button[@role='button'])[1]") private WebElement SlideBtn1;
	@FindBy (xpath = "(//button[@role='button'])[2]") private WebElement Slidebn2;

//Creating A Constructor To Initialize These WebElements	
	
	public Xyug_VFXVedioEditingService(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

//Using Getters To Get Those WebElements

	public WebElement getReadMoreBtn() 
	{
		return ReadMoreBtn;
	}
	public WebElement getContactUsBtn() 
	{
		return ContactUsBtn;
	}
	public WebElement getMoreBtn1()
	{
		return MoreBtn1;
	}
	public WebElement getZommInBtn() 
	{
		return ZoomInBtn;
	}
	public WebElement getZoomOutBtn() 
	{
		return ZoomOutBtn;
	}
	public WebElement getSelectionZoomBtn() 
	{
		return SelectionZoomBtn;
	}
	public WebElement getPlanningBtn() 
	{
		return planningBtn;
	}
	public WebElement getRresetZoomBtn() 
	{
		return ResetZoomBtn;
	}
	public WebElement getMoreBtn2() 
	{
		return MoreBtn2;
	}
	public WebElement getSlideBtn1() 
	{
		return SlideBtn1;
	}
	public WebElement getSlidebn2() 
	{
		return Slidebn2;
	}
	
	public void performeVFXOperations(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		ReadMoreBtn.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "Read More Page");
		wu.thread(driver);
		wu.scrollUp1(driver);
		Thread.sleep(1000);
		
		MoreBtn1.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "More Page1");
		Thread.sleep(2000);
		
		ContactUsBtn.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "Contact Us Page");
		wu.back(driver);
		Thread.sleep(1000);
		wu.scrolldown2(driver);
		wu.thread(driver);
		
    	ZoomInBtn.click();
		wu.takeScreenShot(driver, "Zoom In Page");
		Thread.sleep(1000);
		
		ResetZoomBtn.click();
		wu.takeScreenShot(driver, "Zoom Home Page");
		wu.thread(driver);
		
		ZoomOutBtn.click();
		wu.takeScreenShot(driver, "Zoom Out Page");
		Thread.sleep(1000);
		
		MoreBtn2.click();
		Thread.sleep(1000);
		wu.takeScreenShot(driver, "More page2");
		wu.thread(driver);
		wu.scrolldown7(driver);
		wu.thread(driver);
		
		SlideBtn1.click();
		wu.takeScreenShot(driver, "Slide Btn1");
		wu.thread(driver);
		
		Slidebn2.click();
		wu.takeScreenShot(driver, "Slide Btn2");
		
		
	}


}
