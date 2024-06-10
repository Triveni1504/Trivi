package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import GenricUtility.WebdriverUtility;
import ObjectRepository.Xyug_AboutPage;
import ObjectRepository.Xyug_DashBoard;

public class XyugAboutPage extends Base {
	
	
	@Test
	public void DashboardHome() throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		Xyug_DashBoard db=new Xyug_DashBoard(driver);
		Xyug_AboutPage ap=new Xyug_AboutPage(driver);
		db.ClickAboutPage(driver);
		wu.thread(driver);
		ap.performeOperations(driver);
	    
	}

}
