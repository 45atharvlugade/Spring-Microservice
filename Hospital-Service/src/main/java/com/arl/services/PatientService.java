package com.arl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.arl.dto.InsuranceDTO;
import com.arl.entities.Patient;

@Service
public class PatientService implements IPatientService {

	  private Patient p; 
	
	    @Autowired
	    private RestTemplate restTemplate;
	
	@Override
	public String registerPatient(Patient p) {
		this.p=p; 
		String msg=p.toString()+" details are registered in The Hospital";
		return msg;
	}

	@Override
	public Patient getPatient() {
		return this.p;
	}

	@Override
	public Patient getPatientWithInsurance() {
		InsuranceDTO insurance=restTemplate
				.getForObject("http://localhost:7071/insurance/insurance", InsuranceDTO.class);

		p.setInsurance(insurance);
		
		return p;
		

	}

	
}

/**
 * 
 if i want to send the Body from the hospital servvice
 * @Service
public class PatientService {

    @Autowired
    private RestTemplate restTemplate;

    public InsuranceDTO getInsuranceFromBody(String id) {

        InsuranceRequest request = new InsuranceRequest();
        request.setId(id);

        InsuranceDTO response = restTemplate.postForObject(
                "http://localhost:7071/insurance/get",
                request,
                InsuranceDTO.class
        );

        return response;
    }
}*/


/**
 * 
 * sending the dynamic url value PathVariable
 * 
 * @Service
public class PatientService {

    @Autowired
    private RestTemplate restTemplate;

    public InsuranceDTO getInsuranceFromService(String id) {

        InsuranceDTO dto = restTemplate.getForObject(
                "http://localhost:7071/insurance/" + id,
                InsuranceDTO.class
        );
        return dto;
    }
}
 */
