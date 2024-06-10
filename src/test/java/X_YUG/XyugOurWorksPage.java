package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import GenricUtility.WebdriverUtility;

import ObjectRepository.Xyug_DashBoard;
import ObjectRepository.Xyug_OurWorksPage;

public class XyugOurWorksPage extends Base {
	
	@Test
	public void DashboardHome() throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		Xyug_DashBoard db=new Xyug_DashBoard(driver);
		Xyug_OurWorksPage ow=new Xyug_OurWorksPage(driver);
		db.ClickOurWorks(driver);
		wu.thread(driver);
		ow.PerformedActions(driver);
	    
	}

}
