package curdoperation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class samplelogin extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 String username = req.getParameter("username");
		 String password = req.getParameter("password");
		 
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetail", "root", "root");
				PreparedStatement ps = con.prepareStatement("secect count(*) from loginuser where username=?,password=?");
				ps.setString(1, username);
				ps.setString(2, password);
			
		} catch (Exception e){
		 System.out.println(e);
		   
		}
		 

			int rs;
			
			if (rs == 1) {
				req.setAttribute("errormsg", "Record Add ragistered");
			} else {
				req.setAttribute("errormsg", "unable to ragistered");
			}
			 
		 }

	private int executeUpdate() {
		// TODO Auto-generated method stub
		return 0;
	}
	}

}
