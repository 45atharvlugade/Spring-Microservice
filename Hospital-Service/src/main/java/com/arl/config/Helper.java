package com.arl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Helper {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
