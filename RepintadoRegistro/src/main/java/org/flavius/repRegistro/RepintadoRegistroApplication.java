package org.flavius.repRegistro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class RepintadoRegistroApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RepintadoRegistroApplication.class, args);
	}

}
