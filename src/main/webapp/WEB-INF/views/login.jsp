<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page!!!!</title>
</head>
<body>
<form action="/login.do" method="post">
<p color ="red"><b>${errorMessage }</b></p>
Enter your name: <input type="text" name="name"/>
Enter the password:<input type="password" name="password"/>
<input type="submit" value="login"/>
</form>
</body>
</html>