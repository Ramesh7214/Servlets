<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String studentNo = request.getParameter("studentNo");
String studentName = request.getParameter("studentName");

String url = "third.jsp?studentNo="+studentNo+"&studentName="+studentName;

%>

<form action="third.jsp">
<a href='<%= url%>'>find page</a>
<input type="hidden" name="studentAge" value="25">
</form>

</body>
</html>