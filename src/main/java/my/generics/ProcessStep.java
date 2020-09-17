package my.generics;

public class ProcessStep implements Step<ProcessConf> {

	private ProcessConf config;

	public void setConfig(ProcessConf config) {
		this.config = config;
	}

	@Override
	public ProcessConf getConfig() {
		return config;
	}
}