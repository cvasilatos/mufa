package gr.home.mufa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MufaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MufaApplication.class, args);
	}

}
