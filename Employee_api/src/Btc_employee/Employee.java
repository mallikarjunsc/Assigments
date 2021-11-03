package Btc_employee;

public class Employee {

int employeeId;
String firstName;
String lastName;
String email;
String phoneNumber;
String hireDate;
String designation;
double salary;
int managerId;
int departmentId;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getHireDate() {
	return hireDate;
}
public void setHireDate(String hireDate) {
	this.hireDate = hireDate;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getManagerId() {
	return managerId;
}
public void setManagerId(int managerId) {
	this.managerId = managerId;
}
public int getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}
public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber, String hireDate,
		String designation, double salary, int managerId, int departmentId) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.hireDate = hireDate;
	this.designation = designation;
	this.salary = salary;
	this.managerId = managerId;
	this.departmentId = departmentId;
}

}