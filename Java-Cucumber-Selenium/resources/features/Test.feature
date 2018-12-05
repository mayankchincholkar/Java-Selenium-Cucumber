Feature: Login Feature
  Verify if user is able to Login in to the site

  Background:
    Given user opens url "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"

  Scenario Outline: Login as a authenticated user
    Given user is  on homepage and title is "Home loan borrowing power calculator | ANZ"
    Then user clicks on "<Selector>"
    And user selects "<Selector>" as "<Value>"
    Examples:
      | Selector                | Value |
      | Application Type Single |       |
      | Number of dependents    | 0     |