Feature: Sign In feature
  I want to use this template for my feature file

  Background: 
    Given User is on retail website
    When User click on Sign in option

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'sadia.alimi1@gmail.com' and password 'Poilkj098$123'
    And User click on login button
    Then User should be logged in into Account

  @SignInTest
  Scenario Outline: Verify user can sign in into Retail Application with different email and pass
    And User enter email <email> and password <password>
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | emial                    | Password        |
      | 'sadia.alimi1@gmail.com' | 'Poilkj098$123' |
      | 'sadia@gmail.com'        | 'Poilkj098$123' |

  Scenario: Verify user can creaate an account into retail website
    And user click on Create New Account button
    And user fill the signUp information with below data
      | name  | email                | password      | confirmPassword |
      | sadia | sadiaa0711@gmail.com | Poilkj098$123 | Poilkj098$123   |
    And user click on SignUp button
    Then user should be logged into account page

  @signUpTest
  Scenario Outline: Verify user can creaate an account into retail website
    And user click on Create New Account button
    And user fill the signUp information with below data
      | name   | email   | password   | confirmPassword   |
      | <name> | <email> | <password> | <confirmPassword> |
    And user click on SignUp button
    Then user should be logged into account page

    Examples: 
      | name  | email                  | password      | confirmPassword |
      | sadia | sadsiaa071d1@gmail.com | Poilkj098$123 | Poilkj098$123   |
      | sadia | sadisaa0711@gmail.com  | Poilkj098$123 | Poilkj098$123   |
      | sadia | sadidaa0711@gmail.com  | Poilkj098$123 | Poilkj098$123   |
      | sadia | sadiaac0a711@gmail.com | Poilkj098$123 | Poilkj098$123   |
