package com.hrms.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.util.BaseClass;

public class DashboardPageElements {
	
	@FindBy(linkText="Leave")
	public WebElement leaveLnk;
	
	@FindBy(linkText="Leave List")
	public WebElement leaveList;
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}