package com.practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletdemo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String Address = request.getParameter("Address");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(Address);
		
		request.setAttribute("fname", fname);
		request.setAttribute("lname", lname);
		request.setAttribute("Address", Address);
		
		RequestDispatcher rd = request.getRequestDispatcher("demo.jsp");
		rd.forward(request, responce);
		
	}

}
