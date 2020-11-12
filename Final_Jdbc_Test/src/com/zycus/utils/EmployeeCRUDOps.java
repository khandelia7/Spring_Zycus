package com.zycus.utils;

public class EmployeeCRUDOps {
	public static final String GET_ALL_EMPLOYEES = "SELECT * FROM employee";
	public static final String Get_One_Employee = "SELECT * FROM employee WHERE empId = ?";
	public static final String Save_Employee = "INSERT INTO employee (empId, empName, empCity, empSalary) VALUES (?,?,?,?)";
	public static final String Update_Employee = "UPDATE employee SET empName=?, empCity=?, empSalary=? WHERE EmpId = ?";
	public static final String Delete_Employee = "DELETE FROM employee WHERE EmpId = ?";
}
