package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class DeleteEmployeeController {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(1);;
		EmployeeService employeeService=new EmployeeService();
		Employee employee2= employeeService.deleteEmployee(employee);
		if(employee2!=null) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("please check the data");
		}

	}

}
