package demo.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalTime;

import jakarta.servlet.Servlet;
import java.io.*;

/**
 * Servlet implementation class Time
 */
@WebServlet("/time")
public class Time extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LocalTime lt=LocalTime.now();
		
		PrintWriter pw=response.getWriter();
		pw.println("<html> <head> ");
		
		
		pw.println("<body   style='background-color:yellow  '> <h1 style='color:red'>"+lt+"</h1></body");
		
		pw.println("</head> </html>");
		
		
	}

}
