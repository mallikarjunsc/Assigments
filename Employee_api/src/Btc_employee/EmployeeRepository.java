package Btc_employee;

import java.util.ArrayList;
import java.util.List;
public class EmployeeRepository {
	public static void main(String[] args) {
		Employee emp1=new Employee(1001,"Mahesh","Babu", "mahesh@gmail.com", "9789654534", "31/12/1998", "Manager", 65000, 0, 10);
		Employee emp2=new Employee(1005, "Rohit","Singh", "rohits@gmail.com", "7689254730", "03/07/1999", "Salesman", 50000, 0, 20);
		Employee emp3=new Employee(1002, "Arun","Tomar", "arjun@gmail.com", "9389654567", "15/02/2000", "Analyst", 55000, 0, 30);
		Employee emp4=new Employee(1003, "John","kenedy", "johnk@gmail.com", "8399354514", "22/10/2004", "HR", 35000, 0, 20);
		Department dept1= new Department(10, "Account", 1001);
		Department dept2= new Department(20, "Sales", 1005);
		Department dept3= new Department(30, "HR", 1003);
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		
		List<Department> deptList = new ArrayList<Department>();
		
		deptList.add(dept1);
		deptList.add(dept2);
		deptList.add(dept3);
		
		EmployeeService empService = new EmployeeService();
	
		empService.sumofSalary(employeeList);
	}
	
}
