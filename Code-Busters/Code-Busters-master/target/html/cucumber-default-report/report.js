$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DependentPage.feature");
formatter.feature({
  "name": "Dependent feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@empdependent"
    }
  ]
});
formatter.scenario({
  "name": "Enter Dependent Name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@empdependent"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am logged into Syntax",
  "keyword": "Given "
});
formatter.match({
  "location": "EmployeeDetails.i_am_logged_into_Syntax()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Employee List Page",
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeDetails.i_navigate_to_Employee_List_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter name to employee name",
  "keyword": "When "
});
formatter.match({
  "location": "EmployeeDetails.i_enter_name_to_employee_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeDetails.i_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on id number",
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeDetails.i_click_on_id_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see Personal Details Page open",
  "keyword": "Given "
});
formatter.match({
  "location": "EmployeeDetails.i_see_Personal_Details_Page_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate Depentents page to Add a dependent",
  "keyword": "And "
});
formatter.match({
  "location": "DependentsPageSteps.i_navigate_Depentents_page_to_Add_a_dependent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I filled The dependent details and save",
  "keyword": "When "
});
formatter.match({
  "location": "DependentsPageSteps.i_filled_The_dependent_details_and_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verified the dependent saved",
  "keyword": "And "
});
formatter.match({
  "location": "DependentsPageSteps.i_verified_the_dependent_saved()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});