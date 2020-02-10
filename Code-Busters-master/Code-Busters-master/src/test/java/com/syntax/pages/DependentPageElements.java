package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;

public class DependentPageElements extends CommonMethods{
	@FindBy(linkText = "PIM")
	public WebElement pim;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pimA;
	
	@FindBy(id="empsearch_id")
	public WebElement empIdA;
	
	@FindBy(id = "employeeId")
	public WebElement empId;
	
	@FindBy(id="searchBtn")
	public WebElement srcBtn;
	
	@FindBy(id="edit")
	public WebElement edit;
	
	@FindBy(xpath ="//a[@href='/Syntax_HRM/symfony/web/index.php/pim/viewDependents/empNumber/9462']")
	public WebElement depenedents;
	
	@FindBy(id="btnAddDependent")
	public WebElement btnAddDependent;
	
	@FindBy(name="dependent[name]")
	public WebElement depName;
	
	@FindBy(xpath="//select")
	public WebElement relType;
	
	@FindBy(name="Child")
	public WebElement child;
	
	@FindBy(name="Other")
	public WebElement other;
	
	@FindBy(name="dependent_relationship")
	public WebElement reltypeName;
	
	@FindBy(id="dependent_dateOfBirth")
	public WebElement depBirth;
	
	@FindBy(name="btnSaveDependent")
	public WebElement saveDep;
	
	@FindBy(name="dependentName")
	public WebElement verify;
	
	public DependentPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}



