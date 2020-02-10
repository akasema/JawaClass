package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;

public class EmployeeListElements extends CommonMethods {

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement searchName;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")
	public WebElement empNum;
	
	public EmployeeListElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	/*public void navigateToPersonalDetailsPage() {
		jsClick(searchBtn);
	}
	 public void employeeDetails() {
		 jsClick(empNum);
	 }*/
	
	
}
