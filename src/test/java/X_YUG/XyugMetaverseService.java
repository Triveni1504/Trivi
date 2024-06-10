package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import ObjectRepository.Xyug_DashBoard;
import ObjectRepository.Xyug_MetaverseService;

public class XyugMetaverseService extends Base {
	
	@Test
	public void clickMetaverse() throws Exception {
		Xyug_DashBoard yb=new Xyug_DashBoard(driver);
		Xyug_MetaverseService ym=new Xyug_MetaverseService(driver);
		yb.ClickMetaverse(driver);
		ym.PerformanceInMetaverse(driver);
	}


}
