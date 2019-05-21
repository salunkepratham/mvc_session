package com.cdac.login.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.login.model.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Login login=new Login();
		login.setUserId(request.getParameter("userId"));
		login.setUserName(request.getParameter("userName"));
		login.setPassword(request.getParameter("password"));
		login.setRole(request.getParameter("role"));
		
		RequestDispatcher rd;
		request.setAttribute("login", login);
		if((login.getUserName().equals("Prathamesh")) &&  (login.getPassword().equals("Pratham123"))) {
			HttpSession session=request.getSession(false);
			session.setAttribute("login", login);
			if(session!=null) {
				rd=request.getRequestDispatcher("Welcome.jsp");
				rd.forward(request, response);
			}else {
				rd=request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);
			}
			
		}else {
			rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
	}

}
