package com.demo.eureka_service_registery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegisteryApplication.class, args);
	}

}
