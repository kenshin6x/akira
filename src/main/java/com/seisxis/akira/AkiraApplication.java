package com.seisxis.akira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AkiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkiraApplication.class, args);
	}

}
