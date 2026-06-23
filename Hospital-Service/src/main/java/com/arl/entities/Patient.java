package com.arl.entities;

import org.springframework.stereotype.Component;

import com.arl.dto.InsuranceDTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
@NoArgsConstructor

public class Patient {

	@NonNull
	private Integer pid;
	@NonNull
	private String pname;
	@NonNull
	private String address;
	@NonNull
	private String diseaseName;
	
	private InsuranceDTO insurance;
}
