package com.stars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stars.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
