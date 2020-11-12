package com.jbdcTest.employeeService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jbdcTest.model.Employee;

public class EmployeeService {

	private List<Employee> listEmp = new ArrayList<>();

	public List<Employee> getAllEmployees(Connection con) throws SQLException {
		String sql = "SELECT * FROM employee";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int empid = rs.getInt("empId");
			String ename = rs.getString("empName");
			String city = rs.getString("empCity");
			double salary = rs.getDouble("empSalary");
			Employee emp = new Employee(empid, ename, city, salary);
			listEmp.add(emp);
		}
		return listEmp;
	}

	public Employee getEmployee(int id, Connection con) throws SQLException {
		String sql = "SELECT * FROM employee WHERE empId = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		rs.next();
		int empid = rs.getInt("empId");
		String ename = rs.getString("empName");
		String city = rs.getString("empCity");
		double salary = rs.getDouble("empSalary");
		Employee emp = new Employee(empid, ename, city, salary);
		return emp;
	}

	public Employee saveEmployee(Employee emp, Connection con) throws SQLException {
		String sql = "INSERT INTO employee (empId, empName, empCity, empSalary) VALUES (?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, emp.getEmpId());
		stmt.setString(2, emp.getEmpName());
		stmt.setString(3, emp.getEmpCity());
		stmt.setDouble(4, emp.getEmpSalary());
		int result = stmt.executeUpdate();
		if (result > 0)
			System.out.println("Inserted...");
		return emp;
	}

	public Employee updateEmployee(Employee emp, Connection con) throws SQLException {
		// find the emp
		EmployeeService employeeService = new EmployeeService();
		List<Employee> listEmp = employeeService.getAllEmployees(con);
		boolean status = employeeService.findEmployee(emp.getEmpId(), listEmp);
		// update
		if (status) {
			String sql = "UPDATE employee SET empName=?, empCity=?, empSalary=? WHERE EmpId = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, emp.getEmpName());
			stmt.setString(2, emp.getEmpCity());
			stmt.setDouble(3, emp.getEmpSalary());
			stmt.setInt(4, emp.getEmpId());
			int result = stmt.executeUpdate();
			// return updated emp
			return emp;
		} else {
			// return updated emp
			return null;
		}
	}

	public String deleteEmployee(int id, Connection con) throws SQLException {
		// find emp
		EmployeeService employeeService = new EmployeeService();
		List<Employee> listEmp = employeeService.getAllEmployees(con);
		boolean status = employeeService.findEmployee(id, listEmp);
		// delete
		if (status) {
			String sql = "DELETE FROM employee WHERE EmpId = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			int result = stmt.executeUpdate();
			// return updated emp
			return "Employee " + id + " deleted Successfully..."; // return deleted emp
		} else {
			// return updated emp
			return "Employee ID " + id + " does not exist.";
		}
	}

	public Employee createEmployee(String line) {
		String[] parts = line.split(",");
		Employee e = new Employee(Integer.parseInt(parts[0]), parts[1], parts[2], Double.parseDouble(parts[3]));
		return e;
	}

	public boolean findEmployee(int id, List<Employee> listEmp) {
		Boolean status = false;
		for (Employee list : listEmp) {
			if (Integer.compare(list.getEmpId(), id) == 0) {
				status = true;
				break;
			}
		}
		return status;
	}

}
