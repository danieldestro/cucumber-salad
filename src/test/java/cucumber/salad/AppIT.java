package cucumber.salad;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cucumber.salad.App;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = App.class)
public class AppIT {

	@Test
	public void contextLoads() {
	}
}
