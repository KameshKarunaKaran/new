<%@ page import="OPERATE.Insert_Values" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String Name=request.getParameter("Name");
String Username=request.getParameter("Username");
String Email=request.getParameter("Email");
String Password=request.getParameter("Password");
String Confirm_Password=request.getParameter("Confirm Password");



Insert_Values obj_Insert_Values = new Insert_Values();

obj_Insert_Values.insert_values(Name,Username,Email,Password,Confirm_Password);

%>

Signed Up Successfully

<a href="http://34.70.235.55:32692/loginpage-0.0.1-SNAPSHOT/"class="button">SIGN IN</a>


</body>
</html>