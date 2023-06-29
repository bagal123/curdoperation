package curdoperation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Updateservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String address = req.getParameter("address");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetail", "root", "root");
			PreparedStatement ps = con.prepareStatement("update customer set firstname=?,lastname=?,address=?,mobile=?,email=? where id=?");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, address);
			ps.setString(4, mobile);
			ps.setString(5, email);
			ps.setInt(6, id);

			int rs = ps.executeUpdate();

			if (rs == 1) {
				req.setAttribute("errormsg", "Record updated Successfully");
			} else {
				req.setAttribute("errormsg", "unable to updated");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, res);

	}

}
