package com.rd.hrsolutions.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rd.hrsolutions.models.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, String> {

	List<Employee> getAllEmployees();

}
