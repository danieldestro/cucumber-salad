package my.generics;

public class ProcessConf implements Config {

	public Class<? extends Step> type() {
		return ProcessStep.class;
	}
}