Feature: Login

  Scenario: Login with valid credentials
    When I am navigated to login page
    And I enter valid credentials
    And I click on login button
    Then I am successfully logged

