package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;



public class DashboardPageElements extends CommonMethods {

	@FindBy(linkText = "PIM")
	public WebElement pim;

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement empList;

	@FindBy(id = "welcome")
	public WebElement welcomeLnk;
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateToEmployeeList() {
		jsClick(pim);
		jsClick(empList);
	}
}
