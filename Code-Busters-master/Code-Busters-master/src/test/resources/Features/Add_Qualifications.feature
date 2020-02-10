
@Sprint1
Feature: Add_Qualifications
  

  Background: 
    Given I am logged into Syntax
    And I navigate to Employee List Page
    When I enter name to employee name
    And I click on search button
    And I click on id number
    Then I see Personal Details Page open
    
  @smoke
  Scenario Outline: Add Qualifications Work Experience
  When I click to Qualifications Link
  And I click Add Work Experience
  Then I Add Exp Details "<Company>", "<Job>", "<From>", "<To>", "<Comment>"
  And I click the Save Button
  Then I see Work Exp Has Been Added "<Company>"
  And I Delete All Work Experiences
  Examples:
  | Company | Job | From | To | Comment |
  | Syntax | Instructor | 2017-05-05 | 2019-06-06 | Java Expert |
  | Google | Kapici | 2013-05-05 | 2016-06-06 | cok guzel cop toplar |
  | Yandex | Mafia | 2013-05-05 | 2016-06-06 | rus mafyasi |
  
  
  @smoke
  Scenario Outline: Add Qualifications Education
  When I click to Qualifications Link
  And I click Add Education
  Then I Add Education Details "<Level>", "<Institute>", "<Major>", "<Year>", "<GPA>", "<Start>", "<End>"
  And I click the Education Save Button
  Then I See Edu Details Has Been Added "<GPA>"
  And I Delete All Education
  Examples:
  | Level | Institute | Major | Year | GPA | Start | End |
  | MBA | FAU | ComputerScience | 3 | 3.68 | 2013-06-06 | 2016-06-06 |
  
  
  
  @smoke
  Scenario Outline: Add Qualifications Skills
  When I click to Qualifications Link
  And I click Add Skills
  Then I Add Skill Details "<Skill>", "<Years>", "<Comments>"
  And I click the Skill Save Button
  Then I see Skill Has Been Added "<Skill>"
  And I Delete All Skills
  Examples:
  | Skill | Years | Comments | 
  | TestNG | 12 | Expert Level |
  
  
  @smoke
  Scenario Outline: Add Qualifications Languages
  When I click to Qualifications Link
  And I click Add Languages
  Then I Add Language Details "<Language>", "<Fluency>", "<Competency>", "<Comments>"
  And I click the Language Save Button
  Then I See Language Details Has Been Added "<Language>"
  And I Delete All Languages
  Examples:
  | Language | Fluency | Competency | Comments |
  | Arabic | Speaking | Good | A2 | 
  
  
  @smoke
  Scenario Outline: Add Qualifications Licences
  When I click to Qualifications Link
  And I click Add License
  Then I Add License Details "<Type>", "<Number>", "<IssueDate>", "<ExpDate>"
  And I click the License Save Button
  Then I See License Details Has Been Added "<IssueDate>"
  And I Delete All Licenses
  Examples:
  | Type | Number | IssueDate | ExpDate |
  | Public | 954-985-12-11 | 2010-02-02 | 2023-02-02 | 
  
  
  
  
  