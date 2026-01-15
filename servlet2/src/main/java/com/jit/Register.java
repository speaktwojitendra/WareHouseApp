package com.jit;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection con;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
@Override
	public void init(ServletConfig config)
			   throws ServletException {
	super.init(config);
	System.out.println("Welcome to  init");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL","system","Jitu1234");
			                           
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String Username=	request.getParameter("Username");
String Password=request.getParameter("Password");

try {
	
	PreparedStatement ps= con.prepareStatement("insert into student values(?,?)");
	
	ps.setString(1, Username);
	ps.setString(2, Password);
	ps.executeUpdate();
	
	PrintWriter pw=	response.getWriter();
	pw.print("Registered successfully");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
