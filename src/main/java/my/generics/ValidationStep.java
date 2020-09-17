package my.generics;

public class ValidationStep implements Step<ValidationConf> {

	private ValidationConf config;

	public void setConfig(ValidationConf config) {
		this.config = config;
	}

	@Override
	public ValidationConf getConfig() {
		return config;
	}
}