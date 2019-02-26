class Employee {
	Employee() {
		System.out.println("Object created....");
	}
	void display() {
		System.out.println("display method");
	}
}
class ConstructorTest {
	public static void main(String args[]) {
	Employee emp1 = new Employee();
	emp1.display();
	}
}