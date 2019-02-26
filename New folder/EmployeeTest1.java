class Employee {
	int id;
	String name;
	double salary;
	void setValue() {			//fixed value for all employee 
		id=100;
		name="Raj";
		salary =12000;
	}
	/*void setEmpInfo(int id1,String name1, float salary1) {
		id=id1;
		name=name1;
		salary = salary1;
	}*/
	void setEmpInfo(int id,String name, float salary) {	// passing emp info from main class 
		this.id =id;
		this.name = name;
		this.salary = salary;
	}
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
class EmployeeTest1 {
	public static void main(String args[]){
	Employee emp1 = new Employee();
	emp1.setValue();	emp1.calSalary();	emp1.display();
	Employee emp2 = new Employee();
	emp2.setValue();	emp2.calSalary();	emp2.display();
	Employee emp3 = new Employee();
		emp3.setEmpInfo(101,"Seeta",14000);
		emp3.calSalary();
		emp3.display();
	Employee emp4 = new Employee();
		emp4.setEmpInfo(102,"Veeta",8000);
		//emp4.calSalary();
		emp4.display();
	}
}


