package com.github.weikhong.sba.example.service;

import org.apache.camel.CamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApacheCamelWrapperService {
	final static Logger LOGGER = LoggerFactory.getLogger(ApacheCamelWrapperService.class);

	@Value("${PROPVAR.CAMEL_CONTEXT.THREAD_WAIT_MILIS}")
	private int threadWaitMilis;

	@Autowired
	private CamelContext camelContext;

	public void executeCamelContext() {
		try {
			LOGGER.info("===========================================");
			LOGGER.info("****** Camel Context Started ({}sec) ******", (threadWaitMilis/1000));
			camelContext.start();
			Thread.sleep(threadWaitMilis);
		} catch (Exception e) {
			LOGGER.error("Camel Context Failed To Start,", e);
		}
		finally {
			try {	camelContext.stop(); }
			catch (Exception e) {
				LOGGER.error("****** Camel Context Failed To Stop! ******");
				LOGGER.error("===========================================");
				return;
			}
			
			LOGGER.info("*** Camel Context Completed & Stopped. ***");
			LOGGER.info("===========================================");
		}
	}
}
