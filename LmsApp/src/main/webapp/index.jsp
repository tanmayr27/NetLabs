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
String first_name = request.getParameter("first_name");
String last_name = request.getParameter("last_name");
out.println("Your name is:"+first_name +"" +last_name);
session.setAttribute("first_name",first_name);
%>
<a href="second.jsp"></a></body>
</html>