package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import GenricUtility.WebdriverUtility;
import ObjectRepository.Xyug_CareersWorkshopPage;
import ObjectRepository.Xyug_DashBoard;

public class XyugCareersWorkshopPage extends Base {
	
	@Test
    public void WorkShop() throws Exception {
	WebdriverUtility wu=new WebdriverUtility();
	wu.waitforloadelements(driver);
	Thread.sleep(4000);
	wu.takeScreenShot(driver, "Home Page");
	Xyug_DashBoard yb=new Xyug_DashBoard(driver);
	Xyug_CareersWorkshopPage yws=new Xyug_CareersWorkshopPage(driver);
	yb.clickWorkShop(driver);
	wu.scrolldown1(driver);
	//wu.thread(driver);
	//wu.scrolldown1(driver);
	wu.takeScreenShot(driver, "WorkShop Page");
	yws.createWorkShopApplication(driver);
	wu.takeScreenShot(driver, "Successfull page");
	
}


}
