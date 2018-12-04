Feature: Login Feature
  Verify if user is able to Login in to the site

  Background:
    Given user opens url "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"

  Scenario: Login as a authenticated user
    Given user is  on homepage