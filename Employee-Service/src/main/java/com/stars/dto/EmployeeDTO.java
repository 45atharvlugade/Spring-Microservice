package com.stars.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

	private Integer employeeId;
	
	private String employeeName;
	
	private String designation;
	
	private Double salary;
	
	private DepartmentDTO dto;
}
