package com.vipul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJavaxInjectExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(SpringJavaxInjectExamplesApplication.class, args);
		ExampleService exampleService = applicationContext.getBean(ExampleService.class);
		exampleService.printServiceNames();
	}
}
