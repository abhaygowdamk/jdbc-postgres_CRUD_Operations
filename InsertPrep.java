package com.example.jdbc_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPrep {
	private static String url="jdbc:postgresql://localhost:5432/my-project";
	private static String user="postgres";
	private static String password="root";
	
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			String sql = "INSERT INTO student(id,name,age,gmail) VALUES(?,?,?,?)";
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1, 107);
			pstm.setString(2,"mani");
			pstm.setInt(3,23);
			pstm.setString(4,"mani@gmail.com");
			pstm.execute();
			con.close();
			pstm.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
