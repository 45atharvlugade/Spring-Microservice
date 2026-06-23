package com.stars.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Department {

	@Id
	@SequenceGenerator( name = "dep1_seq",
	        sequenceName = "dep1_seq",
	        allocationSize = 1)
	@GeneratedValue(generator = "dep1",strategy = GenerationType.SEQUENCE)
	private Integer depId;
	private String  depName;
	private Integer departmentSize;
	private String depHead;
}
