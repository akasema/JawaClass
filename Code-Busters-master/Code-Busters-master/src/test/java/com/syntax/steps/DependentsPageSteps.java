package com.syntax.steps;


	import javax.lang.model.util.Elements;

	import com.syntax.utils.CommonMethods;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;

	public class DependentsPageSteps extends CommonMethods{
		@Given("I navigate Depentents page to Add a dependent")
		public void i_navigate_Depentents_page_to_Add_a_dependent() {
		 jsClick(dependent.depenedents);
		 jsClick(dependent.btnAddDependent);
		
		}

		@When("I filled The dependent details and save")
		public void i_filled_The_dependent_details_and_save() {
			 sendText(dependent.depName, "Mary");
			 jsClick(dependent.relType);
			 selectDdValue(dependent.relType, "Child");
			 sendText(dependent.depBirth, "1990-10-10" );
			 jsClick(dependent.saveDep);
			 
		}

		@When("I verified the dependent saved")
		public void i_verified_the_dependent_saved() {
		    
		}

	}


