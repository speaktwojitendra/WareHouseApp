package com.servlet.filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Welcome() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter pw=	response.getWriter();
pw.println("<html>");
pw.println("\r\n"
		+ "<html>\r\n"
		+ "\r\n"
		+ "<head>\r\n"
		+ "<style type=\"text/css\">\r\n"
		+ "\r\n"
		+ "body{\r\n"
		+ "background-color:yellow;\r\n"
		+ "color: green; \r\n"
		+ "\r\n"
		+ "\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "\r\n"
		+ "</style>\r\n"
		+ "\r\n"
		+ "\r\n"
		+ "</head>\r\n"
		+ "\r\n"
		+ "<body>\r\n"
		+ "\r\n"
		+ "");
pw.println("<h1>"+"Wlcome Jitendra"+"</h1>");
pw.println("\r\n"
		+ "</body>\r\n"
		+ "</html>");

	}

}
