package com.practice;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class firstservletdemo implements Servlet {
	
	public void init(ServletConfig arg0) throws ServletException {
	System.out.println("welcome to first servlet init method");
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("welcome to first servlet service method");
		
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

	
}
