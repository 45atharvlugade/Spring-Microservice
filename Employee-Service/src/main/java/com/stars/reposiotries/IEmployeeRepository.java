package com.stars.reposiotries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stars.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
