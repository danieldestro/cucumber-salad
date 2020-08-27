package cucumber.salad;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class App extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logProfilesAndBeans(ctx);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}

	public static void logProfilesAndBeans(ApplicationContext ctx) {
		String profileNames = Arrays.toString(ctx.getEnvironment().getActiveProfiles());
		log.debug("Starting application with profile: {}", profileNames);
		
		if (log.isDebugEnabled()) {
			log.debug("Let's spill the beans:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				log.debug(beanName);
			}

			log.debug("Beans have been spilled");
		}
	}

    @PostConstruct
    public void onStartup() {
		log.info("Cheetara is starting");
    }
	
    @PreDestroy
    public void onDestroy() throws Exception {
    	log.info("Cheetara is shutting down");
    }
}
