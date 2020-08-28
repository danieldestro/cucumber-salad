package cucumber.salad;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
//@RunWith(SpringRunner.class)
@ContextConfiguration(classes = App.class)
public class AppIT {

	@Test
	public void contextLoads() {
	}
}
