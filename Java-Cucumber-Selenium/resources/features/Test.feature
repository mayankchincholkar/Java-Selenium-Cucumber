@EndToEndTest
Feature: Login Feature
  Verify if user is able to Login in to the site

  Background:
    Given user opens url "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"

  Scenario: Calculate borrowing estimate working as expected
    Given user is  on homepage and title is "Home loan borrowing power calculator | ANZ"
    Then user select Application type as "Application Type Single"
    And user selects dependents option as
      | Number of dependents | 0 |
    And user clicks on buy type as "Home to live in"
    And user enters income as
      | Income | 80000 |
    And user enter other income as
      | Other Income | 10000 |
    Then user enters living expense as
      | Living Expense | 500 |
    And user enters current home loan repayments as
      | Home Repayments | 0 |
    And user enters loan repayments as
      | Loan Repayments | 100 |
    And user enters other commitments as
      | Other Commitments | 0 |
    And user enters total credit cards limit as
      | Credit Limit | 10000 |
    When user clicks on how much I can "borrow button"
    Then user see "$479,000" as "borrowing estimate"

  Scenario: When mandatory fields are not passed error should be visible
    Given user is  on homepage and title is "Home loan borrowing power calculator | ANZ"
    Then user select Application type as "Application Type Single"
    And user enters living expense as
      | Living Expense | 1 |
    When user clicks on how much I can "borrow button"
    Then user see error message "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641." as "borrowing estimate error"

  @This
  Scenario: Check when start over button is pressed, all form fields clear
    Given user is  on homepage and title is "Home loan borrowing power calculator | ANZ"
    Then user select Application type as "Application Type Single"
    And user selects dependents option as
      | Number of dependents | 0 |
    And user clicks on buy type as "Home to live in"
    And user enters income as
      | Income | 80000 |
    And user enter other income as
      | Other Income | 10000 |
    Then user enters living expense as
      | Living Expense | 500 |
    And user enters current home loan repayments as
      | Home Repayments | 0 |
    And user enters loan repayments as
      | Loan Repayments | 100 |
    And user enters other commitments as
      | Other Commitments | 0 |
    And user enters total credit cards limit as
      | Credit Limit | 10000 |
    When user clicks on how much I can "borrow button"
    Then user see "$479,000" as "borrowing estimate"
    When the user clicks on "start over" button
    Then following form fields are set as
      | Number of dependents | 0 |
      | Income               |   |
      | Other Income         |   |
      | Living Expense       |   |
      | Home Repayments      |   |
      | Other Commitments    |   |
      | Credit Limit         |   |