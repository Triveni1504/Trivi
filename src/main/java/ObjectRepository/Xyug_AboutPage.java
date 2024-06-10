package ObjectRepository;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.WebdriverUtility;

public class Xyug_AboutPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
	
    @FindBy (xpath = "(//div[@class='our-team'])[1]") private WebElement DirectorLnk1;
	
	@FindBy (xpath = "(//span[.=' LinkedIn'])[1]") private WebElement DirectorLnk;
	
	@FindBy (xpath = "(//div[@class='our-team'])[2]") private WebElement ChiefOperatingofficerLnk1;
	
	@FindBy (xpath = "(//span[.=' LinkedIn'])[2]") private WebElement ChiefOperatingofficerLnk;
	
	@FindBy (xpath = "(//div[@class='our-team'])[3]") private WebElement ProjectManagementLnk1;
	
	@FindBy (xpath = "(//span[.=' LinkedIn'])[3]") private WebElement ProjectManagementLnk;
		
		//Creating A Constructor To Initialize These WebElements
		
		public Xyug_AboutPage(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);
		}

		//Using Getters To Get Those WebElements
		
		public WebElement getDirectorLnk1() {
			return DirectorLnk1;
		}

		public WebElement getDirectorLnk() {
			return DirectorLnk;
		}

		public WebElement getChiefOperatingofficerLnk1() {
			return ChiefOperatingofficerLnk1;
		}

		public WebElement getChiefOperatingofficerLnk() {
			return ChiefOperatingofficerLnk;
		}

		public WebElement getProjectManagementLnk1() {
			return ProjectManagementLnk1;
		}

		public WebElement getProjectManagementLnk() {
			return ProjectManagementLnk;
		}
		
		
	    
		//Creating Business Libraries To Perform The Action What We Need
		
		public void performeOperations(WebDriver driver) throws Exception {
			WebdriverUtility wu=new WebdriverUtility();
			wu.scrolldown6(driver);
			wu.thread(driver);
			wu.takeScreenShot(driver, "Linked In Profiles");
			
			String ParentWindow=driver.getWindowHandle();
		    wu.mouseoveraction(driver, DirectorLnk1);
			wu.thread(driver);
			DirectorLnk.click();
			wu.thread(driver);
			Set<String> ChildWindow=driver.getWindowHandles();
			wu.switchtoChildWindow(driver, ParentWindow, ChildWindow);
			wu.takeScreenShot(driver, "Director");
			wu.thread(driver);
			driver.close();
			
			wu.switchToParentWindow(driver, ParentWindow);
			wu.thread(driver);
			wu.mouseoveraction(driver, ChiefOperatingofficerLnk1);
			wu.thread(driver);
			String ParentWindow1=driver.getWindowHandle();
			ChiefOperatingofficerLnk.click();
			wu.thread(driver);
			Set<String> ChildWindow1=driver.getWindowHandles();
			wu.switchtoChildWindow(driver, ParentWindow1, ChildWindow1);
			wu.takeScreenShot(driver, "ChiefOperatingofficer");
			wu.thread(driver);
			driver.close();
			
			wu.switchToParentWindow(driver, ParentWindow1);
			wu.thread(driver);
			wu.mouseoveraction(driver, ProjectManagementLnk1);
			wu.thread(driver);
			String ParentWindow2=driver.getWindowHandle();
			ProjectManagementLnk.click();
			wu.thread(driver);
			Set<String> ChildWindow2=driver.getWindowHandles();
			wu.switchtoChildWindow(driver, ParentWindow2, ChildWindow2);
			wu.takeScreenShot(driver, "ProjectManagement");
			wu.thread(driver);
			driver.close();
			
			wu.switchToParentWindow(driver, ParentWindow2);
			
			
		}
		
	}



