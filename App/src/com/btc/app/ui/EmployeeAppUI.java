package com.btc.app.ui;



import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.btc.app.exception.InvalidAgeException;
import com.btc.app.exception.InvalidEmailException;
import com.btc.app.exception.InvalidEmpNameException;
import com.btc.app.exception.InvalidEmployeeId;
import com.btc.app.exception.NotFoundException;
import com.btc.app.model.Employee;
import com.btc.app.service.EmployeeService;
import com.btc.app.service.EmployeeServiceImpl;

public class EmployeeAppUI {
	
	private Scanner scanner=new Scanner(System.in);
	private static EmployeeService service=new EmployeeServiceImpl();
	
	
	public void addEmployee()  {
		Employee employee= new Employee();
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();;
		try {
			
			if(employeeId<1000)
			{
				throw new InvalidEmployeeId("Enter four digit EmployeeId : "+employeeId);
			}
			employee.setEmployeeId(employeeId);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		
			System.out.print("Employee Name : ");
			String employeeName=scanner.next()+scanner.nextLine();
			try {
				if(employeeName.length()<2)
				{
					throw new InvalidEmpNameException("Enter correct Employee Name :"+employeeName);
				}
				employee.setEmployeeName(employeeName);
			} catch (InputMismatchException e) {
				// TODO: handle exception
				e.getMessage();
				System.out.println("Enter the correct name : "+employeeName);
			}
			
			System.out.print("Email : ");
			String email=scanner.next()+scanner.nextLine();
			String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			
				if(email.matches(regex)) {
					System.out.println("Correct Email Address");
					employee.setEmail(email);
				}
				else {
					throw new InvalidEmailException("Enter Correct Email Address");
				}
			System.out.print("Birth Date [yyyy-mm-dd] : ");
			String dobString="";
			try {
				 dobString=scanner.next()+scanner.nextLine();
				 if("0000-00-00"==dobString || dobString.compareTo("2004-01-01")>0) {
					 throw new InvalidAgeException("Enter DOB of Employee Age 18+ "+dobString);
				 }
			} catch (Exception e) {
				// TODO: handle exception
				e.getMessage();
			}
			
			
			LocalDate dob=LocalDate.parse(dobString);
			employee.setDob(dob);
			//Employee employee= new Employee(employeeId, employeeName, dob, email);
			
			Employee savedEmployee = service.addEmployee(employee);
			System.out.println("Employee Added Successfully..");
			System.out.println(savedEmployee);

		
	}
	
	
	public void showEmployee() {
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=0;
		try {
			employeeId=scanner.nextInt();
			if(employeeId<1000)
			{
				throw new InvalidEmployeeId("Enter four digit EmployeeId : "+employeeId);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		
		Employee employee = service.searchEmployeeById(employeeId);
		if(employee==null)
		{
			throw new NotFoundException("Employee ID Not Found : "+employeeId);
		}
		
		System.out.println(employee);
		
	}
	
	public void deleteEmployeeId()
	{
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=0;
		try {
			employeeId=scanner.nextInt();
			if(employeeId<1000)
			{
				throw new InvalidEmployeeId("Enter four digit EmployeeId : "+employeeId);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		boolean value = service.deleteEmployeeById(employeeId);
		if(value)
		{
			System.out.println("Deleted Successfully");
		}
		else {
			throw new NotFoundException("Employee ID Not Found : "+employeeId);
		}
		
	}
	
	public void updateEmployee()
	{
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=0;
		try {
			employeeId=scanner.nextInt();
			if(employeeId<1000)
			{
				throw new InvalidEmployeeId("Enter four digit EmployeeId : "+employeeId);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		Employee employee = service.searchEmployeeById(employeeId);
		if(employee!=null) {
		System.out.println(employee);
		System.out.print("Employee Name : ");
		String employeeName=scanner.next()+scanner.nextLine();
		System.out.print("Email : ");
		String email=scanner.next()+scanner.nextLine();
		System.out.print("Birth Date [yyyy-mm-dd] : ");
		String dobString=scanner.next()+scanner.nextLine();
		LocalDate dob=LocalDate.parse(dobString);
		Employee employee1= new Employee(employeeId, employeeName, dob, email);
		 service.updateEmployee(employee1);
		 System.out.println("Update Successfully");
		}
		else {
			throw new NotFoundException("Employee ID Not Found : "+employeeId);
		}
	}
}


