package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.WebdriverUtility;

public class Xyug_MetaverseService {
	
	@FindBy (xpath = "//button[.='Read more']") private WebElement ReadMoreBtn;
	@FindBy (xpath = "(//a[.='X-YUG'])[1]") private WebElement X_YUGBtn;
	
	public Xyug_MetaverseService(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getReadMoreBtn() {
		return ReadMoreBtn;
	}

	public WebElement getX_YUGBtn() {
		return X_YUGBtn;
	}
	
	public void PerformanceInMetaverse(WebDriver driver) throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.waitforloadelements(driver);
		wu.thread(driver);
		wu.takeScreenShot(driver, "Metaverse Home Page");
		ReadMoreBtn.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "Metaverse Read More Page");
		wu.thread(driver);
		wu.scrolldown4(driver);
		wu.thread(driver);
		wu.mouseoveraction(driver, X_YUGBtn);
		X_YUGBtn.click();
		Thread.sleep(4000);
		wu.takeScreenShot(driver, "Metaverse to HomePage");
		Thread.sleep(3000);
		wu.back(driver);
		wu.thread(driver);
	}


}
