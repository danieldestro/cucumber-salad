package cucumber.salad.api.integration.cucumber.steps;

import cucumber.salad.api.integration.cucumber.CucumberSpringContextConfig;
import io.cucumber.java.ParameterType;

public class GenericStepDefinitions extends CucumberSpringContextConfig {

	@ParameterType(name = "yesOrNo", value = "yes|no|do|dont|is|isnt|isn´t|are|arent|aren´t|true|false")
	public boolean yesOrNo(String value) {
		switch(value) {
		case "yes":
		case "do":
		case "true":
		case "is":
		case "are":
			return true;
		case "no":
		case "dont":
		case "false":
		case "isnt":
		case "isn't":
		case "arent":
		case "aren't":
		default:
			return false;
		}
	}
}
