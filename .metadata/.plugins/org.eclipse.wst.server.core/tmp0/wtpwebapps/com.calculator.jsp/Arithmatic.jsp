<%@page import="java.rmi.server.Operation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

if(request.getParameter("Operation").equals("➕ Add")){%>
<jsp:forward page="Add.jsp"></jsp:forward>	
<%
}
%>

<%

if(request.getParameter("Operation").equals("➖ Subtract")){%>
<jsp:forward page="Subtract.jsp"></jsp:forward>	
<%
}
%>


<%

if(request.getParameter("Operation").equals("✖ Multiply")){%>
<jsp:forward page="Multiply.jsp"></jsp:forward>	
<%
}
%>


<%

if(request.getParameter("Operation").equals("➗ Division")){%>
<jsp:forward page="Division.jsp"></jsp:forward>	
<%
}
%>

</body>
</html>