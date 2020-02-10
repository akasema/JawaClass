package com.syntax.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QualificationsSteps extends CommonMethods{

	
	@When("I click to Qualifications Link")
	public void click_Qualifications () throws InterruptedException { 
		 click(qual.QualLink);
		 
		 Thread.sleep(2000);
		}
	
	
	@And("I click Add Work Experience")
	public void Add_Exp () { 
		
		click(qual.WorkExpAddBtn);
		
		}
	
	@Then("I Add Exp Details {string}, {string}, {string}, {string}, {string}")
	public void Add_Exp_Details (String Company, String Job, String From, String To, String Comment) { 
		
		sendText(qual.WorkExpCompany,Company);
		sendText(qual.WorkExpJobTitle,Job);
		sendText(qual.WorkExpFromDate,From);
		sendText(qual.WorkExpToDate,To);
		sendText(qual.WorkExpComment,Comment);
		}
	
	@And("I click the Save Button")
	public void click_SaveBtn () throws InterruptedException { 
		
		click(qual.WorkExpSaveBtn);
		Thread.sleep(1000);
		}
	
	
	
	@Then("I see Work Exp Has Been Added {string}")
	public void check_WorkExp (String Company) throws InterruptedException { 
		boolean check = false;
		boolean expected =true;
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"frmDelWorkExperience\"]/table/tbody/tr"));
		List<WebElement> firstCells=null;
		WebElement WETableRow=null;
		
		WebElement firstCell=null;
		int i=0;
		
		for (i=1; i<=rows.size();i++) {
			 firstCell = driver.findElement(By.xpath("//*[@id=\"frmDelWorkExperience\"]/table/tbody/tr["+i+"]/td[2]"));
			
			 String firstCellText = firstCell.getText();
			 if (firstCellText.equals(Company)) {
				 check=true;
				 WETableRow =driver.findElement(By.xpath("//*[@id=\"frmDelWorkExperience\"]/table/tbody/tr["+i+"]"));
				 HighlightElementGreen(WETableRow);
				 break;
			 }else {
				 HighlightElement(qual.WorkExpTable);
			 }

		Assert.assertEquals( expected, check);
		
		
		}
		
	
	
	}
	
	@And("I Delete All Work Experiences")
	public void delete_WE ()  { 
		 click(qual.WorkExpCheckBox);
		 click(qual.WokExpDeleteBtn);
		 
		}
	

	@And("I click Add Education")
	public void click_Education () throws InterruptedException { 
		 click(qual.EduAddBtn);
		 
		 Thread.sleep(2000);
		}
	
	
	
	@Then("I Add Education Details {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void add_Education_details (
			String Level, String Institute, String Major, String Year, String GPA, String Start, String End
			) throws InterruptedException { 
		 
		Select slc =new Select(qual.EduLevel);
       List<WebElement> ls = slc.getOptions();
		
		for(int i=0; i<ls.size();i++) {
		slc.selectByIndex(i);
		
		 Thread.sleep(1000);
		}
		
		
		
		slc.selectByVisibleText(Level);
		sendText(qual.EduInstitute,Institute);
		sendText(qual.EduMajor,Major);
		sendText(qual.EduYear,Year);
		sendText(qual.EduGPA,GPA);
		sendText(qual.EdufromDate,Start);
		sendText(qual.EduToDate,End);
		
		
		}
	
	
	@And("I click the Education Save Button")
	public void click_Education_Save () throws InterruptedException { 
		 click(qual.EduSaveBtn);
		 
		 Thread.sleep(1000);
		}
	  
	
	
	
	@Then ("I See Edu Details Has Been Added {string}")
	public void chec_Edu (String GPA) throws InterruptedException { 
		 
		boolean check = false;
		boolean expected =true;
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"tblEducation\"]/table/tbody/tr"));
		
		WebElement WETableRow=null;
		
		WebElement sixthCell=null;
		int i=0;
		
		for (i=1; i<=rows.size();i++) {
			 sixthCell = driver.findElement(By.xpath("//*[@id=\"tblEducation\"]/table/tbody/tr["+i+"]/td[4]"));
			
			 String CellText = sixthCell.getText();
			
			 if (CellText.equals(GPA)) {
				 check=true;
				 WETableRow =driver.findElement(By.xpath("//*[@id=\"tblEducation\"]/table/tbody/tr["+i+"]"));
				 HighlightElementGreen(WETableRow);
				 break;
			 }else {
				 HighlightElement(qual.EduTable);
			 }

		Assert.assertEquals( expected, check);
		
		}
	
	}
	
	@And("I Delete All Education")
	public void delete_edu () throws InterruptedException { 
		 click(qual.EduCheckBox);
		 click(qual.EduDeleteBtn);
		 Thread.sleep(1000);
		 
		}
	

	
	@And("I click Add Skills")
	public void click_add_skill () throws InterruptedException { 
		 click(qual.SkillAddBtn);
		 
		 Thread.sleep(1000);
		 
		 scrollDown(400);
		}
	
	
	@Then("I Add Skill Details {string}, {string}, {string}")
	public void add_skill_details(String Skill,String Years, String Comments) throws InterruptedException { 
		 
		Select slc =new Select(qual.SkillSelect); 
		
		List<WebElement> ls = slc.getOptions();
		
		for(int i=0; i<ls.size();i++) {
		slc.selectByIndex(i);
		
		 Thread.sleep(1000);
		}
		
		slc.selectByVisibleText(Skill);
		
		sendText(qual.SkillYearsOfExp,Years);
		sendText(qual.SkillComments,Comments);
	
	}
	
	
	@And("I click the Skill Save Button")
	public void click_skill_Save () throws InterruptedException { 
		 click(qual.SkillSaveBtn);
		 
		 Thread.sleep(1000);
		}
	
	
	@Then("I see Skill Has Been Added {string}")
	public void check_skill (String Skill) throws InterruptedException { 
		boolean check = false;
		boolean expected =true;
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"frmDelSkill\"]/table/tbody/tr"));
		
		WebElement WETableRow=null;
		
		WebElement sixthCell=null;
		int i=0;
		
		for (i=1; i<=rows.size();i++) {
			 sixthCell = driver.findElement(By.xpath("//*[@id=\"frmDelSkill\"]/table/tbody/tr["+i+"]/td[2]"));
			
			 String CellText = sixthCell.getText();
			
			 if (CellText.equals(Skill)) {
				 check=true;
				 WETableRow =driver.findElement(By.xpath("//*[@id=\"frmDelSkill\"]/table/tbody/tr["+i+"]"));
				 HighlightElementGreen(WETableRow);
				 break;
			 }else {
				 HighlightElement(qual.SkillTable);
			 }

		Assert.assertEquals( expected, check);
		
		} 
	}	 
		
	
	@And("I Delete All Skills")
	public void delete_skills () throws InterruptedException { 
		 click(qual.SkillCheckBox);
		 click(qual.SkillDeleteBtn);
		 
		 Thread.sleep(1000);
		 scrollDown(600);
		}
	
	
	
	
	
	@And("I click Add Languages")
	public void click_Add_Languages () throws InterruptedException { 
		 click(qual.LangAddBtn);
		 
		 Thread.sleep(1000);
		 scrollDown(600);
		}
	
	
	@Then("I Add Language Details {string}, {string}, {string}, {string}")
	public void click_Add_Languages_details (String Language, 
			String Fluency, String Competency, String Comments) throws InterruptedException { 
		 
        Select slc =new Select(qual.LangSelect); 
		
		List<WebElement> ls = slc.getOptions();
		
		for(int i=0; i<ls.size();i++) {
		slc.selectByIndex(i);
		
		 Thread.sleep(1000);
		}
		
		slc.selectByVisibleText(Language);
		
		
		slc= new Select(qual.LangFluency);
		List<WebElement> la = slc.getOptions();
		
		for(int i=0; i<la.size();i++) {
		slc.selectByIndex(i);
		
		 Thread.sleep(1000);
		}
		
		slc.selectByVisibleText(Fluency);
		
		
		slc= new Select(qual.LangCompetency);
		List<WebElement> lr = slc.getOptions();
		
		for(int i=0; i<la.size();i++) {
		slc.selectByIndex(i);
		
		 Thread.sleep(1000);
		}
		
		slc.selectByVisibleText(Competency);
		
		sendText(qual.LangComments,Comments);
		
		 Thread.sleep(1000);
		}
	
	
	@And("I click the Language Save Button")
	public void click_Save_Languages () throws InterruptedException { 
		 click(qual.LangSaveBtn);
		 
		 Thread.sleep(1000);
		}
	
	
	@Then("I See Language Details Has Been Added {string}")
	public void check_language(String Language) throws InterruptedException { 
		
		boolean check = false;
		boolean expected =true;
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"lang_data_table\"]/tbody/tr"));
		
		WebElement WETableRow=null;
		
		WebElement sixthCell=null;
		int i=0;
		
		for (i=1; i<=rows.size();i++) {
			 sixthCell = driver.findElement(By.xpath("//*[@id=\"lang_data_table\"]/tbody/tr["+i+"]/td[2]"));
			
			 String CellText = sixthCell.getText();
			
			 if (CellText.equals(Language)) {
				 check=true;
				 WETableRow =driver.findElement(By.xpath("//*[@id=\"lang_data_table\"]/tbody/tr["+i+"]"));
				 HighlightElementGreen(WETableRow);
				 break;
			 }
		}
		
		if(!check) {
			 HighlightElement(qual.LangTable);
		 }
		Assert.assertEquals( expected, check);	
	}
	
		
	@And("I Delete All Languages")
	public void delete_langs () throws InterruptedException { 
		 click(qual.LanguageCheckBox);
		 click(qual.LanguageDeleteBtn);
		 
		 Thread.sleep(1000);
		
		}
	
	 
	
	@And("I click Add License")
	public void click_add_license () throws InterruptedException { 
		 click(qual.LicenseAddBtn);
		 
		 Thread.sleep(1000);
		 scrollDown(900);
		}
	
	
	@Then("I Add License Details {string}, {string}, {string}, {string}")
	public void add_license_details (String Type, String Number, String IssueDate, String ExpDate) throws InterruptedException { 
		
       Select slc =new Select(qual.LicenseTypeSelect); 
		
		List<WebElement> ls = slc.getOptions();
		
		for(int i=0; i<ls.size();i++) {
		slc.selectByIndex(i);
		
		 Thread.sleep(400);
		}
		
		slc.selectByVisibleText(Type);
		
		sendText(qual.LicenseNumber,Number);
		sendText(qual.LicenseIssueDate,IssueDate);
		sendText(qual.LicenseExpDate,ExpDate);
		 
		 Thread.sleep(500);
		}
	
	
	@And("I click the License Save Button")
	public void click_save_license () throws InterruptedException { 
		 click(qual.LicenseSaveBtn);
		 
		 Thread.sleep(500);
		}
	  
	
	@Then("I See License Details Has Been Added {string}")
	public void click_save_license (String IssueDate) throws InterruptedException { 
		 
		boolean check = false;
		boolean expected =true;
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"frmDelLicense\"]/table/tbody/tr"));
		
		WebElement WETableRow=null;
		
		WebElement sixthCell=null;
		int i=0;
		
		for (i=1; i<=rows.size();i++) {
			 sixthCell = driver.findElement(By.xpath("//*[@id=\"frmDelLicense\"]/table/tbody/tr["+i+"]/td[3]"));
			
			 String CellText = sixthCell.getText();
			
			 if (CellText.contains(IssueDate)) {
				 check=true;
				 WETableRow =driver.findElement(By.xpath("//*[@id=\"frmDelLicense\"]/table/tbody/tr["+i+"]"));
				 HighlightElementGreen(WETableRow);
				 break;
			 }
		}
		
		if(!check) {
			 HighlightElement(qual.LicenseTable);
		 }
		Assert.assertEquals( expected, check);	
		
		
		
		 
		 Thread.sleep(500);
		}
	
	
	@And("I Delete All Licenses")
	public void delete_licenses () throws InterruptedException { 
		 click(qual.LicenseCheckBox);
		 click(qual.LicenseDeleteBtn);
		 
		 Thread.sleep(1000);
		
		}
	 
	
	
}

