package com.example.my_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Insert {
	private static String url="jdbc:postgresql://localhost:5432/my-project";
	private static String user="postgres";
	private static String password="root";
public static void main(String[]args) {
	try {
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection(url, user, password);
		String sql="INSERT INTO student VALUES(102,'Ram',20,'chandu@gmail.com')";
		//step 3
		Statement stm=con.createStatement();
		//step 4
		stm.execute(sql);
		System.out.println("data is saved");
		//step 5
		con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
