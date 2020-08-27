package cucumber.salad.api.integration.cucumber;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;

import cucumber.salad.App;
import io.cucumber.spring.CucumberContextConfiguration;

@ContextConfiguration
@CucumberContextConfiguration
@SpringBootTest(classes = App.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class CucumberSpringContextConfig {
	
	@LocalServerPort
	protected int port;
	
	public int getPort() {
		return port;
	}
}
