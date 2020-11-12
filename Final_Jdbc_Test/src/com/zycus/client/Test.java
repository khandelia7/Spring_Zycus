package com.zycus.client;

import java.util.List;
import java.util.Scanner;

import com.zycus.bo.Employee;
import com.zycus.dao.EmployeeDAO;
import com.zycus.service.EmployeeService;

public class Test {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService(new EmployeeDAO());
		

		System.out.println("Welcome to Employee Enterprise Project...");
		Scanner s = new Scanner(System.in);
		String status;
		
		do {
			System.out.println("\n1.Get All Employee: \n2.Get One Employee: \n3.Save (Insert) Emplooye: "
					+ "\n4.Update Employee: \n5.Delete Employee: \nEnter your Choice:");
			int choice = s.nextInt();
			
			switch (choice) {
			case 1:
				List<Employee> listEmp = employeeService.getEmployees();
				System.out.println("\nAll Employee are:");
				for (Employee list : listEmp) {
					System.out.println(list);
				}
				break;
			}
			
			System.out.println("Do you want to continue (y/n): ");
			status = s.next();
		} while (status.equals("y"));
	}

}
