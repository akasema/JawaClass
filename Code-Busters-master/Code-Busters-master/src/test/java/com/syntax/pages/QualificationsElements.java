package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;

public class QualificationsElements extends CommonMethods{


	@FindBy(xpath ="//*[@id=\"sidenav\"]/li[10]/a")
	public WebElement QualLink;
	
	
	// work experience 
	
	@FindBy(xpath ="//*[@id=\"addWorkExperience\"]")
	public WebElement WorkExpAddBtn;
	
	@FindBy(xpath ="//*[@id=\"experience_employer\"]")
	public WebElement WorkExpCompany;
	
	@FindBy(xpath ="//*[@id=\"experience_jobtitle\"]")
	public WebElement WorkExpJobTitle;
	
	
	// yyy-mm-dd
	@FindBy(xpath ="//*[@id=\"experience_from_date\"]")     
	public WebElement WorkExpFromDate;
	
	// yyy-mm-dd
	@FindBy(xpath ="//*[@id=\"experience_to_date\"]")     
	public WebElement WorkExpToDate;
	
	@FindBy(xpath ="//*[@id=\"experience_comments\"]")     
	public WebElement WorkExpComment;
	
	@FindBy(xpath ="//*[@id=\"btnWorkExpSave\"]")     
	public WebElement WorkExpSaveBtn;
	
	@FindBy(xpath ="//*[@id=\"frmDelWorkExperience\"]/table/tbody")     
	public WebElement WorkExpTable;
	
	@FindBy(xpath ="//input[@id=\"workCheckAll\"]")     
	public WebElement WorkExpCheckBox;
	
	@FindBy(xpath ="//*[@id=\"delWorkExperience\"]")     
	public WebElement WokExpDeleteBtn;
	
	//Education
	
	@FindBy(xpath ="//*[@id=\"addEducation\"]")
	public WebElement EduAddBtn;
	
	@FindBy(xpath ="//select[@id=\"education_code\"]")    //select
	public WebElement EduLevel;
	
	  
	public List<WebElement> EduLevelOptions = driver.findElements(By.xpath("//*[@id=\"education_code\"]/option"));
	
   // select class
	
	
	@FindBy(xpath ="//*[@id=\"education_institute\"]")
	public WebElement EduInstitute;
	
	@FindBy(xpath ="//*[@id=\"education_major\"]")
	public WebElement EduMajor;
	
	@FindBy(xpath ="//*[@id=\"education_year\"]")
	public WebElement EduYear;
	
	@FindBy(xpath ="//*[@id=\"education_gpa\"]")
	public WebElement EduGPA;
	
	// yyy-mm-dd
	@FindBy(xpath ="//*[@id=\"education_start_date\"]")
	public WebElement EdufromDate;
	
	// yyy-mm-dd
	@FindBy(xpath ="//*[@id=\"education_end_date\"]")
	public WebElement EduToDate;
	
	@FindBy(xpath ="//*[@id=\"btnEducationSave\"]")
	public WebElement EduSaveBtn;
	
	@FindBy(xpath ="//*[@id=\"tblEducation\"]/table/tbody")
	public WebElement EduTable;
	
	@FindBy(xpath ="//*[@id=\"educationCheckAll\"]")     
	public WebElement EduCheckBox;
	
	@FindBy(xpath ="//*[@id=\"delEducation\"]")     
	public WebElement EduDeleteBtn;
	
	
	// Add Skill
	
	@FindBy(xpath ="//*[@id=\"addSkill\"]")
	public WebElement SkillAddBtn;
	
	@FindBy(xpath ="//select[@id=\"skill_code\"]")     // Select // Java , Cucumber
	public WebElement SkillSelect;
	
	@FindBy(xpath ="//*[@id=\"skill_years_of_exp\"]")
	public WebElement SkillYearsOfExp;
	
	@FindBy(xpath ="//*[@id=\"skill_comments\"]")
	public WebElement SkillComments;
	
	@FindBy(xpath ="//*[@id=\"btnSkillSave\"]")
	public WebElement SkillSaveBtn;
	
	@FindBy(xpath ="//*[@id=\"frmDelSkill\"]/table/tbody")
	public WebElement SkillTable;
	
	@FindBy(xpath ="//*[@id=\"skillCheckAll\"]")     
	public WebElement SkillCheckBox;
	
	@FindBy(xpath ="//*[@id=\"delSkill\"]")     
	public WebElement SkillDeleteBtn;
	
	
	// Languages
	
	@FindBy(xpath ="//*[@id=\"addLanguage\"]")
	public WebElement LangAddBtn;
	
	@FindBy(xpath ="//select[@id=\"language_code\"]")     // Select 
	public WebElement LangSelect;
	
	@FindBy(xpath ="//select[@id=\"language_lang_type\"]")     // Select 
	public WebElement LangFluency;
	
	@FindBy(xpath ="//select[@id=\"language_competency\"]")     // Select 
	public WebElement LangCompetency;
	
	@FindBy(xpath ="//*[@id=\"language_comments\"]")
	public WebElement LangComments;
	
	@FindBy(xpath ="//*[@id=\"btnLanguageSave\"]")
	public WebElement LangSaveBtn;
	
	@FindBy(xpath ="//*[@id=\"lang_data_table\"]/tbody")
	public WebElement LangTable;
	
	@FindBy(xpath ="//*[@id=\"languageCheckAll\"]")     
	public WebElement LanguageCheckBox;
	
	@FindBy(xpath ="//*[@id=\"delLanguage\"]")     
	public WebElement LanguageDeleteBtn;
	
	
	
	
	// License
	
	@FindBy(xpath ="//*[@id=\"addLicense\"]")
	public WebElement LicenseAddBtn;
	
	@FindBy(xpath ="//select[@id=\"license_code\"]")     // Select 
	public WebElement LicenseTypeSelect;
	
	@FindBy(xpath ="//*[@id=\"license_license_no\"]")
	public WebElement LicenseNumber;
	
	@FindBy(xpath ="//*[@id=\"license_date\"]")
	public WebElement LicenseIssueDate;
	
	@FindBy(xpath ="//*[@id=\"license_renewal_date\"]")    //should be in the future
	public WebElement LicenseExpDate;
	
	@FindBy(xpath ="//*[@id=\"btnLicenseSave\"]")
	public WebElement LicenseSaveBtn;
	
	@FindBy(xpath ="//*[@id=\"frmDelLicense\"]/table/tbody")
	public WebElement LicenseTable;
	
	@FindBy(xpath ="//*[@id=\"licenseCheckAll\"]")     
	public WebElement LicenseCheckBox;
	
	@FindBy(xpath ="//*[@id=\"delLicense\"]")     
	public WebElement LicenseDeleteBtn;
	
	
	
	
	
	
	// Attachments
	
	@FindBy(xpath ="//*[@id=\"btnAddAttachment\"]")   // robot class
	public WebElement AttchAddBtn;
	
	@FindBy(xpath ="//*[@id=\"ufile\"]")
	public WebElement SelectFileBtn;
	
	@FindBy(xpath ="//*[@id=\"txtAttDesc\"]")
	public WebElement SelectComment;
	
	
	
	
	public QualificationsElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	}
	

