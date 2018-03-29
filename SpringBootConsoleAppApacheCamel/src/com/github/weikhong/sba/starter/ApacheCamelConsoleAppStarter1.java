package com.github.weikhong.sba.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.github.weikhong.sba.example.service.ApacheCamelWrapperService;
import com.github.weikhong.sba.example.service.AppInfoService;

@SpringBootApplication
@ImportResource("classpath:spring-context-xml/appcontext-root.xml")
public class ApacheCamelConsoleAppStarter1 implements CommandLineRunner {
	final static Logger LOGGER = LoggerFactory.getLogger(ApacheCamelConsoleAppStarter1.class);

	@Autowired
	private AppInfoService pppInfoService;

	@Autowired
	private ApacheCamelWrapperService apacheCamelWrapperService;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApacheCamelConsoleAppStarter1.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		pppInfoService.printAppInfoIfNecessary();
		apacheCamelWrapperService.executeCamelContext();
	}

}
