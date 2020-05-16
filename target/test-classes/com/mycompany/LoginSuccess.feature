Feature: Successfully login into facebook

  @login_page
  Scenario: 
    Given I navigate to FacebookPage
    And I fill "loginName" field with "muko002@mailinator.com"
    And I fill "password" field with "Mukomuko"
    When I press "//*[@id='u_0_b']" button
    Then Page title is "Log into Facebook | Facebook"
  