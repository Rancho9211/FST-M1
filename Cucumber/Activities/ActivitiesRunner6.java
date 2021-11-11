package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = "stepDefinitions",
    tags = "@activity1_1",
    plugin = {"html: test-reports"},
    //plugin = {"json: test-reports/json-report.json"},
    //plugin = {"pretty"},
    monochrome = true
)
public class ActivitiesRunner6 {

}