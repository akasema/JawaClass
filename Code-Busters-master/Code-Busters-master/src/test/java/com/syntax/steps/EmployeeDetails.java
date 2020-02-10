package com.syntax.steps;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeDetails extends CommonMethods{

	@Given("I am logged into Syntax")
	public void i_am_logged_into_Syntax() {
	    login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
	}

	@Given("I navigate to Employee List Page")
	public void i_navigate_to_Employee_List_Page() {
		dashboard.navigateToEmployeeList();
	}

	@When("I enter name to employee name")
	public void i_enter_name_to_employee_name() throws InterruptedException {
	sendText(empList.searchName,"Lebron");
	 // driver.findElement(By.id("empsearch_id")).sendKeys("9009");
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
	   jsClick(empList.searchBtn);
	}

	@When("I click on id number")
	public void i_click_on_id_number() {
		jsClick(empList.empNum);
	}

	@Then("I see Personal Details Page open")
	public void i_see_Personal_Details_Page_open() {
	    driver.getTitle();
	    System.out.println("I am in personal details page");
	}
	
}
