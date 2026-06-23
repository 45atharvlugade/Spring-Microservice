package com.arl.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class PatientDTO {

	@NonNull
	private Integer pid;
	@NonNull
	private String pname;
	@NonNull
	private String address;
	@NonNull
	private String diseaseName;
	
	

}
