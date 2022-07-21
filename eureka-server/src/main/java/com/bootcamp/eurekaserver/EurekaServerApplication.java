package com.bootcamp.eurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

import java.util.logging.Logger;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication implements CommandLineRunner {

	private static final Logger logger = Logger.getLogger(EurekaServerApplication.class.toString());

	@Autowired
	private Environment env;

	@Override
	public void run(String... args) throws Exception {

		logger.info("Java version: " + env.getProperty("java.version"));
		logger.info("Application name: " + env.getProperty("spring.application.name"));
		logger.info("Properties file upload status: " + env.getProperty("my-own-app.properties.status"));
		logger.info("Eureka Server on : http://" + env.getProperty("eureka.instance.hostname") + ":" + env.getProperty("server.port") );

	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
