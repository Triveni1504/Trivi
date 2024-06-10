package X_YUG;

import org.testng.annotations.Test;

import GenricUtility.Base;
import ObjectRepository.Xyug_DashBoard;
import ObjectRepository.Xyug_VFXVedioEditingService;

public class XyugVFXVedioEditingService extends Base {
	
	
	@Test
	public void PerformeVFX() throws Exception {
		Xyug_DashBoard yb=new Xyug_DashBoard(driver);
		Xyug_VFXVedioEditingService ve=new Xyug_VFXVedioEditingService(driver);
		yb.ClickVFXVideoEditing(driver);
		ve.performeVFXOperations(driver);
	}


}
