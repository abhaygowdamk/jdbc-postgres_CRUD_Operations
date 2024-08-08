package com.example.jdbc_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrep {
	private static String url="jdbc:postgresql://localhost:5432/my-project";
	private static String user="postgres";
	private static String password="root";
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			String sql = "UPDATE student SET name=? WHERE id=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1,"Abhay");
			pstm.setInt(2,102);
			pstm.setString(1,"Abhay");
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
