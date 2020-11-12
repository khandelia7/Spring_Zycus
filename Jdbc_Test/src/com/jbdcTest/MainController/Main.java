package com.jbdcTest.MainController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.jbdcTest.employeeService.EmployeeService;
import com.jbdcTest.model.Employee;

public class Main {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root",
				"akash7666003477")) {
			EmployeeService employeeService = new EmployeeService();

			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Welcome to Employee Enterprise Project...");
			Scanner s = new Scanner(System.in);
			String status;

			do {

				System.out.println("\n1.Get All Employee: \n2.Get One Employee: \n3.Save (Insert) Emplooye: "
						+ "\n4.Update Employee: \n5.Delete Employee: \nEnter your Choice:");
				int choice = s.nextInt();

				switch (choice) {
				case 1:
					List<Employee> listEmp = employeeService.getAllEmployees(con);
					System.out.println("\nAll Employee are:");
					for (Employee list : listEmp) {
						System.out.println(list);
					}
					break;

				case 2:
					System.out.println("\nEnter the EmployeeId:");
					int empid = s.nextInt();
					Employee emp = employeeService.getEmployee(empid, con);
					System.out.println("Detail of " + empid + " is: " + emp);
					break;

				case 3:
					System.out.println("\nEnter the String of Employee: ");
					String empString = s.next();
					Employee emp1 = employeeService.createEmployee(empString);
					Employee emp2 = employeeService.saveEmployee(emp1, con);
					System.out.println("Employee ID " + emp1.getEmpId() + " is inserted: " + emp2);
					break;

				case 4:
					System.out.println("\nEnter the String of Employee to be updated: ");
					String empUpdateString = s.next();
					Employee empupdate = employeeService.createEmployee(empUpdateString);
					Employee empupdate2 = employeeService.updateEmployee(empupdate, con);
					if (empupdate2 != null) {
						System.out.println("Employee ID " + empupdate2.getEmpId() + " is updated: " + empupdate2);
					} else {
						System.out.println("Employee ID " + empupdate.getEmpId() + " does not exist.");
					}
					break;

				case 5:
					System.out.println("\nEnter the String of Employee to be Deleted: ");
					int id = s.nextInt();
					System.out.println("Are you sure you want to delete it?");
					System.out.println(employeeService.deleteEmployee(id, con));
					break;
				}
				System.out.println("Do you want to continue (y/n): ");
				status = s.next();
			} while (status.equals("y"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
}
