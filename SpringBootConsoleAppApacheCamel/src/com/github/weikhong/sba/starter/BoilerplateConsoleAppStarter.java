package com.github.weikhong.sba.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.github.weikhong.sba.example.service.HelloWorldService;

@SpringBootApplication
@ImportResource("classpath:spring-context-xml/appcontext-root.xml")
public class BoilerplateConsoleAppStarter implements CommandLineRunner {

	static final Logger LOGGER = LoggerFactory.getLogger(BoilerplateConsoleAppStarter.class);

	@Autowired
	private HelloWorldService helloWorldService;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BoilerplateConsoleAppStarter.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		helloWorldService.sayHello();
		helloWorldService.printPropertiesPlaceholder();
	}

}
