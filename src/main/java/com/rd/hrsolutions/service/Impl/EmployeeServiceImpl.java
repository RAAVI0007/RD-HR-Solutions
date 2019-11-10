package com.rd.hrsolutions.service.Impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rd.hrsolutions.dao.EmployeeDAO;
import com.rd.hrsolutions.models.Employee;
import com.rd.hrsolutions.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static Logger logger = Logger.getLogger(EmployeeServiceImpl.class);
	
	
	@Autowired
	private EmployeeDAO employeeDao;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		logger.info("Inside the Empployee Details ...");
		return employeeDao.findAll();
	}

}
