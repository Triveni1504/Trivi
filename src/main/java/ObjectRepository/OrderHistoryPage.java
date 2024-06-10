package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
    @FindBy(xpath = "//select[@class='formselect-gold-value']")private WebElement SelectOrderTypeDropdown ;
    @FindBy(xpath = "//option[.='BUY']")private WebElement BuyOption;
    @FindBy(xpath = "//option[.='BOOK']")private WebElement BookOption;
    @FindBy (xpath = "(//img[@class='googleplay'])[1]")private WebElement GoogleplayButn;
	@FindBy (xpath = "(//img[@class='googleplay'])[2]")private WebElement AppStoreButn;
	@FindBy (xpath = "//i[@class='fa-brands fa-facebook']")private WebElement FacebookLink;
	@FindBy (xpath = "//i[@class='fa-brands fa-instagram']")private WebElement InstagramLink;
	@FindBy (xpath = "//i[@class='fa-brands fa-linkedin']")private WebElement LinkedinLink;
	@FindBy (xpath = "//i[@class='fa-brands fa-twitter']")private WebElement TwitterLink;
	@FindBy (xpath = "//a[.=' X-YUG Technologies']")private WebElement XYUGTechLink;
	
	//Creating A Constructor To Initialize These WebElement
	 
		 public OrderHistoryPage(WebDriver driver) 
		    {
			PageFactory.initElements(driver,this);
		    }
   // Using Getters To Get Those WebElements

		public WebElement getSelectOrderTypeDropdown() {
			return SelectOrderTypeDropdown;
		}

		public WebElement getBuyOption() {
			return BuyOption;
		}

		public WebElement getBookOption() {
			return BookOption;
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

		public WebElement getXYUGTechLink() {
			return XYUGTechLink;
		}
		 
		 
    // Creating Business Libraries To Perform The Action What We Need 
}
