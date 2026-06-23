package com.arl.service;

import org.springframework.stereotype.Service;

import com.arl.entities.Insurance;

@Service
public class InsuranceService implements IInsuranceService {

	private Insurance insurance;
	
	@Override
	public String registerInsurance(Insurance insurance) {
		this.insurance=insurance;
		return "insurance registered successfully";
	}

	@Override
	public Insurance getInsurance() {
		// TODO Auto-generated method stub
		return this.insurance;
	}

	
}
