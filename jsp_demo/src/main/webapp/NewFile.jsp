<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.time.*" %>
<% for(int i=0;i<21;i++){
	%>
	<div><%= LocalTime.now() %></div>
	<% }%>

<h1><%="Welcome to JSP" %></h1>
</body>
</html>