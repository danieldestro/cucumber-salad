package my.generics;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Config> configs = loadConfigsFromRepository(); // contain all subtypes of Config
		for (Config conf : configs) {
			Step<? extends Config> step = conf.type().getDeclaredConstructor().newInstance();

			step.setConfig(conf); // compiler complains
		}
	}

	private static List<Config> loadConfigsFromRepository() {
		List<Config> configs = new ArrayList<>();

		Config config = new ProcessConf();
		configs.add(config);
		
		config = new ValidationConf();
		configs.add(config);
		
		return configs;
	}
}
