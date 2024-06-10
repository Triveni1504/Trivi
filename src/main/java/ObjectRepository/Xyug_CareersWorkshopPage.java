package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.ExcelUtility;
import GenricUtility.WebdriverUtility;

public class Xyug_CareersWorkshopPage {
	
	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
	
	@FindBy (xpath = "//input[@placeholder=\"Candidate's Name\"]")private WebElement CandidateNameEdit;
	@FindBy (xpath = "//input[@placeholder='Email Id']")private WebElement EmailEdit;
	@FindBy (xpath = "//input[@placeholder='Contact No']")private WebElement ContactNumberEdit;
	@FindBy (xpath = " //select[@name='gender']")private WebElement GenderClick;
	@FindBy (xpath = "//option[.='Female']") private WebElement FemaleOption;
	@FindBy (xpath = "//input[@placeholder='Education Qualification']")private WebElement EducationEdit;
	@FindBy (xpath = "//input[@placeholder='University']")private WebElement UniversityEdit;
	@FindBy (xpath = "//input[@placeholder='Year of Passout']")private WebElement YearEdit;
	@FindBy (xpath = "(//input[@type='radio'])[1]")private WebElement StudentRadioButn;
	@FindBy (xpath = "//input[@placeholder='Location']")private WebElement LocationEdit;
	@FindBy (xpath = "//input[@type='submit']")private WebElement SubmitButn;

	//Creating A Constructor To Initialize These WebElements
	
	public Xyug_CareersWorkshopPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	//Using Getters To Get Those WebElements
	
	public WebElement getCandidateNameEdit() {
		return CandidateNameEdit;
	}

	public WebElement getEmailEdit() {
		return EmailEdit;
	}

	public WebElement getContactNumberEdit() {
		return ContactNumberEdit;
	}

	public WebElement getGenderClick() {
		return GenderClick;
	}
    public WebElement getFemaleOption() {
		return FemaleOption;
	}
    public WebElement getEducationEdit() {
		return EducationEdit;
	}

	public WebElement getUniversityEdit() {
		return UniversityEdit;
	}

	public WebElement getYearEdit() {
		return YearEdit;
	}

	public WebElement getStudentRadioButn() {
		return StudentRadioButn;
	}

	public WebElement getLocationEdit() {
		return LocationEdit;
	}

	public WebElement getSubmitButn() {
		return SubmitButn;
	}
	
	
	//Creating Business Libraries To Perform The Action What We Need
	
	public void createWorkShopApplication(WebDriver driver) throws Exception {
		ExcelUtility eu=new ExcelUtility();
		WebdriverUtility wu=new WebdriverUtility();
		String CandidateName=eu.getdataFromExcel("Sheet1", 6, 1);
		String EmailId=eu.getdataFromExcel("Sheet1", 7, 1);
		String ContactNum=eu.getdataFromExcel("Sheet1", 8, 1);
		String EduQuali=eu.getdataFromExcel("Sheet1", 9, 1);
		String university=eu.getdataFromExcel("Sheet1", 10, 1);
		String Passout=eu.getdataFromExcel("Sheet1", 11, 1);
		String Loc=eu.getdataFromExcel("Sheet1", 12, 1);
		
		CandidateNameEdit.sendKeys(CandidateName);
		EmailEdit.sendKeys(EmailId);
		ContactNumberEdit.sendKeys(ContactNum);
		GenderClick.click();
		FemaleOption.click();	
		EducationEdit.sendKeys(EduQuali);
		UniversityEdit.sendKeys(university);
		YearEdit.sendKeys(Passout);
		wu.scrolldown1(driver);
		StudentRadioButn.click();
		LocationEdit.sendKeys(Loc);
		wu.scrolldown(driver);
		wu.thread(driver);
		wu.scrolldown(driver);
        SubmitButn.click();
	}

		

}
