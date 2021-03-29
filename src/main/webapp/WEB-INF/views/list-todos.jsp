<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ include file="commons/navigation.jspf" %>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"  rel="stylesheet">
<meta charset="ISO-8859-1">
<title>list-todos</title>
</head>
<body>
<nav role="navigation" class="navbar navbar-default"></nav>
<div class="container">
hi ${name }
<table class="table table-striped">
<caption>Your todos are</caption>
<thead>
<tr>
<th>Id</th>
<th>Description</th>
<th>User</th>
<th></th>
</tr>
</thead>
<tbody>
<c:forEach items="${todos }" var="todo" ><br>
<tr>
<td>${todo.id }</td> 
<td>${todo.desc }</td>
<td> ${todo.user }</td>
<td><a href="/update-todo?id=${todo.id }" class="btn btn-success" >Update</a>
<a href="/delete-todo?id=${todo.id }" class="btn btn-danger" >Delete</a></td>
</tr>
<br><br>
</c:forEach>
</tbody>
</table>
<br>
<a class="btn btn-success" href="/add-todo">Add</a>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>