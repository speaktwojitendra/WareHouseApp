package com.jit;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import com.sun.jdi.connect.spi.Connection;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	 java.sql.Connection con;
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
@Override
	public void init(ServletConfig config)
			   throws ServletException {
	super.init(config);
	System.out.println("Welcome to  init");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL","system","Jitu1234");
			                           
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
			PreparedStatement ps= con.prepareStatement("select * from student where username=? and password=?");
			ps.setString(1, Username);
			ps.setString(2, Password);
			ResultSet rs=ps.executeQuery();
			PrintWriter pw=response.getWriter();
			//rs.next();
			
			if(rs.next()) {
		
				//pw.print("<h1>hello,welcome</h1>");
				// RequestDispatcher dispatcher=	request.getRequestDispatcher("/Welcome");
				// dispatcher.forward(request, response);
				response.sendRedirect("welcome2"); 
			}
			else {
				
				pw.print("<h1 style=color:red>Invalid username/password</h1>");
				 RequestDispatcher dispatcher=	request.getRequestDispatcher("Login.html");
				 dispatcher.include(request, response);
				 
			}
				System.out.println(rs.getString(1));
				System.out.println("data fetched successfully");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
