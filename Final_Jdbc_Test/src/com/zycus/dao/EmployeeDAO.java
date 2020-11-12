package com.zycus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zycus.bo.Employee;
import com.zycus.utils.DBConnect;
import com.zycus.utils.EmployeeCRUDOps;

public class EmployeeDAO {
	
	private List<Employee> listEmp = new ArrayList<Employee>();
	
	
	public List<Employee> getEmployees() {
		System.out.println("going 1");
		Connection connection = DBConnect.getConnection();
		System.out.println("going 1");
		try {
			if (connection != null) {
				PreparedStatement stmt = connection.prepareStatement(EmployeeCRUDOps.GET_ALL_EMPLOYEES);
				// get data from DB, construct a list
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					int empid = rs.getInt("empId");
					String ename = rs.getString("empName");
					String city = rs.getString("empCity");
					double salary = rs.getDouble("empSalary");
					Employee emp = new Employee(empid, ename, city, salary);
					listEmp.add(emp);
				}
			} else {
				System.out.println("Could Not Connect to DB");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listEmp;
	}
	
	
	
	

}
