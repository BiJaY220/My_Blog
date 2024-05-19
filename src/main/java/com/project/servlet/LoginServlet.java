package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.project.connector.DatabaseConnection;
import com.project.dao.UserDao;
import com.project.entities.Message;
import com.project.entities.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter printWriter = resp.getWriter();
		String userEmailString = req.getParameter("email");
		String userPasswordString = req.getParameter("password");
		
		UserDao dao = new UserDao(DatabaseConnection.connector());
		
		User ur = dao.getUserEmailPassword(userEmailString, userPasswordString);
		if(ur == null) {
			
			//printWriter.println("errorrrrr");
			Message message = new Message("wrong inputs ! Please try again","error","alert-danger");
			HttpSession session = req.getSession();
			session.setAttribute("message", message);
			resp.sendRedirect("Login.jsp");
		}else {
			// login success -> cookie and set the cookie
			HttpSession session = req.getSession();
			session.setAttribute("currentUser", session);
			resp.sendRedirect("Index.jsp");
			
			
			
			
			
		}
		
		
		
		
	}
	
	

}
