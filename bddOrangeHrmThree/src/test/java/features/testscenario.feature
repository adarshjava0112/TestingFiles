
Feature: login functionality of ornage HRM

  
  Scenario: verify if login functionality is working right
    Given QA environment is up and running
    When a user enter username
    Then enter password
    And clicks login then user should see homepage

 
