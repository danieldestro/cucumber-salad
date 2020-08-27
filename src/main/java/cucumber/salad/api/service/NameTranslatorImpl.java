package cucumber.salad.api.service;

import org.springframework.stereotype.Service;

@Service
public class NameTranslatorImpl implements NameTranslator {

	@Override
	public String translate(String name, String optional) {
		return (name == null ? optional : name);
	}
}
