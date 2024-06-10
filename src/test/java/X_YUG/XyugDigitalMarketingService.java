package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import ObjectRepository.Xyug_DashBoard;
import ObjectRepository.Xyug_DigitalMarketingService;

public class XyugDigitalMarketingService extends Base {
	
	@Test
	public void clickDigitalMarketing() throws Exception {
		Xyug_DashBoard yb=new Xyug_DashBoard(driver);
		yb.ClickDigitalMarketing(driver);
		Xyug_DigitalMarketingService dm=new Xyug_DigitalMarketingService(driver);
		dm.ClickReadMore(driver);
	}
}


