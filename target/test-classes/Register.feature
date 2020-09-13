Feature: Register

  Scenario: Register user
    When I navigate to page
    And Click on register link
    And Enter my personal details respectively
    And Click on Register button
    Then I am successfully registered
