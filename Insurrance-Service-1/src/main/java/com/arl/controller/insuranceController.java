package com.arl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arl.entities.Insurance;
import com.arl.service.IInsuranceService;

@RestController
@RequestMapping("/insurance")
public class insuranceController {

	@Autowired
	private IInsuranceService service;
	
	@PostMapping("/register")
	public String registerInsurance( @RequestBody   Insurance i) {
		return service.registerInsurance(i);
	}
	
	@GetMapping("/insurance")
	public Insurance getInsurance() {
		return service.getInsurance();
	}
}
