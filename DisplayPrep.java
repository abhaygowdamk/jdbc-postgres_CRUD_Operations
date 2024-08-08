package com.example.jdbc_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayPrep {
	private static String url="jdbc:postgresql://localhost:5432/my-project";
	private static String user="postgres";
	private static String password="root";
	
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			String sql = "SELECT * FROM student WHERE id=?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, 104);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				System.out.println("Name "+rs.getString("name"));
				System.out.println("age "+rs.getInt("age"));
				System.out.println("email "+rs.getString("gmail"));
			}
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

	private static String getInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
