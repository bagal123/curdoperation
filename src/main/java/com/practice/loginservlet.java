package com.practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginservlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String address = req.getParameter("address");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		
		employeobj e = new employeobj(firstname,lastname,address,mobile,email);
		req.setAttribute("empdata", e);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("Ragister.jsp");
		rd.forward(req, res);
		
	}
}

