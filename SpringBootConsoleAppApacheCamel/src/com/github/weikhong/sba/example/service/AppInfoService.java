package com.github.weikhong.sba.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppInfoService {

	final static Logger LOGGER = LoggerFactory.getLogger(AppInfoService.class);

	@Value("${PROP.APPNAME}") private String APPNAME;
	@Value("${PROP.ENVNAME}") private String ENVNAME;
	@Value("${PROP.APPINFO.PRINT}") private boolean APPINFO_PRINT;
	@Value("${PROP.APPINFO.VERSION}")	private String APPINFO_VERSION;
	
	public void printAppInfoIfNecessary() {
		if(APPINFO_PRINT) {
			LOGGER.info("Application Name: {}", APPNAME);
			LOGGER.info("Environment Name: {}", ENVNAME);
			LOGGER.info("Application Version: {}", APPINFO_VERSION);
		}
	}
}
