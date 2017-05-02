package tenable.interview.ApplicationStartup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@Import(AppConfig.class)
@SpringBootApplication(scanBasePackages={"tenable.interview.ApplicationStartup", "tenable.interview.Hosts"})
public class GethostsApplication {

	public static void main(String[] args) {

		SpringApplication.run(GethostsApplication.class, args);
	}
}
