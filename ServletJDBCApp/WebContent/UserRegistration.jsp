<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>User Registration</h3> <br>
<form action="register" method="post">
User Name : <input type="text" name="name"/><br>
User Age : <input type="text" name="age"/><br>
User from : <input type="text" name="city"/><br>
<input type="submit" value="Register"> <br>

<%
if(null != request.getAttribute("message"))
out.print(request.getAttribute("message"));
%>
</form>
</body>
</html>