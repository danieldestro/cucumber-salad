package cucumber.salad.api.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class NameTranslatorTest {

	private NameTranslator translator = new NameTranslatorImpl();

	@Test
	public void testTranslate() {
		assertThat(translator.translate(null, null)).isNull();
		assertThat(translator.translate(null, "Mark")).isEqualTo("Mark");
		assertThat(translator.translate("Daniel", "Ralf")).isEqualTo("Daniel");
	}
}
