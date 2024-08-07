package com.example.jdbc_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display {
	private static String url="jdbc:postgresql://localhost:5432/my-project";
	private static String user="postgres";
	private static String password="root";
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM student";
			Statement stm=con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1); // or use rs.getInt(1) if 'id' is the first column
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String gmail = rs.getString(4);
                
                System.out.println("ID: "+ id + " "+ "name: "+name+" "+"age: "+age+" "+"gmail: "+gmail);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
