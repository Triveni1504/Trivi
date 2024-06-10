package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.WebdriverUtility;

public class Xyug_DigitalMarketingService {
	
	
//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
		@FindBy (xpath = "//a[.='Read More']") private WebElement ReadMorebtn;
		@FindBy (xpath = "(//span[@class='swiper-pagination-bullet'])[2]") private WebElement LeftMoveBtn1;
		@FindBy (xpath = "(//span[@class='swiper-pagination-bullet'])[1]") private WebElement LeftMoveBtn2;
		@FindBy (xpath = "(//span[@class='swiper-pagination-bullet'])[3]") private WebElement RightMoveBtn;
		
//Creating A Constructor To Initialize These WebElements
		
		public Xyug_DigitalMarketingService(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	   
//Using Getters To Get Those WebElements               
	     
		public WebElement getReadMorebtn() 
		{
			return ReadMorebtn;
		}
		public WebElement getLeftMoveBtn1() {
			return LeftMoveBtn1;
		}

		public WebElement getLeftMoveBtn2() {
			return LeftMoveBtn2;
		}

		public WebElement getRightMoveBtn() {
			return RightMoveBtn;
		}

//Creating Business Libraries To Perform The Action What We Need
		
		public void ClickReadMore(WebDriver driver) throws Exception {
			WebdriverUtility wu=new WebdriverUtility();
			wu.waitforloadelements(driver);
			ReadMorebtn.click();
			Thread.sleep(3000);
			wu.takeScreenShot(driver, "Read More Page");
			wu.thread(driver);
			wu.scrolldownn(driver);
			wu.thread(driver);
			
			LeftMoveBtn1.click();
			wu.takeScreenShot(driver, "Left1");
			wu.thread(driver);
			
			LeftMoveBtn2.click();
			wu.thread(driver);
			
			RightMoveBtn.click();
			wu.takeScreenShot(driver, "Right");
			wu.thread(driver);
			
			
		}
	}



