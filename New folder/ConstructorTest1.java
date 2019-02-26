class Employee {
	int id;
	String name;
	Employee() {
		System.out.println("Object created....");
		id=123;
		name="Unknown";
	}
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void setValue(int id, String name) {
		this.id =id;
		this.name = name;
	}
	void display() {
		System.out.println("display method");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
	}
}
class ConstructorTest1 {
	public static void main(String args[]) {
	Employee emp1 = new Employee();	
	emp1.setValue(100,"Raj");
	emp1.display();
	Employee emp2 = new Employee();	
		//emp1.setValue(100,"Raj");
	emp2.display();
	Employee emp3 = new Employee(101,"Ajay");
	emp3.display();
	}
}