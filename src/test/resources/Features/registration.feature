Feature: Verify Registration Functionality
  Scenario: New customer registration
    Given I am on the registration page
    When I enter a valid Username "J2399115D1166oe123"
    And I enter a valid Email address "j2511h99n616oe@example.com"
    And I enter a valid Password "j2h11199o567e@example.com"
    And I submit the registration form
    Then I should be automatically redirected to the customer login page
