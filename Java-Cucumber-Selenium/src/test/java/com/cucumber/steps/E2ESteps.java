package com.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.logging.Logger;

public class E2ESteps {
    private static Logger logger = Logger.getLogger(E2ESteps.class.getName());

    @Given("^user is  on homepage$")
    public void user_is_on_homepage() throws Throwable {
        logger.info("Inside steps");
    }
}
