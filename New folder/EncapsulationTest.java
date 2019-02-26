class Employee {
	private String name;
	private float salary;
	void setValue(String name,float salary) {
		//this.salary = salary;
		if(salary<0) {
		this.salary = 8000;
		}else {
		this.salary = salary;
		}
		this.name = name;
	}
	void display() {
		System.out.println("display method");
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class EncapsulationTest {
	public static void main(String args[]) {
	Employee emp1 = new Employee();	
	//emp1.salary = -12000;
	//emp1.name="Ajay";
	emp1.setValue("Ajay",12000);	
	emp1.display();	
	}
}