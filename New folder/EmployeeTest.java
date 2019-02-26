class Employee {
	int id;
	String name;
	double salary;
	void calSalary() {
		double hra,da,pf;
		hra = 0.10*salary;
		da =0.05*salary;
		pf = 0.07*salary;
		salary = salary +hra +da - pf;		
	}
	void display() {
		System.out.println("Employee id is "+id);
		System.out.println("Employee name is "+name);
		System.out.println("Employee salary is "+salary);
	}
}
class EmployeeTest {
	public static void main(String args[]){
	Employee emp1 = new Employee();
		emp1.display();
		emp1.id=100;
		emp1.name ="Raj";
		emp1.salary = 12000;
		emp1.calSalary();
		emp1.display();
	}
}