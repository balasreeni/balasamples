package com.app.gen1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = { "com.app.gen1.*", "com.ibm.dip.framework.*" })
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
	}

}
