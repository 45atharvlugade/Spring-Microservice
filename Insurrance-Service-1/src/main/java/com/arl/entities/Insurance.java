package com.arl.entities;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Insurance {

	private String id;
	private String name;
	private String from;
	private String to;
	private String pmv;
}
