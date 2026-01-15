package com.cookie.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AddCookie
 */
@WebServlet("/AddCookie")
public class AddCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddCookie() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		String s4=request.getParameter("book4");
		String s5=request.getParameter("book5");
	PrintWriter pw=	response.getWriter();
	pw.println("<html>");
	pw.println("<head>");
	pw.println("<body>");
	pw.println("<ol>");
	
	if(s1!=null) {
		Cookie c1=new Cookie("book1", s1);
		response.addCookie(c1);
		pw.println("<li>");
		pw.println(s1);
		pw.println("</li>");
	}
	

	if(s2!=null) {
		Cookie c2=new Cookie("book2", s2);
		response.addCookie(c2);
		pw.println("<li>");
		pw.println(s2);
		pw.println("</li>");
	}

	if(s3!=null) {
		Cookie c3=new Cookie("book3", s3);
		response.addCookie(c3);
		pw.println("<li>");
		pw.println(s3);
		pw.println("</li>");
	}
	
	

	if(s4!=null) {
		Cookie c4=new Cookie("book4", s4);
		response.addCookie(c4);
		pw.println("<li>");
		pw.println(s4);
		pw.println("</li>");
	}

	if(s5!=null) {
		Cookie c5=new Cookie("book5", s5);
		response.addCookie(c5);
		pw.println("<li>");
		pw.println(s5);
		pw.println("</li>");
	}
	
	
	pw.println("</ol>");
	
	pw.println("<a href=get>next</a>");
	pw.println("</body>");
	pw.println("</head>");
	pw.println("</html>");
	
	pw.print("Cookies added to cart");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
