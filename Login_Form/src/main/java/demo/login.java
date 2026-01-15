package demo;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import java.sql.*;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }
    Connection con;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config); // optional, if you're extending HttpServlet
        // your initialization code here
       
        try {
        	String s1=config.getInitParameter("user");
        	String s2=config.getInitParameter("password");
        	String s3=config.getInitParameter("url");
        	String s4=config.getInitParameter("class");
        	
        	 Class.forName(s4);
			con=DriverManager.getConnection(s3,s1,s2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        catch(ClassNotFoundException c) {
        	c.printStackTrace();
        }
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	try {
		String s1=request.getParameter("uname");
	String s2=request.getParameter("upass");
		PrintWriter pw=response.getWriter();
		PreparedStatement ps=	con.prepareStatement("SELECT * FROM emp WHERE name=? and password=?");
		ps.setString(1,s1);
		ps.setString(2, s2);
	
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		
		pw.print("<h1>Hello, Mr"+request.getParameter("uname")+"<h1>");
	}
	else {
		pw.print("Invalid password");
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
		
		// TODO Auto-generated method stub
	}

}
