  

package ObjectRepository;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.ExcelUtility;
import GenricUtility.WebdriverUtility;

public class Xyug_DashBoard {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "(//a[.='Home'])[1]")private WebElement HomeLnk;
	@FindBy (xpath = "//a[.='About']")private WebElement AboutLnk;
	@FindBy (xpath = "//span[.='Services']")private WebElement ServicesLnk;
	@FindBy (xpath = "//a[.='Our Works']")private WebElement OurWorksLnk;
	@FindBy (xpath = "//span[.='Careers']")private WebElement CareersLnk;
	@FindBy (xpath = "//a[.='Work Shop']") private WebElement WorkShopLnk;
	@FindBy (xpath = "(//a[.='Blogs'])[1]")private WebElement BlogsLnk;
	@FindBy (xpath = "(//a[.='Contact Us'])[1]")private WebElement ContactUsBtn;
	@FindBy (xpath = "//a[.='Read more']") private WebElement ReadMoreBtn;
	@FindBy (xpath = "//button[.='Accept']") private WebElement AcceptBtn;
	@FindBy (xpath = "//button[.='Dismiss']") private WebElement DismissBtn;
	@FindBy (xpath = "//a[.='Software Development']") private WebElement SoftwareDevelopmentLnk;
	@FindBy (xpath = "//a[.='Mobile Application Development']") private WebElement mobileApplicationDevelopmentLnkElement;
	@FindBy (xpath = "//a[.='Digital Marketing']") private WebElement DigitalMarketingLnk;
	@FindBy (xpath = "//a[.='VFX/Video Editing']") private WebElement VideoEditingLnk;
	@FindBy (xpath = "//a[.='Metaverse']") private WebElement MetaverseLnk;
	@FindBy (xpath = "//a[.='Devops as Service']") private WebElement DevopsAsServiceLnk;
	@FindBy (xpath = "//a[.='UI/UX Design']") private WebElement UIUXDesign;
	@FindBy (xpath = "(//a[.='Contact Us'])[2]") private WebElement ContactLnk;
	@FindBy (xpath = "//input[@placeholder='Enter Your Name']") private WebElement NameEdt;
	@FindBy (xpath = "//input[@placeholder='Enter Your Mail']") private WebElement EmailEdt;
	@FindBy (xpath = "//input[@placeholder='Enter Your Mobile Number']") private WebElement MobileNumberEdt;
	@FindBy (xpath = "//textarea[@class='form-control']") private WebElement MessageEdt;
	@FindBy (xpath = "//button[.='SUBMIT']") private WebElement SubmitBtn;
	@FindBy (xpath = "(//a[@class='on-hover-color'])[1]") private WebElement NumberLnk;
	@FindBy (xpath = "(//a[@class='on-hover-color'])[2]") private WebElement EmailLnk;
	@FindBy (xpath = "//a[.='Website Policies']") private WebElement WebsitePoliticsLnk;
	@FindBy (xpath = "//a[.='X-YUG']") private WebElement XYUGLnk;
	@FindBy (xpath = "//lottie-player[@class='whatsapp-logo']") private WebElement WhatsUpLogo;
	@FindBy (xpath = "//i[@class='bi bi-arrow-up-short']") private WebElement ArrowBtn;
	@FindBy (xpath = "//a[@class='twitter']") private WebElement TwitterLnk;
	@FindBy (xpath = "//a[@class='facebook']") private WebElement Facebooklnk;
	@FindBy (xpath = "//a[@class='instagram']") private WebElement InstagramLnk;
	@FindBy (xpath = "//a[@class='linkedin']") private WebElement linkedInlnk;
	
	//Creating A Constructor To Initialize These WebElements
	
	public Xyug_DashBoard(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//Using Getters To Get Those WebElements
	
	public WebElement getHomeLnk() {
		return HomeLnk;
	}
	public WebElement getAboutLnk() {
		return AboutLnk;
	}
	public WebElement getServicesLnk() {
		return ServicesLnk;
	}
	public WebElement getOurWorksLnk() {
		return OurWorksLnk;
	}
	public WebElement getCareersLnk() {
		return CareersLnk;
	}
	public WebElement getWorkShopLnk() {
		return WorkShopLnk;
	}
	public WebElement getBlogsLnk() {
		return BlogsLnk;
	}
	public WebElement getContactUsBtn() {
		return ContactUsBtn;
	}
	public WebElement getReadMoreBtn() {
		return ReadMoreBtn;
	}
	public WebElement getAcceptBtn() {
		return AcceptBtn;
	}
	public WebElement getDismissBtn() {
		return DismissBtn;
	}
	public WebElement getSoftwareDevelopmentLnk() {
		return SoftwareDevelopmentLnk;
	}
	public WebElement getMobileApplicationDevelopmentLnkElement() {
		return mobileApplicationDevelopmentLnkElement;
	}
	public WebElement getDigitalMarketingLnk() {
		return DigitalMarketingLnk;
	}
	public WebElement getVideoEditingLnk() {
		return VideoEditingLnk;
	}
	public WebElement getMetaverseLnk() {
		return MetaverseLnk;
	}
	public WebElement getDevopsAsServiceLnk() {
		return DevopsAsServiceLnk;
	}
	public WebElement getUIUXDesign() {
		return UIUXDesign;
	}
	public WebElement getContactLnk() {
		return ContactLnk;
	}
	public WebElement getNameEdt() {
		return NameEdt;
	}
	public WebElement getEmailEdt() {
		return EmailEdt;
	}
	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}
	
	public WebElement getMessageEdt() {
		return MessageEdt;
	}
	
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	public WebElement getNumberLnk() {
		return NumberLnk;
	}
	public WebElement getEmailLnk() {
		return EmailLnk;
	}
	public WebElement getWebsitePoliticsLnk() {
		return WebsitePoliticsLnk;
	}
	public WebElement getXYUGLnk() {
		return XYUGLnk;
	}
	public WebElement getWhatsUpLogo() {
		return WhatsUpLogo;
	}
	public WebElement getArrowBtn() {
		return ArrowBtn;
	}
	public WebElement getTwitterLnk() {
		return TwitterLnk;
	}
	public WebElement getFacebooklnk() {
		return Facebooklnk;
	}
	public WebElement getInstagramLnk() {
		return InstagramLnk;
	}
	public WebElement getLinkedInlnk() {
		return linkedInlnk;
	}
	
	// Creating Business Libraries To Perform The Action What We Need
	
	
	  public void Xyughome(WebDriver driver) throws Exception {
    	WebdriverUtility wu=new WebdriverUtility();
    	ExcelUtility eu=new ExcelUtility();
    	String name=eu.getdataFromExcel("Sheet1", 1, 1);
    	String email=eu.getdataFromExcel("Sheet1", 2, 1);
    	String Mnumber=eu.getdataFromExcel("Sheet1", 3, 1);
    	String msgbox=eu.getdataFromExcel("Sheet1", 4, 1);
    	
        wu.waitforloadelements(driver);
        ReadMoreBtn.click();
    	wu.thread(driver);
    	wu.takeScreenShot(driver,"Readmore");
    	wu.thread(driver);
    	wu.scrolldown1(driver);
    	wu.thread(driver);
    	wu.takeScreenShot(driver, "Contact Us");
  	    
    	ContactLnk.click();
  	    wu.scrolldown8(driver);
  	    wu.scrollUp1(driver);
  	    wu.thread(driver);
  	    wu.takeScreenShot(driver, "details");
  	    wu.thread(driver);
        Navigation n=driver.navigate();
        n.back();
        wu.scrolldown(driver);
        
        NameEdt.sendKeys(name);
    	EmailEdt.sendKeys(email);
    	MobileNumberEdt.sendKeys(Mnumber);
   	    MessageEdt.sendKeys(msgbox);
   	    wu.thread(driver);
   	    //wu.scrolldown8(driver);
   	    wu.scrolldown8(driver);
   	    wu.thread(driver);
   	    wu.scrolldown03(driver);
   	    SubmitBtn.click();
   	    wu.thread(driver);
   	    wu.thread(driver);
   	    Navigation nav=driver.navigate();
        nav.back();
        wu.thread(driver);
        
        wu.scrolldown(driver);
        wu.thread(driver);
        wu.scrolldown(driver);
        String ParentWindow = driver.getWindowHandle();
        WebsitePoliticsLnk.click();
        wu.thread(driver);
        Set<String> ChildWindow = driver.getWindowHandles();
        wu.switchtoChildWindow(driver, ParentWindow, ChildWindow);
        wu.takeScreenShot(driver, "Xyugwebsite");
      	driver.close();
        wu.switchToParentWindow(driver, ParentWindow);
      	wu.thread(driver);
      	
      	
      	ArrowBtn.click();
    	wu.thread(driver);
     }
	public void ClickAboutPage(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.waitforloadelements(driver);
		wu.thread(driver);
		AboutLnk.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "AbouyLnk");
	}
	
	public void clickWorkShop(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.mouseoveraction(driver, CareersLnk);
		wu.waitforloadelements(driver);
		wu.thread(driver);
		wu.takeScreenShot(driver, "Carrers DropDown");
		wu.thread(driver);
		WorkShopLnk.click();
	}
	public void ClickServices(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.mouseoveraction(driver, ServicesLnk);
		wu.waitforloadelements(driver);
		wu.thread(driver);
		wu.takeScreenShot(driver, "Services Page");
		wu.thread(driver);
		SoftwareDevelopmentLnk.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "SoftwareDevlp");
	}
	public void ClickServicesmobileapp(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.mouseoveraction(driver, ServicesLnk);
		wu.waitforloadelements(driver);
		wu.takeScreenShot(driver, "Services");
		mobileApplicationDevelopmentLnkElement.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "MobileAplnDevlp");
		
	}
	public void ClickDigitalMarketing(WebDriver driver) throws Exception {
		 WebdriverUtility wu=new WebdriverUtility();
		 wu.mouseoveraction(driver, ServicesLnk);
		 wu.thread(driver);
		 DigitalMarketingLnk.click();
		 wu.thread(driver);
		 wu.takeScreenShot(driver, "Digital Marketing Page");
	}
    public void ClickVFXVideoEditing(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.mouseoveraction(driver, ServicesLnk);
		wu.waitforloadelements(driver);
		VideoEditingLnk.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "VideoEditingPage");
	}
    
    public void ClickMetaverse(WebDriver driver) throws Exception {
		 WebdriverUtility wu=new WebdriverUtility();
		 wu.waitforloadelements(driver);
		 wu.mouseoveraction(driver, ServicesLnk);
		 wu.thread(driver);
		 MetaverseLnk.click();
		 wu.thread(driver);
		 wu.takeScreenShot(driver, "MetaversePage");
    }
    public void ClickDevopsAsService(WebDriver driver) throws Exception {
		 WebdriverUtility wu=new WebdriverUtility();
		 wu.waitforloadelements(driver);
		 wu.mouseoveraction(driver, ServicesLnk);
		 wu.thread(driver);
		 DevopsAsServiceLnk.click();
		 wu.thread(driver);
		 wu.takeScreenShot(driver, "DevopsAsService");
   }
    public void ClickUIUXDesign(WebDriver driver) throws Exception {
		 WebdriverUtility wu=new WebdriverUtility();
		 wu.waitforloadelements(driver);
		 wu.mouseoveraction(driver, ServicesLnk);
		 wu.thread(driver);
		 UIUXDesign.click();
		 wu.thread(driver);
		 wu.takeScreenShot(driver, "UIUXDesign");
   }
    public void ClickOurWorks(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.waitforloadelements(driver);
		wu.thread(driver);
		OurWorksLnk.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "OurWorksLnk");
	}
	
		
	
   }
