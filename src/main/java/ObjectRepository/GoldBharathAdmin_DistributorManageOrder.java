package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharathAdmin_DistributorManageOrder {
	
	// Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
		@FindBy(xpath = "//button[.='Buy Order']")private WebElement BuyOrderButn;
		@FindBy(xpath = "//button[.='Book Order']")private WebElement BookOrderButn;
		@FindBy(xpath = "//input[@placeholder='Search']")private WebElement SearchTextFeild;
		@FindBy(xpath = "(//a[@class='ng-star-inserted'])[4]")private WebElement NextLink;
		@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")private WebElement PreviousLink;
		@FindBy(xpath = "//i[@class='fa-solid fa-power-off user-icon']")WebElement LogoutButn;
		
   // Creating A Constructor to Intialize These WebElements. 

		public GoldBharathAdmin_DistributorManageOrder(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}
   // Using Getters to Get Those WebElememts
		
		public WebElement getBuyOrderButn() {
			return BuyOrderButn;
		}

		public WebElement getBookOrderButn() {
			return BookOrderButn;
		}

		public WebElement getSearchTextFeild() {
			return SearchTextFeild;
		}

		public WebElement getNextLink() {
			return NextLink;
		}

		public WebElement getPreviousLink() {
			return PreviousLink;
		}

		public WebElement getLogoutButn() {
			return LogoutButn;
		}

	// Creating Business Libraries To Perform The Action What We Need	
		

}
