package cucumber.salad.api.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * This is a Unit Test with Mockito.
 */
@ExtendWith(MockitoExtension.class)
public class DummyServiceTest {
	
	@Mock
	private NameTranslator translator;
	
	@InjectMocks
	private DummyService service = new DummyServiceImpl();

	@Test
	public void testHello() {
		Mockito.when(translator.translate(null, "World")).thenReturn("World");
		Mockito.when(translator.translate("Mario", "World")).thenReturn("Mario");
		
		assertThat(service.hello()).isEqualTo("Hello, World");
		assertThat(service.hello(null)).isEqualTo("Hello, World");
		assertThat(service.hello("Mario")).isEqualTo("Hello, Mario");
	}

	@Test
	public void testWhatsup() {
		Mockito.when(translator.translate(null, "dude")).thenReturn("dude");
		Mockito.when(translator.translate("Mary", "dude")).thenReturn("Mary");
		
		assertThat(service.whatsup()).isEqualTo("Whats up, dude");
		assertThat(service.whatsup(null)).isEqualTo("Whats up, dude");
		assertThat(service.whatsup("Mary")).isEqualTo("Whats up, Mary");
	}
}
