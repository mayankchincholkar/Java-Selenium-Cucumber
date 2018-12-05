Feature: Login Feature
  Verify if user is able to Login in to the site

  Background:
    Given user opens url "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"

  Scenario: Home Loan Calculator
    Given user is  on homepage and title is "Home loan borrowing power calculator | ANZ"
    Then user clicks on "Application Type Single"
    And user selects option as
      | Number of dependents | 0 |
    And user clicks on "Home to live in"