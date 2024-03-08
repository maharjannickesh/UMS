package com.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "com.usermanagement.user")
@SpringBootApplication
@ComponentScan(basePackages = "com")
public class UmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(UmsApplication.class, args);
	}

}
