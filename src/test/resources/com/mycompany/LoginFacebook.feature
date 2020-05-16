Feature: CucumberJava

Scenario: Login into facebook with invalid credentials 

    Given I open Facebook page
    And I fill "//*[@id='email']" field with "muko002@mailinator.com"
    And I fill "//*[@id='pass']" field with "Mukomuko"
    When I click on login button "//*[@id='u_0_b']"
    Then Page title is "Log into Facebook | Facebook"
  