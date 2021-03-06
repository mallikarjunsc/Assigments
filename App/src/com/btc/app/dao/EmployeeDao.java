package com.btc.app.dao;


	import java.util.List;

	import com.btc.app.model.Employee;

	public interface EmployeeDao {
	    public Employee addEmployee(Employee employee) throws Exception;
		
		public Employee searchEmployeeById(int employeeId)throws Exception;
		
		public boolean deleteEmployeeById(int employeeId)throws Exception;
		
		public Employee updateEmployee(Employee employee)throws Exception;
		
		public List<Employee> getAllEmployee()throws Exception;
	}

