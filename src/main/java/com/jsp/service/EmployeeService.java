package com.jsp.service;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {
	
	EmployeeDao dao=new EmployeeDao();
	
	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}
	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}
	public Employee deleteEmployee(Employee employee) {
		return dao.deleteEmployee(employee);
	}

	

}
