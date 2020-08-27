package cucumber.salad.api.integration.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = { "pretty", "html:target/reports/cucumber", "json:target/cucumber.json", "usage:target/usage.jsonx", "junit:target/junit.xml" },
		//glue = "cucumber.salad.api.integration.cucumber",
		extraGlue = "cucumber.salad.api.integration.cucumber.steps"
)
public class CucumberIT {
}
