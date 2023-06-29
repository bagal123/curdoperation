package curdoperation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Loginservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String myuser = req.getParameter("username");
		String mypass = req.getParameter("password");
		
		PrintWriter pw = res.getWriter();
		
		if(myuser.equals("komal@gmail") && mypass.equals("komal123")){
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, res);
		}
		else{
			pw.write("username and password dident mached");
			RequestDispatcher rd = req.getRequestDispatcher("EmployeeLoginForm.jsp");
			rd.include(req, res);
		}
	}
}