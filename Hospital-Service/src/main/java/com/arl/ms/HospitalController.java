package com.arl.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arl.entities.Patient;
import com.arl.services.IPatientService;

import jakarta.annotation.PostConstruct;



@RestController
@RequestMapping("hospital")
public class HospitalController {

	@Autowired
	private IPatientService service;
	
	@PostMapping("/register")
	public ResponseEntity<?> registerP(@RequestBody Patient p){
		return new ResponseEntity<String>(service.registerPatient(p),HttpStatus.OK);
	}
	
	@GetMapping("/patient")
	public ResponseEntity<Patient> getPatient(){
		return new ResponseEntity<Patient>(service.getPatient(),HttpStatus.OK);
	}
	
	@PostMapping("/register/insurance")
	public ResponseEntity<Patient> registerPatientWithInsurance(){
		return new ResponseEntity<Patient>(service.getPatientWithInsurance(),HttpStatus.OK);
	}
	
}
