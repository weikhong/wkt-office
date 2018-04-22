package com.github.weikhong.sba.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/*
 * Required (minimal): springboot, springboot-web, tomcat-embedded-X.X
 * 
 * https://www.mkyong.com/spring-boot/spring-boot-hello-world-example-jsp/
 * https://stackoverflow.com/questions/29782915/spring-boot-jsp-404
 */
@SpringBootApplication
@ImportResource("classpath:spring-context-xml/appcontext-root.xml")
public class BoilerplateWebAppStarter extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BoilerplateWebAppStarter.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BoilerplateWebAppStarter.class, args);
	}

}
