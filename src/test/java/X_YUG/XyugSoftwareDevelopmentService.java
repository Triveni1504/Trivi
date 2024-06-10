package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import GenricUtility.WebdriverUtility;
import ObjectRepository.Xyug_DashBoard;
import ObjectRepository.Xyug_SoftwareDevelopmentService;

public class XyugSoftwareDevelopmentService extends Base{
	
	@Test
	 public void clickReadMore() throws Exception {
		Xyug_DashBoard yub=new Xyug_DashBoard(driver);
		Xyug_SoftwareDevelopmentService sd=new Xyug_SoftwareDevelopmentService(driver);
		 WebdriverUtility wu=new WebdriverUtility();
		 yub.ClickServices(driver);
		 wu.thread(driver);
		 sd.Performeoperations(driver);
	 }


}
