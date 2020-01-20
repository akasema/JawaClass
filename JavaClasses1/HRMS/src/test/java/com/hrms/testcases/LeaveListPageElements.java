package com.hrms.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.util.BaseClass;

public class LeaveListPageElements {
	@FindBy(css="a.toggle.tiptip")
	public WebElement leaveListlbl;
	
	public LeaveListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
}
}