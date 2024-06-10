package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class X_YugServicesPage {
	
	  //Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
		@FindBy (xpath = "(//a[.='Software Development'])[1]") private WebElement SoftwareDevelopmentLnk;
		
		@FindBy (xpath = "//a[.='Mobile Application Development']") private WebElement MobileApplicationDevelopmentLnk;
		
		@FindBy (xpath = "(//a[.='Digital Marketing'])[1]") private WebElement DigitalMarketingLnk;
		
		@FindBy (xpath = "//a[.='VFX/Video Editing']") private WebElement VideoEditingLnk;
		
		@FindBy (xpath = "(//a[.='Metaverse'])[1]") private WebElement MetaverseLnk;
		
		@FindBy (xpath = "//a[.='Devops as Service']") private WebElement DevopsAsServicelnk;
		
		@FindBy (xpath = "//a[.='UI/UX Design']") private WebElement UIUXDesignlnk;
		
		//Creating A Constructor To Initialize These WebElements
		
		public X_YugServicesPage(WebDriver driver) 
		{
		 PageFactory.initElements(driver,this);
		}
		
		//Using Getters To Get Those WebElements
		
		public WebElement getSoftwareDevelopmentLnk() 
		{
			return SoftwareDevelopmentLnk;
		}
		public WebElement getMobileApplicationDevelopmentLnk() 
		{
			return MobileApplicationDevelopmentLnk;
		}
		public WebElement getDigitalMarketingLnk()
		{
			return DigitalMarketingLnk;
		}
		public WebElement getVideoEditingLnk() 
		{
			return VideoEditingLnk;
		}
		public WebElement getMetaverseLnk() 
		{
			return MetaverseLnk;
		}
		public WebElement getDevopsAsServicelnk() 
		{
			return DevopsAsServicelnk;
		}
		public WebElement getUIUXDesignlnk() 
		{
			return UIUXDesignlnk;
		}
		
		//Creating Business Libraries To Perform The Action What We Need
		
	}

	
	


