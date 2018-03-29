package com.github.weikhong.sba.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/*
 * Required (minimal): springboot, springboot-web, tomcat-embedded-X.X
 */
@SpringBootApplication
@ImportResource("classpath:spring-context-xml/appcontext-root.xml")
public class BoilerplateWebAppStarter {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BoilerplateWebAppStarter.class, args);
	}

}
