package curdoperation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Selectservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetail", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from customer where id=? ");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			req.setAttribute("id", rs.getInt(1));
			req.setAttribute("firstname", rs.getString(2));
			req.setAttribute("lastname", rs.getString(3));
			req.setAttribute("address", rs.getString(4));
			req.setAttribute("mobile", rs.getString(5));
			req.setAttribute("email", rs.getString(6));
		
			con.close();
			RequestDispatcher rd = req.getRequestDispatcher("Selectemployee.jsp");
			rd.forward(req, res);
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
