package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessKycPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	 @FindBy (xpath = "//option[.='Select Type']")private WebElement SelectTypeDropDown;
	 @FindBy (xpath = "//option[.='Proprietor']")private WebElement PropretorOption;
	 @FindBy (xpath = "//option[.='LLP']")private WebElement LlpOption;
	 @FindBy (xpath = "//option[.='Pvt LTD']")private WebElement PvtltdOption;
	 @FindBy (xpath = "//option[.='LTD']")private WebElement LtdOption;
	 @FindBy (xpath = "//input[@formcontrolname='proprietor_name']")private WebElement ProprietorNameEdit;
	 @FindBy (xpath = "//input[@formcontrolname='proprietor_pan']")private WebElement ProprietorPanNoEdit;
	 @FindBy (xpath = "//input[@formcontrolname='proprietor_pan_image']")private WebElement ProprietorPanImg ;
	 @FindBy (xpath = "//input[@formcontrolname='proprietor_gst']")private WebElement ProprietorGstNoEdit;
	 @FindBy (xpath = "//input[@formcontrolname='proprietor_gst_image']")private WebElement ProprietorGstNoImg;
	 @FindBy (xpath = "//input[@formcontrolname='bank_name']")private WebElement BankNameEdit;
	 @FindBy (xpath = "//input[@formcontrolname='account_number']")private WebElement AccNumberEdit;
	 @FindBy (xpath = "//input[@formcontrolname='ifsc_code']")private WebElement IfscCodeEdit;
	 @FindBy (xpath = "//input[@formcontrolname='account_holder_name']")private WebElement AccHolderNameEdit;
	 @FindBy (xpath = "//button[.='Submit']")private WebElement SubmitButn;
     @FindBy (xpath = "(//img[@class='googleplay'])[1]")private WebElement GoogleplayButn;
	 @FindBy (xpath = "(//img[@class='googleplay'])[2]")private WebElement AppStoreButn;
	 @FindBy (xpath = "//i[@class='fa-brands fa-facebook']")private WebElement FacebookLink;
	 @FindBy (xpath = "//i[@class='fa-brands fa-instagram']")private WebElement InstagramLink;
	 @FindBy (xpath = "//i[@class='fa-brands fa-linkedin']")private WebElement LinkedinLink;
	 @FindBy (xpath = "//i[@class='fa-brands fa-twitter']")private WebElement TwitterLink;
	 @FindBy (xpath = "//a[.=' X-YUG Technologies']")private WebElement XYUGTechLink;
	
	//Creating A Constructor To Initialize These WebElement
	 
	 public BusinessKycPage(WebDriver driver) 
	    {
		PageFactory.initElements(driver,this);
	    }
    
	// Using Getters To Get Those WebElements 
	 
	 public WebElement getSelectTypeDropDown() {
		return SelectTypeDropDown;
	}
	public WebElement getPropretorOption() {
		return PropretorOption;
	}
	public WebElement getLlpOption() {
		return LlpOption;
	}
	public WebElement getPvtltdOption() {
		return PvtltdOption;
	}
	public WebElement getLtdOption() {
		return LtdOption;
	}
	public WebElement getProprietorNameEdit() {
		return ProprietorNameEdit;
	}
	public WebElement getProprietorPanNoEdit() {
		return ProprietorPanNoEdit;
	}
	public WebElement getProprietorPanImg() {
		return ProprietorPanImg;
	}
	public WebElement getProprietorGstNoEdit() {
		return ProprietorGstNoEdit;
	}
	public WebElement getProprietorGstNoImg() {
		return ProprietorGstNoImg;
	}
	public WebElement getBankNameEdit() {
		return BankNameEdit;
	}
	public WebElement getAccNumberEdit() {
		return AccNumberEdit;
	}
	public WebElement getIfscCodeEdit() {
		return IfscCodeEdit;
	}
	public WebElement getAccHolderNameEdit() {
		return AccHolderNameEdit;
	}
	public WebElement getSubmitButn() {
		return SubmitButn;
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
	
	public void clickSelectTypeDropDown() {
		SelectTypeDropDown.click();
	}
	public void clickPropretorOption() {
		PropretorOption.click();
		
	}
	public void clickProprietorNameEdit() {
		
	}
		

}
