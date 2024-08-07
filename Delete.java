package com.example.jdbc_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	private static String url="jdbc:postgresql://localhost:5432/my-project";
	private static String user="postgres";
	private static String password="root";
	
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			String sql = "DELETE FROM student WHERE id=101";
			Statement stm=con.createStatement();
			stm.executeUpdate(sql);
			System.out.println("Successfully Deleted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
