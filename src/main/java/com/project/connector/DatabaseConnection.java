package com.project.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static Connection con;
	public static Connection connector() {
		try {
			if (con==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//creating connection
//				String url = "jdbc:mysql://localhost:3306/MyBlog";
//				String username = "root";
//				String password = "Bijay@123";
//				
//				con = DriverManager.getConnection(url,username, password);
				  con = DriverManager.
	                      getConnection("jdbc:mysql://localhost:3306/myblog", "root", "Bijay@123");
				System.out.println("connection is established");
			}

		
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return con;
		
		
		
	}

}
