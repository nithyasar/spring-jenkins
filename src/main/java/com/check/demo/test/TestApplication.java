package com.check.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class TestApplication {
	
	public static Logger logger = LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args) {
		logger.info("TEST Application Started***********");
		logger.info("2nd log ---- TEST Application Started***********");
		SpringApplication.run(TestApplication.class, args);
	}

}
