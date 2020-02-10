 #Author: kadirgok1@gmail.com
@sprint2 @empdependent
Feature: Dependent feature
 
  
   
  @regression
  Scenario: Enter Dependent Name
  Given I am logged into Syntax
  #And I navigated to Add Employee Page
    #When I add "Lebron", "R" and "James"
    #And I click Save
    #Then I see Employee has been succesfully added
    And I navigate to Employee List Page
    When I enter name to employee name
    And I click on search button
    And I click on id number
    Given I see Personal Details Page open
    And I navigate Depentents page to Add a dependent
    When I filled The dependent details and save
    And I verified the dependent saved
  