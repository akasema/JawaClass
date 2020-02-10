
@Sprint1
Feature: Employee Details
  
  @smoke
  Scenario: Navigate to Employee Details Page
    Given I am logged into Syntax
    And I navigate to Employee List Page
    When I enter name to employee name
    And I click on search button
    And I click on id number
    Then I see Personal Details Page open
   