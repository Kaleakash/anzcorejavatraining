package com;

import java.io.IOException;
import java.util.Random;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s1 = "Raj Deep Kumar";
String s2 = new String("Raj Deep");
System.out.println(s1);
System.out.println(s2);
System.out.println(s2.length());
System.out.println(s1.toLowerCase());
System.out.println(s2.toUpperCase());*/
		/*String s1 = "Raj";
		String s2 = "Raj";
		String s3 = new String("Raj");
		String s4 = new String("raj");
		if(s3.equalsIgnoreCase(s4)){
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}*/
		/*String str = "Raj";
		System.out.println(str);
		str = str +" Deep";
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str);
		
		StringBuffer sb =new StringBuffer("Raj");
		System.out.println(sb);
		sb.append(" Deep Kumar");
		System.out.println(sb);*/
		/*System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.sqrt(9));
		*/
	/*	Random rr =new Random();
						int val = (int)rr.nextInt(10);
						System.out.println(val);*/
						
						Runtime rr = Runtime.getRuntime();
						try {
								Process pr =  rr.exec("mspaint");
								Thread.sleep(5000);
								pr.destroy();
						} catch (IOException e) {
							System.out.println(e.toString());
						} catch (InterruptedException e) {
							System.out.println(e.toString());
						}
	}

}
