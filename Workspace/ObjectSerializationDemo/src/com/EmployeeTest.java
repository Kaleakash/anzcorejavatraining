package com;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis =new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee)ois.readObject();
		System.out.println(emp2);
		ois.close();
		fis.close();
		System.out.println("Object De-Serialization done successfully....");
		
		FileOutputStream fos = new FileOutputStream("emp2.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(emp2.getId());
		
		
		/*Employee emp1 = new Employee(1, "Raj", 12000);
		System.out.println(emp1);
		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		oos.close();
		fos.close();
		System.out.println("Object Serialization done successfully....");*/
		
		//emp1.display();
		/*System.out.println("Id is "+emp1.getId());
		System.out.println("Name is "+emp1.getName());
		System.out.println("Salary is "+emp1.getSalary());*/
	}

}
