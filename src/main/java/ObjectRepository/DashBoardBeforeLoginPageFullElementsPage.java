package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardBeforeLoginPageFullElementsPage
{
	
	// Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
	@FindBy (xpath = "//button[.=' Register ']")private WebElement RegisterButn;
	@FindBy (xpath = "//button[.='Login']")private WebElement LoginButn;
	@FindBy (xpath = "//li[.='About Us']")private WebElement AboutUsLink;
	@FindBy (xpath = "//li[.=' Booking ']")private WebElement BookingLink;
	@FindBy (xpath = "//li[.=' Chart ']")private WebElement ChartLink;
	@FindBy (xpath = "//li[.=' Live Rates ']")private WebElement LiveratesLink;
	@FindBy (xpath = "//li[.=' Locate Us ']")private WebElement LocateUsLink;
	@FindBy (xpath = "//li[.=' Margin ']")private WebElement MarginLink;
	@FindBy (xpath = "//li[.=' Privacy Policy ']")private WebElement PrivacyPolicyLink;
	@FindBy (xpath = "//li[.='Products']")private WebElement ProductsLink;
	@FindBy (xpath = "//li[.=' Rate Alert ']")private WebElement LiveRateLink;
	@FindBy (xpath = "(//img[@class='googleplay'])[1]")private WebElement GoogleplayButn;
	@FindBy (xpath = "(//img[@class='googleplay'])[2]")private WebElement AppStoreButn;
	@FindBy (xpath = "//i[@class='fa-brands fa-facebook']")private WebElement FacebookLink;
	@FindBy (xpath = "//i[@class='fa-brands fa-instagram']")private WebElement InstagramLink;
	@FindBy (xpath = "//i[@class='fa-brands fa-linkedin']")private WebElement LinkedinLink;
	@FindBy (xpath = "//i[@class='fa-brands fa-twitter']")private WebElement TwitterLink;
	@FindBy (xpath = "//a[.=' X-YUG Technologies']")private WebElement XYUGTechLink;

	
	// Creating A Constructor to Intialize These WebElements. 
	 public DashBoardBeforeLoginPageFullElementsPage(WebDriver driver) {
	     PageFactory.initElements(driver,this);
		}
    
	// Using Getters to Get Those WebElememts
	 

	public WebElement getRegisterButn() {
		return RegisterButn;
	}


	public WebElement getLoginButn() {
		return LoginButn;
	}
    
	public WebElement getAboutUsLink() {
		return AboutUsLink;
	}

	public WebElement getBookingLink() {
		return BookingLink;
	}

	public WebElement getChartLink() {
		return ChartLink;
	}

	public WebElement getLiveratesLink() {
		return LiveratesLink;
	}

	public WebElement getLocateUsLink() {
		return LocateUsLink;
	}

	public WebElement getMarginLink() {
		return MarginLink;
	}

	public WebElement getPrivacyPolicyLink() {
		return PrivacyPolicyLink;
	}

	public WebElement getProductsLink() {
		return ProductsLink;
	}

	public WebElement getLiveRateLink() {
		return LiveRateLink;
	}

	public WebElement getXYUGTechLink() {
		return XYUGTechLink;
	}
	public WebElement getGoogleplayButn() {
		return GoogleplayButn;
	}

	public WebElement getAppStoreButn() {
		return AppStoreButn;
	}

	public WebElement getFacebookLink() {
		return FacebookLink;
	}

	public WebElement getInstagramLink() {
		return InstagramLink;
	}

	public WebElement getLinkedinLink() {
		return LinkedinLink;
	}

	public WebElement getTwitterLink() {
		return TwitterLink;
	}

	
	
   // Creating Business Libraries To Perform The Action What We Need	
	
	public void clickregister() {
		RegisterButn.click();
	}
	public void clicklogin() {
		LoginButn.click();
	}
	 
		
}
