package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import GenricUtility.WebdriverUtility;
import ObjectRepository.Xyug_DashBoard;
import ObjectRepository.Xyug_MobileApplicationDevelopmentService;

public class XyugMobileAplnDevelpmentService extends Base{
	
	@Test
	public void mobile() throws Exception {
		WebdriverUtility wu=new WebdriverUtility();
		wu.waitforloadelements(driver);
		Xyug_DashBoard xy=new Xyug_DashBoard(driver);
		xy.ClickServicesmobileapp(driver);
		wu.thread(driver);
		Xyug_MobileApplicationDevelopmentService md=new Xyug_MobileApplicationDevelopmentService(driver);
		md.PerformeMobileApplication(driver);
	}

		
		
		
}



