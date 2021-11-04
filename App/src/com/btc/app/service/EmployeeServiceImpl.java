package com.btc.app.service;


	import java.util.List;

	import com.btc.app.dao.EmployeeDao;
	import com.btc.app.dao.EmployeeDaoImpl;
	import com.btc.app.model.Employee;

	public class EmployeeServiceImpl implements EmployeeService {
		
		private static final Employee Employee = null;
		private EmployeeDao daoObj;
		
		public EmployeeServiceImpl() {
			daoObj = new EmployeeDaoImpl();
		}

		@Override
		public Employee addEmployee(Employee employee) {
			try {
				return daoObj.addEmployee(employee);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return employee;
		}

		@Override
		public Employee searchEmployeeById(int employeeId) {
			try {
				return daoObj.searchEmployeeById(employeeId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Employee;
		}

		@Override
		public boolean deleteEmployeeById(int employeeId) {
			
			try {
				return daoObj.deleteEmployeeById(employeeId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}

		@Override
		public Employee updateEmployee(Employee employee) {
			
			try {
				return daoObj.updateEmployee(employee);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return employee;
		}

		@Override
		public List<Employee> getAllEmployee() {
			 try {
				return daoObj.getAllEmployee();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return getAllEmployee();
		}

		
		
		
}
