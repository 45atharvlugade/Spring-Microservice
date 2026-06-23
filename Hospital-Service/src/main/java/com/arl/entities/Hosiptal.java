package com.arl.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hosiptal {

	private Integer hid;
	private String hname;
	private String address;
	private Long pincode;
	private List<String> doctors=new ArrayList<String>(List.of("Ishant","Raghav", "Mohini"));
}
