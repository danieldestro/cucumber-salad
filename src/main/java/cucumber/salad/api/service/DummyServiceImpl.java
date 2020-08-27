package cucumber.salad.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService {
	
	@Autowired
	private NameTranslator translator;

	@Override
	public String hello() {
		return hello(null);
	}

	@Override
	public String hello(String name) {
		return "Hello, " + translator.translate(name, "World");
	}

	@Override
	public String whatsup(String name) {
		return "Whats up, " + translator.translate(name, "dude");
	}

	@Override
	public String whatsup() {
		return whatsup(null);
	}
}
