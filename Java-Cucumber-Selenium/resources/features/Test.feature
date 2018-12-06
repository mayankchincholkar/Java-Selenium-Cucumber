Feature: Login Feature
  Verify if user is able to Login in to the site

  Background:
    Given user opens url "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"

  Scenario: Home Loan Calculator
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
    Then user see "$479,000" as "result"
