package com.jsp.controller;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class UpdateEmployeeController {

	public static void main(String[] args) {
		Employee employee=new Employee();
		EmployeeService employeeService=new EmployeeService();
		employee.setId(1);
		employee.setName("rakesh");
		employee.setSal(75000.0);
		Employee employee2= employeeService.updateEmployee(employee);
		if(employee2!=null) {
			System.out.println("DATA UPDATED");
		}
		else {
			System.out.println("please check the data");
		}
		

	}

}
