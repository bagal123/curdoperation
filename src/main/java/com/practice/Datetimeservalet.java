package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Datetimeservalet implements Servlet{
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Date d = new Date();
		
		res.setContentType("Text/html");
		PrintWriter pw = res.getWriter();
		pw.write("<h3> current date:-" + d + "</h3>");
		
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	

}
