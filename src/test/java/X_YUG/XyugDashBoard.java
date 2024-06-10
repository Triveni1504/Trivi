package X_YUG;

import org.testng.annotations.Test;
import ObjectRepository.Xyug_DashBoard;

public class XyugDashBoard extends GenricUtility.Base {
	
	@Test
	public void DashboardHome() throws Exception {
		Xyug_DashBoard dh=new Xyug_DashBoard(driver);
		dh.Xyughome(driver);
		
		
		
		
		
	}

}
