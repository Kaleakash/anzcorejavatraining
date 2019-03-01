package com;

public class DemoTest {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		es.employeeSize();
		Employee emp1 = new Employee(1, "Raj", 12000);
		es.addEmployee(emp1);
		
		Employee emp2 = new Employee(2, "Ajay", 14000);
		es.addEmployee(emp2);
		
		Employee emp3 = new Employee(3, "Mahesh", 18000);
		es.addEmployee(emp3);
		es.employeeSize();
		
		es.removeEmployee(5);
		
		es.employeeSize();
	}

}
