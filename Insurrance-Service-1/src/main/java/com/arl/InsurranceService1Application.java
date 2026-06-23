package com.arl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InsurranceService1Application {

	public static void main(String[] args) {
		SpringApplication.run(InsurranceService1Application.class, args);
	}

}
