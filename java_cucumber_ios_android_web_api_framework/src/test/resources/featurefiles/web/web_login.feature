Feature: Login

  @login    @sanity     @regression
  Scenario: Verify login with valid credential
    Given User is in Login Page
    Then  User enters valid username and password
    And   Click on the login button
    Then  User will be able to login successfully

  @login    @regression
  Scenario: Verify login with invalid credential
    Given User is in Login Page
    Then  User enters invalid username and password
    And   Click on the login button
    Then  User will not be able to login
