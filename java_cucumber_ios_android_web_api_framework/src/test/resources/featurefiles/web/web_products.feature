Feature: Products

  @products   @sanity   @regression
  Scenario: Verify cart icon is visible
    Given User is in Login Page
    Then  User enters valid username and password
    And   Click on the login button
    Then  User will be able to login successfully
    And   User will be able to see the cart icon