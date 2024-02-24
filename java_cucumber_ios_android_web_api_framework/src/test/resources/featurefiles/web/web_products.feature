Feature: Products

  @web_products   @web_sanity   @web_regression
  Scenario: Verify cart icon is visible
    Given User is in Login Page
    Then  User enters valid username and password
    And   Click on the login button
    Then  User will be able to login successfully
    And   User will be able to see the cart icon

  @web_products   @web_regression
  Scenario: Verify product filter option is visible
    Given User is in Login Page
    Then  User enters valid username and password
    And   Click on the login button
    Then  User will be able to login successfully
    And   User will be able to see the product filter option