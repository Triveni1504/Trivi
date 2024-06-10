package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Xyug_CareeesPage {
	
 //Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
	
	@FindBy (xpath = "//img[@src='assets/img/bm-hiring.jpg']") private WebElement DigitalMarketingLnk;
	@FindBy (xpath = "//img[@src='assets/img/it-intern.jpg']") private WebElement MissionTechLnk;
	@FindBy (xpath = "assets/img/media-intern.jpg") private WebElement DesignLnk;
	
    //	@FindBy (xpath = "(//a[.='View More'])[1]") private WebElement ViewMore1Btn;
	//	@FindBy (xpath = "(//a[.='Apply Now'])[2]") private WebElement ApplyNow1Btn;

    @FindBy (xpath = "//h5[.='Node Js Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div//a[.='View More']") private WebElement NodeJsViewMoreBtn;
    @FindBy (xpath = "//h5[.='Node Js Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div//div/a[.='Apply Now']")private WebElement NodejsApplyNowBtn;
	
    //@FindBy (xpath = "//h5[.='Senior Angular Web Developer ']/../../following-sibling::div/div[2]//a[.='View More']") private WebElement SeniorAngularViewMoreBtn;
    @FindBy (xpath = "//h5[.='Senior Angular Web Developer ']/ancestor::div[@class=\"job_content-box\"]/following-sibling::div/div[2]//a[.='View More']") private WebElement SeniorAngularWebViewMoreBtn; 
	@FindBy (xpath = "//h5[.='Senior Angular Web Developer ']/ancestor::div[@class=\"job_content-box\"]/following-sibling::div/div[2]/div[3]//a[.='Apply Now']") private WebElement SeniorAngularWebApplyNowBtn;
	
	@FindBy (xpath = "//h5[.='AI/ML  Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement AIMlViewMoreBtn;
    @FindBy (xpath = "//h5[.='AI/ML  Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]/div[3]/a[.='Apply Now']") private WebElement AIMLApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Embedded Engineer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]/div/a[.='View More']") private WebElement EmbeddedEngineerViewMoreBtn;
    @FindBy (xpath = "//h5[.='Embedded Engineer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]/div[3]/a[.='Apply Now']") private WebElement EmbeddedEngineerAppluNowBtn;
    
    @FindBy (xpath = "//h5[.='Project Manager ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]/div/a[.='View More']") private WebElement ProjectmanagerViewMoreBtn;
    @FindBy (xpath = "//h5[.='Project Manager ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]/div[3]/a[.='Apply Now']") private WebElement ProjectManagerApplyNowBtn;
    
    //@FindBy (xpath = "(//a[@href='#'][normalize-space()='View More'])[6]") private WebElement IOSDeveloperViewMoreBtn;
    @FindBy (xpath = "(//h5[.='IOS Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]/div[1]/a[.='View More'])[1]") private WebElement IOSDeveloperViewMoreBtn;
    @FindBy (xpath = "(//h5[.='IOS Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]/div[3]/a[.='Apply Now'])[1]") private WebElement IOSDeveloperApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Quality Analyst ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]/div/a[.='View More']") private WebElement QualityAnalystViewmoreBtn;
    @FindBy (xpath = "//h5[.='Quality Analyst ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]/div[3]/a[.='Apply Now']") private WebElement QualityAnalystApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='SMO ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement SMOViewMoreBtn;
    @FindBy (xpath = "//h5[.='SMO ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement SMOApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='SEO ']/ancestor::div[@class='job_content-box']/following-sibling::div/div//a[.='View More']") private WebElement SEOViewMoreBtn;
    @FindBy (xpath = "//h5[.='SEO ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement SEOApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Android Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement AndroidDeveloperViewMoreBtn;
    @FindBy (xpath = "//h5[.='Android Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement AndroidDeveloperApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Mean Stack Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement MeanStackDevViewMorebtn;
    @FindBy (xpath = "//h5[.='Mean Stack Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement MeanStacckDevApplyNowBtn;
    
    @FindBy (xpath = "(//small[.='No of Positions:  8']/ancestor::div[@class=\"job_content-box\"])[2]/following-sibling::div/div[2]//a[.='View More']") private WebElement IOSViewMorwBtn;
    @FindBy (xpath = "(//small[.='No of Positions:  8']/ancestor::div[@class=\"job_content-box\"])[2]/following-sibling::div/div[2]/div[3]/a[.='Apply Now']") private WebElement IOSApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Junior Angular Web Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement JuniorAngularWebViewMoreBtn;
    @FindBy (xpath = "//h5[.='Junior Angular Web Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement juniorAngularWebApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Business Technical Analyst ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement BusinessTechnicalAnalystViewMoreBtn;
    @FindBy (xpath = "//h5[.='Business Technical Analyst ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement BusinessTechnicalAnalystApplyNowBtn;
 
    @FindBy (xpath = "//h5[.='Cyber Security Specialist  ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement CyberSecurityViewMoreBtn;
    @FindBy (xpath = "//h5[.='Cyber Security Specialist  ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement CyberSecurityAppluNowBtn;
    
    @FindBy (xpath = "//h5[.='Production Manager ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement ProductionManagerViewMoreBtn;
    @FindBy (xpath = "//h5[.='Production Manager ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']")private WebElement ProductionManagerApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Augmented Reality (AR)/Virtual Reality(VR) ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement AugmentedViewMoreBtn;
    @FindBy (xpath = "//h5[.='Augmented Reality (AR)/Virtual Reality(VR) ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement AugmentedApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='MECHANICAL ENGINEER ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement MechanicalEngineerViewMoreBtn;
    @FindBy (xpath = "//h5[.='MECHANICAL ENGINEER ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement MechanicalEngineerApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Graphic Designer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement GraphicDesignerViewMoreBtn;
    @FindBy (xpath = "//h5[.='Graphic Designer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement GraphincDesignerApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Google Ads ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement GoogleAdsViewmorebtn;
    @FindBy (xpath = "//h5[.='Google Ads ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement GoogleAdsApplyNowBtn;
    
    @FindBy (xpath = "//h5[.='Content Writer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement ContentWriterViewMorebtn;
    @FindBy (xpath = "//h5[.='Content Writer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement ContentWritterViewMoreBtn;
    
    @FindBy (xpath = "//h5[.='Automation Tester ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement AutomationTesterViewMoreBtn;
    @FindBy (xpath = "//h5[.='Automation Tester ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement AutomationTesterApplynowBtn;
    
    @FindBy (xpath = "//h5[.='Manual Tester ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement ManualtesterViewMorebtn;
    @FindBy (xpath = "//h5[.='Manual Tester ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement ManualTesterApplyNowbtn;
    
    @FindBy (xpath = "//h5[.='Blockchain Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div[2]//a[.='View More']") private WebElement BlockChainDeveloperViewMoreBtn;
    @FindBy (xpath = "//h5[.='Blockchain Developer ']/ancestor::div[@class='job_content-box']/following-sibling::div/div/div[3]/a[.='Apply Now']") private WebElement BlockChainDeveloperApplyNowBtn;
    
 //Creating A Constructor To Initialize These WebElements  
    
    public Xyug_CareeesPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }

 //Creating A Constructor To Initialize These WebElements
	

	public WebElement getDigitalMarketingLnk() {
		return DigitalMarketingLnk;
	}


	public WebElement getMissionTechLnk() {
		return MissionTechLnk;
	}


	public WebElement getDesignLnk() {
		return DesignLnk;
	}


	public WebElement getNodeJsViewMoreBtn() {
		return NodeJsViewMoreBtn;
	}


	public WebElement getNodejsApplyNowBtn() {
		return NodejsApplyNowBtn;
	}


	public WebElement getSeniorAngularWebViewMoreBtn() {
		return SeniorAngularWebViewMoreBtn;
	}


	public WebElement getSeniorAngularWebApplyNowBtn() {
		return SeniorAngularWebApplyNowBtn;
	}

	public WebElement getAIMlViewMoreBtn() {
		return AIMlViewMoreBtn;
	}


	public WebElement getAIMLApplyNowBtn() {
		return AIMLApplyNowBtn;
	}


	public WebElement getEmbeddedEngineerViewMoreBtn() {
		return EmbeddedEngineerViewMoreBtn;
	}


	public WebElement getEmbeddedEngineerAppluNowBtn() {
		return EmbeddedEngineerAppluNowBtn;
	}


	public WebElement getProjectmanagerViewMoreBtn() {
		return ProjectmanagerViewMoreBtn;
	}


	public WebElement getProjectManagerApplyNowBtn() {
		return ProjectManagerApplyNowBtn;
	}


	public WebElement getIOSDeveloperViewMoreBtn() {
		return IOSDeveloperViewMoreBtn;
	}


	public WebElement getIOSDeveloperApplyNowBtn() {
		return IOSDeveloperApplyNowBtn;
	}


	public WebElement getQualityAnalystViewmoreBtn() {
		return QualityAnalystViewmoreBtn;
	}


	public WebElement getQualityAnalystApplyNowBtn() {
		return QualityAnalystApplyNowBtn;
	}


	public WebElement getSMOViewMoreBtn() {
		return SMOViewMoreBtn;
	}


	public WebElement getSMOApplyNowBtn() {
		return SMOApplyNowBtn;
	}


	public WebElement getSEOViewMoreBtn() {
		return SEOViewMoreBtn;
	}


	public WebElement getSEOApplyNowBtn() {
		return SEOApplyNowBtn;
	}


	public WebElement getAndroidDeveloperViewMoreBtn() {
		return AndroidDeveloperViewMoreBtn;
	}


	public WebElement getAndroidDeveloperApplyNowBtn() {
		return AndroidDeveloperApplyNowBtn;
	}


	public WebElement getMeanStackDevViewMorebtn() {
		return MeanStackDevViewMorebtn;
	}


	public WebElement getMeanStacckDevApplyNowBtn() {
		return MeanStacckDevApplyNowBtn;
	}


	public WebElement getIOSViewMorwBtn() {
		return IOSViewMorwBtn;
	}


	public WebElement getIOSApplyNowBtn() {
		return IOSApplyNowBtn;
	}


	public WebElement getJuniorAngularWebViewMoreBtn() {
		return JuniorAngularWebViewMoreBtn;
	}


	public WebElement getJuniorAngularWebApplyNowBtn() {
		return juniorAngularWebApplyNowBtn;
	}


	public WebElement getBusinessTechnicalAnalystViewMoreBtn() {
		return BusinessTechnicalAnalystViewMoreBtn;
	}


	public WebElement getBusinessTechnicalAnalystApplyNowBtn() {
		return BusinessTechnicalAnalystApplyNowBtn;
	}


	public WebElement getCyberSecurityViewMoreBtn() {
		return CyberSecurityViewMoreBtn;
	}


	public WebElement getCyberSecurityAppluNowBtn() {
		return CyberSecurityAppluNowBtn;
	}


	public WebElement getProductionManagerViewMoreBtn() {
		return ProductionManagerViewMoreBtn;
	}


	public WebElement getProductionManagerApplyNowBtn() {
		return ProductionManagerApplyNowBtn;
	}


	public WebElement getAugmentedViewMoreBtn() {
		return AugmentedViewMoreBtn;
	}


	public WebElement getAugmentedApplyNowBtn() {
		return AugmentedApplyNowBtn;
	}


	public WebElement getMechanicalEngineerViewMoreBtn() {
		return MechanicalEngineerViewMoreBtn;
	}


	public WebElement getMechanicalEngineerApplyNowBtn() {
		return MechanicalEngineerApplyNowBtn;
	}


	public WebElement getGraphicDesignerViewMoreBtn() {
		return GraphicDesignerViewMoreBtn;
	}


	public WebElement getGraphincDesignerApplyNowBtn() {
		return GraphincDesignerApplyNowBtn;
	}


	public WebElement getGoogleAdsViewmorebtn() {
		return GoogleAdsViewmorebtn;
	}


	public WebElement getGoogleAdsApplyNowBtn() {
		return GoogleAdsApplyNowBtn;
	}


	public WebElement getContentWriterViewMorebtn() {
		return ContentWriterViewMorebtn;
	}


	public WebElement getContentWritterViewMoreBtn() {
		return ContentWritterViewMoreBtn;
	}


	public WebElement getAutomationTesterViewMoreBtn() {
		return AutomationTesterViewMoreBtn;
	}


	public WebElement getAutomationTesterApplynowBtn() {
		return AutomationTesterApplynowBtn;
	}


	public WebElement getManualtesterViewMorebtn() {
		return ManualtesterViewMorebtn;
	}


	public WebElement getManualTesterApplyNowbtn() {
		return ManualTesterApplyNowbtn;
	}


	public WebElement getBlockChainDeveloperViewMoreBtn() {
		return BlockChainDeveloperViewMoreBtn;
	}


	public WebElement getBlockChainDeveloperApplyNowBtn() {
		return BlockChainDeveloperApplyNowBtn;
	}
	
  //Creating Business Libraries To Perform The Action What We Need
		
    
    
}


