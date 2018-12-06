package com.cucumber.steps;

import com.cucumber.page.CalculatorPage;
import com.cucumber.util.PageUtils;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class E2ESteps {
    private static Logger logger = Logger.getLogger(E2ESteps.class.getName());

    @Before
    public void setUp() {
        CalculatorPage.initializeDriver();
    }

    @After
    public void tearDown(){
        CalculatorPage.closeBrowser();
    }

    @Given("^user is  on homepage and title is \"([^\"]*)\"$")
    public void user_is_on_homepage(String title) throws Throwable {
        CalculatorPage.verifyHomePageTitle(title);
    }

    @Given("^user opens url \"([^\"]*)\"$")
    public void user_opens_url(String url) throws Throwable {
        CalculatorPage.openUrl(url);
    }

    @Then("^user select Application type as \"([^\"]*)\"$")
    public void user_selects_as(String locator) throws Throwable {
        CalculatorPage.selectApplicationType(locator);
    }

    @Then("^user selects dependents option as$")
    public void user_selects_as(DataTable dropDownSelect) throws Throwable {
       CalculatorPage.selectDependents(dropDownSelect);
    }

    @Then("^user clicks on buy type as \"([^\"]*)\"$")
    public void user_clicks_on_buy_type_as(String locator) throws Throwable {
        CalculatorPage.selectBuyType(locator);
    }

    @Then("^user enters income as$")
    public void user_enters_income_as(DataTable income) throws Throwable {
        CalculatorPage.enterIncome(income);
    }

    @Then("^user enter other income as$")
    public void user_enter_other_income_as(DataTable otherIncome) throws Throwable {
        CalculatorPage.enterOtherIncome(otherIncome);
    }

    @Then("^user enters living expense as$")
    public void user_enters_living_expense_as(DataTable expense) throws Throwable {
        CalculatorPage.enterExpense(expense);
    }

    @Then("^user enters current home loan repayments as$")
    public void user_enters_current_home_loan_repayments_as(DataTable homeLoan) throws Throwable {
        CalculatorPage.enterHomeLoan(homeLoan);

    }

    @Then("^user enters loan repayments as$")
    public void user_enters_loan_repayments_as(DataTable otherLoan) throws Throwable {
        CalculatorPage.enterOtherLoan(otherLoan);

    }

    @Then("^user enters other commitments as$")
    public void user_enters_other_commitments_as(DataTable otherCommitment) throws Throwable {
        CalculatorPage.enterOtherCommitment(otherCommitment);
    }

    @Then("^user enters total credit cards limit as$")
    public void user_enters_total_credit_cards_limit_as(DataTable creditLimit) throws Throwable {
        CalculatorPage.enterCreditLimit(creditLimit);

    }

    @When("^user clicks on how much I can \"([^\"]*)\"$")
    public void user_clicks_on_how_much_I_can(String borrowButton) throws Throwable {
        CalculatorPage.clickBorrowButton(borrowButton);
    }

    @Then("^user see \"([^\"]*)\" as \"([^\"]*)\"$")
    public void user_see_as(String amount, String result) throws Throwable {
        CalculatorPage.verifyBorrowAmount(amount,result);

    }



}
