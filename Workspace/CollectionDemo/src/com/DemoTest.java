package com;

import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Operation op = new Operation();
		String key,value,con;
		int choice;
		do {
			System.out.println("1:Add \t 2 : Get Keys \t 3:Display All");
			System.out.println("Enter the choice");
			choice = obj.nextInt();
			switch (choice) {
			case 1:		System.out.println("Plz enter the key");
			              key = obj.next();
			              System.out.println("Plz enter the value");
			              value = obj.next();
			              op.addInfo(key, value);
					break;
			case 2:System.out.println("Plz enter the key");
						key = obj.next();
						System.out.println("Value is "+op.getInfoValue(key));
				break;
			case 3:	op.displayInfo();
				break;
			default:
							System.out.println("Wrong choice");
				break;
			}
			System.out.println("You want con continue?");
			con = obj.next();
		} while (con.equalsIgnoreCase("y"));
		
		System.out.println("thank you!");
	}

}
