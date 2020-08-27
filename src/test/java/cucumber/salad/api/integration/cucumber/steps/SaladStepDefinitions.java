package cucumber.salad.api.integration.cucumber.steps;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.salad.api.integration.cucumber.CucumberSpringContextConfig;
import cucumber.salad.api.service.DummyService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SaladStepDefinitions extends CucumberSpringContextConfig {
	
	@Autowired
	private DummyService service;
	
	@Autowired
	private SaladInfo info;

	@Given("there are no name configured")
	public void deleteStorages() {
		assertThat(info.getName()).isNull();
	}

	@When("I say hello to {string}")
	public void hello(String name) {
		String phrase = service.hello(name);
		assertThat(phrase).isEqualTo("Hello, "+name);
		info.setName(name);
	}

	@When("My friend says whats up to him")
	public void whatsup() {
		String phrase = service.whatsup(info.getName());
		assertThat(phrase).isEqualTo("What´s up, "+info.getName());
	}

	@Then("Everyone goes home")
	public void goHome() {
		info.setName(null);
	}

	@Then("No one {yesOrNo} around")
	public void empty(boolean empty) {
		if(empty) {
			assertThat(info.getName()).isNull();
		} else {
			assertThat(info.getName()).isNotNull();
		}
	}
}