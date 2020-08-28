package cucumber.salad;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = App.class)
public class AppIT {

	@Test
	public void contextLoads() {
	}
}
