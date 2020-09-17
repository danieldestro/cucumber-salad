package my.generics;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws Exception {
		List<Config> configs = loadConfigsFromRepository(); // contain all subtypes of Config
		for (Config conf : configs) {

			//Step<? extends Config> step = conf.type().getDeclaredConstructor().newInstance();
			//step.setConfig(conf); // compiler complains

			Step<? super Config> step = conf.type().getDeclaredConstructor().newInstance();
			step.setConfig(conf); // works fine now

			System.out.println(step);
			System.out.println(step.getConfig());
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
