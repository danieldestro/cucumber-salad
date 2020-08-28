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

	@Given("there are no names configured")
	public void deleteStorages() {
		info.setName(null);
		assertThat(info.getName()).isNull();
		log.info("there are no names configured");
	}

	@When("I say hello to {string}")
	public void hello(String name) {
		String phrase = service.hello(name);
		assertThat(phrase).isEqualTo("Hello, " + name);
		info.setName(name);
		log.info("I say hello to " + name);
	}

	@When("my friend says whats up to him")
	public void whatsup() {
		String phrase = service.whatsup(info.getName());
		assertThat(phrase).isEqualTo("Whats up, " + info.getName());
		log.info("my friend says whats up to " + info.getName());
	}

	@Then("everyone goes home")
	public void goHome() {
		info.setName(null);
		log.info("everyone goes home");
	}

	@Then("no one {yesOrNo} around")
	public void empty(boolean empty) {
		if (empty) {
			assertThat(info.getName()).isNull();
		} else {
			assertThat(info.getName()).isNotNull();
		}
		log.info("no one " + empty + " around");
	}
}
