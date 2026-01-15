package first;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.*;
import java.io.IOException;

/**
 * Servlet implementation class FirstServlet
 */

public class FirstServlet extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pr=response.getWriter();
		pr.print("Welcome to Servlet");
	}

}
