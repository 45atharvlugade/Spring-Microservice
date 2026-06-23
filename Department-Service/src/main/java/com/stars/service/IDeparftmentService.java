package com.stars.service;

import com.stars.entity.Department;

public interface IDeparftmentService {

	public String registerDepartment(Department dep);
	
	public Department getDepById(Integer id);
}
