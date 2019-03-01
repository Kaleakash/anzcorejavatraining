package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ClientDriver
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			System.out.println("Loaded");
			Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb");
			System.out.println("Connected establish");
			/*PreparedStatement psmt = con.prepareStatement("select * from employee");
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2));
			}*/
			PreparedStatement pstmt = con.prepareStatement("insert into employee(id,name,salary) values(?,?,?)");
			pstmt.setInt(1,6);
			pstmt.setString(2, "Rajesh");
			pstmt.setDouble(3,18000);
			int res = pstmt.executeUpdate();
			if(res>0) {
				System.out.println("record inserted ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
