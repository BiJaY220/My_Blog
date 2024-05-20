package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.jasper.compiler.NewlineReductionServletWriter;

import com.project.connector.DatabaseConnection;
import com.project.dao.UserDao;
import com.project.entities.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@MultipartConfig
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		
		
	
		String name = req.getParameter("user_name");
		String emailString = req.getParameter("user_email");
		String passwordString = req.getParameter("user_password");
		String genderString = req.getParameter("gender");
		String detailString = req.getParameter("details");

		
		User user = new User(name, passwordString,emailString,detailString,genderString);
		UserDao databaseDao = new UserDao(DatabaseConnection.connector());
		// pass the user to the database 
		
		
		if(databaseDao.saveUser(user)) {
			printWriter.println("done");
			
			
		}else {
			printWriter.println("error");
			
			
		}
		
		
		
	}
	

	
	
	
}
