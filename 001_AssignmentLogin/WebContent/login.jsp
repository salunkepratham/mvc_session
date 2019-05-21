<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%--  <%session.setMaxInactiveInterval(1); %><hr>
	Session Time out:${pageContext.session.maxInactiveInterval }  --%>
	<form action="LoginServlet" method="post">
		<input type="text" name="userId" placeholder="userid"><br>
		<input type="text" name="userName" placeholder="username"><br>
		<input type="password" name="password" placeholder="password"><br>
		<input type="text" name="role" placeholder="role"><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>