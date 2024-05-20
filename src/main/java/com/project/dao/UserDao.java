package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.project.connector.DatabaseConnection;
import com.project.entities.User;

//import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

public class UserDao {
	
	private Connection con;
	
	public UserDao(Connection connector) {
		this.con = connector;
		
		// TODO Auto-generated constructor stub
	}

	public boolean saveUser(User user) {
		boolean f = false;
		
		try {
			String queryString = "insert into user(name,email,password,gender,detail,profile) values(?,?,?,?,?,?);";
			PreparedStatement pstm = con.prepareStatement(queryString);
			pstm.setString(1, user.getNameString());
			pstm.setString(2, user.getEmail());
			pstm.setString(3, user.getPassword());
			pstm.setString(4, user.getDetails());
			pstm.setString(5, user.getGender());
			pstm.setString(6, user.getProfileString() );
			pstm.executeUpdate();
			
			
			f= true;
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}
//	
	public User getUserEmailPassword(String email, String password) {
		User user2 = null;
		try {
			String queryString = "select * from user where email =? and password=?";
			PreparedStatement pstm = con.prepareStatement(queryString);
			pstm.setString(1, email);
			pstm.setString(2, password);
			ResultSet set = pstm.executeQuery();
			
			if(set.next()) {
				user2 = new User();
				
				user2.setId(set.getInt("id"));
				user2.setNameString(set.getString("name"));
				user2.setPassword(set.getString("password"));
				user2.setEmail(set.getString("email"));
				user2.setDetails(set.getString("detail"));
				user2.setProfileString(set.getString("profile"));
				user2.setDateTimestamp(set.getTimestamp("datetime"));
				user2.setGender(set.getString("gender"));
				
				
				
				
			}
			
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		
//		
		
		return user2;
	}
//
}
