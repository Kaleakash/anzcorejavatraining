package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthStyle;

public class EmployeeService {

				List<Employee> listOfRec = new ArrayList<Employee>();
	
				public void addEmployee(Employee emp) {
					listOfRec.add(emp);
				}
				public void removeEmployee(int id) {
								Iterator<Employee>	ii	= listOfRec.iterator();
								while(ii.hasNext()) {
									Employee e = ii.next();
										System.out.println(e);
												if(e.getId()==id) {
													ii.remove();
												//	e.setSalary(e.getSalary()+2000);
												}
								}
				}
				public void employeeSize() {
					System.out.println("Number of records are "+listOfRec.size());
				}
}
