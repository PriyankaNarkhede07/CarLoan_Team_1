package com.cjc.eureka_server_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerDemoApplication {

	public static void main(String[] args) {
		System.out.println("eureka server");
		SpringApplication.run(EurekaServerDemoApplication.class, args);
	}

}
