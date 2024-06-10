package ObjectRepository;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.WebdriverUtility;

public class Xyug_MobileApplicationDevelopmentService {
	
//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "(//a[@class='btn btn-primary-gradient py-sm-3 px-4 px-sm-5 rounded-pill me-3 animated slideInLeft'])[1]") private WebElement ReadmoreBtn1;
	@FindBy (xpath = "(//a[@class='btn btn-secondary-gradient py-sm-3 px-4 px-sm-5 rounded-pill animated slideInRight'])[1]") private WebElement ContactUsBtn;
	@FindBy (xpath = "(//a[.='Read More'])[1]") private WebElement ReadMorebtn2;
	@FindBy (xpath = "(//a[.='Read More'])[2]") private WebElement ReadMoreBtn3;
	@FindBy (xpath = "(//a[@target='_blank'])[1]") private WebElement AvailableOnAppStoreBtn;
	@FindBy (xpath = "(//a[@target='_blank'])[2]") private WebElement AvailableOnPlayStoreBtn;
	@FindBy (xpath = "//i[@class='bi bi-chevron-left']") private WebElement LeftMoveBtn;
	@FindBy (xpath = "//i[@class='bi bi-chevron-right']") private WebElement RightMoveBtn;

//Creating A Constructor To Initialize These WebElements	
	
	
	public Xyug_MobileApplicationDevelopmentService(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

//Using Getters To Get Those WebElements	
	
	public WebElement getReadmoreBtn1() 
	{
		return ReadmoreBtn1;
	}
	public WebElement getContactUsBtn() 
	{
		return ContactUsBtn;
	}
	public WebElement getReadMorebtn2() 
	{
		return ReadMorebtn2;
	}
	public WebElement getReadMoreBtn3() 
	{
		return ReadMoreBtn3;
	}
	public WebElement getAvailableOnAppStoreBtn() 
	{
		return AvailableOnAppStoreBtn;
	}
	public WebElement getAvailableOnPlayStoreBtn() 
	{
		return AvailableOnPlayStoreBtn;
	}
	public WebElement getLeftMoveBtn() 
	{
		return LeftMoveBtn;
	}
	public WebElement getRightMoveBtn() 
	{
		return RightMoveBtn;
	}
	
	
// Creating Business Libraries To Perform The Action What We Need	
	
	public void PerformeMobileApplication(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.waitforloadelements(driver);
		wu.takeScreenShot(driver, "Mobile Application Page");
		
		ReadmoreBtn1.click();
		wu.thread(driver);
		wu.thread(driver);
		wu.takeScreenShot(driver, "Read More Page1");
		wu.thread(driver);
		wu.scrollUp(driver);
		wu.thread(driver);
		wu.scrollUp(driver);
		
		ContactUsBtn.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "Contacts Page");
		wu.thread(driver);
		wu.back(driver);
     	wu.scrolldown2(driver);
     	wu.thread(driver);
     	
     	ReadMorebtn2.click();
     	wu.thread(driver);
     	wu.takeScreenShot(driver, "Read More Page2");
     	wu.thread(driver);
     	
     	ReadMoreBtn3.click();
     	wu.thread(driver);
     	wu.takeScreenShot(driver, "ReadMore Page3");
     	wu.thread(driver);
     	wu.scrolldown2(driver);
     	wu.thread(driver);
     	
     	String ParentWindow=driver.getWindowHandle();
     	AvailableOnAppStoreBtn.click();
     	wu.thread(driver);
     	Set<String> ChildWindow=driver.getWindowHandles();
     	wu.switchtoChildWindow(driver,ParentWindow,ChildWindow);
     	wu.takeScreenShot(driver, "AvailableOnAppStore Page");
     	wu.thread(driver);
     	driver.close();
     	wu.switchToParentWindow(driver, ParentWindow);
     	wu.thread(driver);
     	
     	String ParentWindow1=driver.getWindowHandle();
     	AvailableOnPlayStoreBtn.click();
     	wu.thread(driver);
     	Set<String> ChildWindow1=driver.getWindowHandles();
     	wu.switchtoChildWindow(driver, ParentWindow1, ChildWindow1);
     	wu.takeScreenShot(driver, "AvailableOnplayStore Page");
     	wu.thread(driver);
     	driver.close();
     	wu.switchToParentWindow(driver, ParentWindow1);
     	wu.thread(driver);
     	wu.scrolldown03(driver);
     	wu.thread(driver);
     	
     	LeftMoveBtn.click();
     	Thread.sleep(1000);
     	wu.takeScreenShot(driver, "Left Move Paage");
     	wu.thread(driver);
     	
     	RightMoveBtn.click();
     	Thread.sleep(1000);
     	wu.takeScreenShot(driver, "Right Move Page");
     	wu.thread(driver);

	}
}