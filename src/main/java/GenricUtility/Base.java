package GenricUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	     public ReadPropertyFile rp=new ReadPropertyFile();
	     PropertyUtility pu=new PropertyUtility();
	     public WebDriver driver;
	     WebdriverUtility wu=new WebdriverUtility();
	     public static WebDriver sdriver;
	     
	     
	     @BeforeSuite
	     public void bsconfig()  
	     {
	     	 System.out.println("===db connection successfully===");
	     } 
	     @BeforeClass
	     public void bcconfig() throws Exception
	     {
	     	 String BROWSER=pu.getDataFromproperty("browser");
	     	 String URL=pu.getDataFromproperty("testurl1");
	     	 if(BROWSER.equalsIgnoreCase("Chrome"))
	     	 {
	     		 WebDriverManager.chromedriver().setup();
	     		 driver=new ChromeDriver();
	     		 System.out.println(BROWSER+"browser launched successfully");
	     	 }
	     	 else
	     		 if(BROWSER.equalsIgnoreCase("firefox"))
	     		 {
	     		 WebDriverManager.firefoxdriver().setup();
	     		 driver =new FirefoxDriver();
	     		 System.out.println(BROWSER+"browser launched successfully");
	     	 }
	     		 else {
	     			 System.out.println("invalid browser");
	     		 }
	     	 wu.maximizewindow(driver);
	 		wu.waitforloadelements(driver);
	 		sdriver=driver;
	 		driver.get(URL);
	     }
	    /* @BeforeMethod
	     public void bmconfig() throws Exception {
	    	 ExcelUtility eu=new ExcelUtility();
	    	 
	    	 String Name=eu.getdataFromExcel("Sheet1", 1, 1);
	 		 String Password=eu.getdataFromExcel("Sheet1", 2, 1);
	    	 
	    	 AdminLogin gbaPage = new AdminLogin(driver);
	    	 gbaPage.loginToApplication(Name, Password);
	    	 System.out.println("---Login Sucessfully---");
	     }*/
	     @AfterMethod
	     public void amconfig() {
	    	 System.out.println("---Logout Sucessfully---");
	     }
	     @AfterClass
	     public void acconfig() {
	    	driver.quit();
	    	 System.out.println("---Browser closed sucessfully---");
	     }
	    /* @AfterSuite
	     public void asconfig() {
	    	 System.out.println("--- DB Connection closed sucessfully---");
	    	 }*/
}
