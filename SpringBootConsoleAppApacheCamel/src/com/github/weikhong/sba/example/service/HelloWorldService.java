package com.github.weikhong.sba.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldService.class);

	@Value("${PROP.APPNAME}")
	private String APPNAME;
	
	public void sayHello() {
		LOGGER.info("Hello message from HelloWorldService.");
	}

	public void printPropertiesPlaceholder() {
		LOGGER.info(APPNAME);
	}
}
