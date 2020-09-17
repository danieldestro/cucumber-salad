package my.generics;

public interface Step<C extends Config> {
	void setConfig(C config);
}