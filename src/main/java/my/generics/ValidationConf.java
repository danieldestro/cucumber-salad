package my.generics;

public class ValidationConf implements Config {
	
	public Class<? extends Step> type() {
		return ValidationStep.class;
	}
}