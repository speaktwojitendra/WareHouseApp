package demo;

import java.io.IOException;
import java.sql.*;

import java.sql.Connection;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/reg")
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public reg() {
        super();
        // TODO Auto-generated constructor stub
    }
    Connection con;
    @Override
    public void init(ServletConfig config) throws ServletException {
       // super.init(config);
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "Jitu1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// TODO Auto-generated method stub
		
			try {
				String s1=request.getParameter("uname");
				String s2=request.getParameter("upass");
				PreparedStatement ps=con.prepareStatement("insert into emp values(?,?)");
				
				ps.setString(1, s1);
				ps.setString(2,s2);
				
				ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
