package ObjectRepository;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.WebdriverUtility;

public class Xyug_OurWorksPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
	
			@FindBy (xpath = "(//div[@class='cards1'])[1]") private WebElement PaySikkaLink;
			@FindBy (xpath = "(//div[@class='cards1'])[2]") private WebElement GoldSikkaLink;
			@FindBy (xpath = "(//div[@class='cards1'])[3]") private WebElement GoldBharathLink;
			@FindBy (xpath = "(//div[@class='cards1'])[4]") private WebElement MatrikaGoldLink;
			@FindBy (xpath = "(//div[@class='cards1'])[5]") private WebElement NoBadGoldLink;
			
			
	//Creating A Constructor To Initialize These WebElements
			
			public Xyug_OurWorksPage(WebDriver driver) 
			{
				PageFactory.initElements(driver,this);
			}

	//Using Getters To Get Those WebElements
			
			public WebElement getPaySikkaLink() {
				return PaySikkaLink;
			}


			public WebElement getGoldSikkaLink() {
				return GoldSikkaLink;
			}


			public WebElement getGoldBharathLink() {
				return GoldBharathLink;
			}


			public WebElement getMatrikaGoldLink() {
				return MatrikaGoldLink;
			}


			public WebElement getNoBadGoldLink() {
				return NoBadGoldLink;
			}

	//Creating Business Libraries To Perform The Action What We Need
			
			public void PerformedActions(WebDriver driver) throws Exception {
				WebdriverUtility wu=new WebdriverUtility();
				wu.scrolldown3(driver);
				wu.thread(driver);
				
				String ParentWindow=driver.getWindowHandle();
			    wu.mouseoveraction(driver, PaySikkaLink);
				wu.thread(driver);
				PaySikkaLink.click();
				wu.thread(driver);
				Set<String> ChildWindow=driver.getWindowHandles();
				wu.switchtoChildWindow(driver, ParentWindow, ChildWindow);
				wu.takeScreenShot(driver, "PaySikkaPage");
				wu.thread(driver);
				driver.close();
				
				wu.switchToParentWindow(driver, ParentWindow);
				wu.thread(driver);
				wu.mouseoveraction(driver, GoldSikkaLink);
				wu.thread(driver);
				String ParentWindow1=driver.getWindowHandle();
				GoldSikkaLink.click();
				wu.thread(driver);
				Set<String> ChildWindow1=driver.getWindowHandles();
				wu.switchtoChildWindow(driver, ParentWindow1, ChildWindow1);
				wu.takeScreenShot(driver, "GoldSikka");
				wu.thread(driver);
				driver.close();
				
				wu.switchToParentWindow(driver, ParentWindow);
				wu.thread(driver);
				wu.mouseoveraction(driver, GoldBharathLink);
				wu.thread(driver);
				String ParentWindow2=driver.getWindowHandle();
				GoldBharathLink.click();
				wu.thread(driver);
				Set<String> ChildWindow2=driver.getWindowHandles();
				wu.switchtoChildWindow(driver, ParentWindow2, ChildWindow2);
				wu.takeScreenShot(driver, "GoldBharath");
				wu.thread(driver);
				driver.close();
				
				wu.switchToParentWindow(driver, ParentWindow);
				wu.thread(driver);
				wu.scrolldown03(driver);
				wu.thread(driver);
				
				
				wu.thread(driver);
				wu.mouseoveraction(driver, MatrikaGoldLink);
				wu.thread(driver);
				String ParentWindow3=driver.getWindowHandle();
				MatrikaGoldLink.click();
				wu.thread(driver);
				Set<String> ChildWindow3=driver.getWindowHandles();
				wu.switchtoChildWindow(driver, ParentWindow3, ChildWindow3);
				wu.takeScreenShot(driver, "MatrikaGold");
				wu.thread(driver);
				driver.close();
				
				wu.switchToParentWindow(driver, ParentWindow);
				wu.thread(driver);
				wu.mouseoveraction(driver, NoBadGoldLink);
				wu.thread(driver);
				String ParentWindow4=driver.getWindowHandle();
				NoBadGoldLink.click();
				wu.thread(driver);
				Set<String> ChildWindow4=driver.getWindowHandles();
				wu.switchtoChildWindow(driver, ParentWindow4, ChildWindow4);
				wu.takeScreenShot(driver, "NoBadGold");
				wu.thread(driver);
				driver.close();
				
				
				
				
				
				
				
				
			}
			

}
