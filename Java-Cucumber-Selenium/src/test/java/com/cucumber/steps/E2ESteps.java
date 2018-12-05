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

    @Then("^user clicks on \"([^\"]*)\"$")
    public void user_selects_as(String locator) throws Throwable {
        CalculatorPage.selectApplicationType(locator);
    }

    @Then("^user selects option as$")
    public void user_selects_as(DataTable dropDownSelect) throws Throwable {
       CalculatorPage.selectDependents(dropDownSelect);
    }

}
