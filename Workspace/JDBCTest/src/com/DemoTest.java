package com;
import java.sql.*;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			
			System.out.println("Driver Loaded successfully....");
			
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb");
		System.out.println("Connection established successfully....");
		
		PreparedStatement pstmt = con.prepareStatement("select * from employee");
				// Retrieve Query 
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
				System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary "+rs.getFloat(3));	
				}
				rs.close();
				pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
