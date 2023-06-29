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
public class Deleteservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetail", "root", "root");
			PreparedStatement ps = con.prepareStatement("delete from customer where id=?");
			ps.setString(1, id);

			int rs = ps.executeUpdate();

			if (rs == 1) {
				req.setAttribute("errormsg", "Record deleted Successfully");
			} else {
				req.setAttribute("errormsg", "unable to deleted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, res);

	}
}
