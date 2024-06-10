package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class GolBharathAdmin_ManageDistributor {
	
	// Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations.
	
			@FindBy(xpath = "//input[@placeholder='Search']")private WebElement SearchTextFeild;
			@FindBy(xpath = "(//input[@role='switch'])[2]")private WebElement SwitchButn;
			@FindBy(xpath = "(//i[@class='fa fa-pencil'])[2]")private WebElement PencilEditButn;
			@FindBy(xpath = "(//i[@class='fa fa-eye'])[2]")private  WebElement EyeButn;
			@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")private WebElement PreviousLink;
			@FindBy(xpath = "(//a[@class='ng-star-inserted'])[2]")private WebElement NextLink;
			@FindBy(xpath = "//i[@class='fa-solid fa-ellipsis-vertical icon-vertical ng-star-inserted']")private WebElement VerticalNaviIcon;
			@FindBy(xpath = "//i[@class='fa-solid fa-power-off user-icon']")private WebElement LogoutButn;
			
	// Creating A Constructor to Intialize These WebElements. 

			public GolBharathAdmin_ManageDistributor(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}

   // Using Getters to Get Those WebElememts
			
			public WebElement getSearchTextFeild() {
				return SearchTextFeild;
			}


			public WebElement getSwitchButn() {
				return SwitchButn;
			}


			public WebElement getPencilEditButn() {
				return PencilEditButn;
			}


			public WebElement getEyeButn() {
				return EyeButn;
			}


			public WebElement getPreviousLink() {
				return PreviousLink;
			}


			public WebElement getNextLink() {
				return NextLink;
			}


			public WebElement getVerticalNaviIcon() {
				return VerticalNaviIcon;
			}

			public WebElement getLogoutButn() {
				return LogoutButn;
			}

	
			// Creating Business Libraries To Perform The Action What We Need	
 		
			

}
