package bw.ub.stripehiv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(
		exclude = SecurityAutoConfiguration.class, 
		scanBasePackages = {"bw.ub.stripehiv"}
)
public class StripehivWSApplication {

	public static void main(String[] args) {
		SpringApplication.run(StripehivWSApplication.class, args);
	}

}
