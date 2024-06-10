package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import ObjectRepository.Xyug_DashBoard;
import ObjectRepository.Xyug_UIUXDesignService;

public class XyugUIUXDesignService extends Base{
	
	
	@Test
	public void clickUiUx() throws Exception {
		Xyug_DashBoard yb=new Xyug_DashBoard(driver);
		Xyug_UIUXDesignService ud=new Xyug_UIUXDesignService(driver);
		yb.ClickUIUXDesign(driver);
		ud.PerformeUIUXPage(driver);
	}

}



