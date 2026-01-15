package com.servlet.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet Filter implementation class ServletFilter
 */
@WebFilter("/welcome")
public class ServletFilter extends HttpFilter implements Filter {
  Connection con;

  public void init(FilterConfig fConfig) throws ServletException {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      con = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:orcl", "jk", "1234");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {

   

    try {
      Statement s = con.createStatement();
      ResultSet rs = s.executeQuery("SELECT ename FROM emp");
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<style>");
      out.println("body { background-color: #fff8dc; color: #2c3e50; font-family: Arial; }");
      out.println("ul { list-style-type: square; padding-left: 20px; }");
      out.println("li { margin: 5px 0; font-weight: bold; }");
      out.println("</style>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h3>Filter intercepted the request</h3>");
      out.println("<ul>");

      while (rs.next()) {
          out.println("<li>" + rs.getString("ename") + "</li>");
      }

      out.println("</ul>");
      // ✅ Do NOT close </body> or </html> yet

      rs.close();
      s.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    // ✅ Pass the request to the servlet
    chain.doFilter(request, response);
  }

  public void destroy() {
    try {
      if (con != null && !con.isClosed()) con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
