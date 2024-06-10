package GenricUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	
	public String getDataFromproperty(String key) throws Exception {
		  FileInputStream fis=new FileInputStream(IConstants.propertsfilepath);
		  Properties p=new Properties();
		  p.load(fis);
		  String value=p.getProperty(key);
		  return value;
	  }
	

}
