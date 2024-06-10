package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import ObjectRepository.Xyug_DashBoard;
import ObjectRepository.Xyug_DevopsAsService;

public class XyugDevopAsService extends Base{
	
	@Test
	public void performeDevops() throws Exception {
		Xyug_DashBoard yb=new Xyug_DashBoard(driver);
		Xyug_DevopsAsService ds=new Xyug_DevopsAsService(driver); 
		yb.ClickDevopsAsService(driver);
		ds.performeDevops(driver);		
	}


}
