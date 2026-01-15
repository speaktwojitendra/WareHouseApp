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
Integer i1=Integer.parseInt(request.getParameter("First"));
Integer i2=Integer.parseInt(request.getParameter("Second"));

out.print("Addition value="+(i1+i2));

%>
<script type="text/javascript">
alert("Addition is " + <%= i1 + i2 %>);


</script>
</body>
</html>