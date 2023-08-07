package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class SaveEmployeeController {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeService();
		Employee  employee=new Employee();
		employee.setId(100);
		employee.setName("malli");
		employee.setSal(75768.0);
		Employee employee2=  employeeService.saveEmployee(employee);
		if(employee2!=null) {
			System.out.println("data saved");
		}
		else{
			System.out.println("please check the data");
		}
		
		
	

	}

}
