package com.cucumber.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class E2ESteps {
    private static Logger logger = Logger.getLogger(E2ESteps.class.getName());
    private WebDriver driver;

    @Before
    public void setUp() {
        logger.info("Inside before");
        System.setProperty("webdriver.chrome.driver","./resources/drivers/chrome-driver/chromedriver");
        driver= new ChromeDriver();
    }

    @Given("^user is  on homepage$")
    public void user_is_on_homepage() throws Throwable {
        logger.info("Inside steps");
    }

    @Given("^user opens url \"([^\"]*)\"$")
    public void user_opens_url(String url) throws Throwable {
        driver.get(url);
    }

}
