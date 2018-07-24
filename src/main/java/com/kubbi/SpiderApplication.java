package com.kubbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
public class SpiderApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpiderApplication.class, args);
	}

}
