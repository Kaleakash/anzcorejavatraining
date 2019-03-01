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
		// Retrieve Query 
		/*
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary "+rs.getFloat(3));	
			}
			rs.close();
			pstmt.close();*/
			//DML Opeation 
			//Insert query 
			/*PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, 11);
			pstmt.setString(2, "Balaji");
			pstmt.setFloat(3, 24000);
			int res = pstmt.executeUpdate();
			if(res>0) {
				System.out.println("Record inserted successfully....");
			}*/
			//Delete Query 
			
			PreparedStatement pstmt = con.prepareStatement("delete from employee where id=?");
			pstmt.setInt(1, 2);
			int res = pstmt.executeUpdate();
			if(res>0) {
				System.out.println("Record deleted successfully....");
			}else {
				System.out.println("Record not present");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception	
			System.out.println(e.toString());
		}
	}

}
