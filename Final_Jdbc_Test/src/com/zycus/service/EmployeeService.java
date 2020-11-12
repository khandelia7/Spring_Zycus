package com.zycus.service;

import java.util.List;

import com.zycus.bo.Employee;
import com.zycus.dao.EmployeeDAO;

public class EmployeeService {

	private EmployeeDAO employeeDAO;
	
	public EmployeeService(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	public List<Employee> getEmployees(){
		//get all employees using employeeDao
		List<Employee> list =  employeeDAO.getEmployees();
		//may perform some manipulation
		return list;
	}
	
	public Employee getEmployee(int id) {
		//get  employee using employeeDao
		//may perform some manipulation	
		return null;
	}
}
