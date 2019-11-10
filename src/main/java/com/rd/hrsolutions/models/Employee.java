package com.rd.hrsolutions.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Employee {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id ;
	private String name;
	private String role ;
	
	
	
	
	
}
