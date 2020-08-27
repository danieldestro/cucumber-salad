package cucumber.salad.api.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * This is an Integrated Test.
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class DummyServiceIT {
	
	@Autowired
	private DummyService service;

	@Test
	public void testHello() {
		assertThat(service.hello()).isEqualTo("Hello, World");
		assertThat(service.hello(null)).isEqualTo("Hello, World");
		assertThat(service.hello("Mario")).isEqualTo("Hello, Mario");
	}

	@Test
	public void testWhatsup() {
		assertThat(service.whatsup()).isEqualTo("Whats up, dude");
		assertThat(service.whatsup(null)).isEqualTo("Whats up, dude");
		assertThat(service.whatsup("Mary")).isEqualTo("Whats up, Mary");
	}
}
