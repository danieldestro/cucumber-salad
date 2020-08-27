package cucumber.salad.api.integration.cucumber.steps;

import org.springframework.stereotype.Component;

import io.cucumber.spring.ScenarioScope;
import lombok.Data;

@Data
@Component
@ScenarioScope
public class SaladInfo {

	private String name;
}
