package com.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "resources/features", glue = {"com.cucumber.steps"}, tags = {"@EndToEndTest","@This"})
public class RunE2ECukeTest {
}
