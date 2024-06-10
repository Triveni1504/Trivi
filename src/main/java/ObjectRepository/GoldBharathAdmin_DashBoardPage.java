package ObjectRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharathAdmin_DashBoardPage {
	
	// Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
		@FindBy(xpath = "//p[.=' All Distributor ']")private WebElement AllDistributorButn;
		@FindBy(xpath = "//i[@class='fa fa-arrow-circle-right myrightcircle']")private WebElement ManageArrowSymbol;
		@FindBy(xpath = "//i[@class='fa-solid fa-power-off user-icon']")private WebElement LogoutButn;
		@FindBy(xpath = "//span[.='Manage Distributor']")private WebElement ManageDistributorButn;
		@FindBy(xpath = "//span[.='Distributor Manage Order']")private WebElement DistributorManageOrderButn;
		
   // Creating A Constructor to Intialize These WebElements. 

		public GoldBharathAdmin_DashBoardPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

  // Using Getters to Get Those WebElememts	
		
		public WebElement getAllDistributorButn() {
			return AllDistributorButn;
		}

		public WebElement getManageArrowSymbol() {
			return ManageArrowSymbol;
		}

		public WebElement getLogoutButn() {
			return LogoutButn;
		}

		public WebElement getManageDistributorButn() {
			return ManageDistributorButn;
		}

		public WebElement getDistributorManageOrderButn() {
			return DistributorManageOrderButn;
		}

   
 // Creating Business Libraries To Perform The Action What We Need	
	
}