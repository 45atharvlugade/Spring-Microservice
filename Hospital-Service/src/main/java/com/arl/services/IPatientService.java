package com.arl.services;


import com.arl.entities.Patient;

public interface IPatientService {

	public String registerPatient(Patient p);
	public Patient getPatient() ;
	public Patient getPatientWithInsurance();
}
