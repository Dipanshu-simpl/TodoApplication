<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ include file="commons/navigation.jspf" %>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"  rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Todo</title>
</head>
<body>
<div class="container"> 
<h1>Add a todo here</h1>
<form:form method="post" modelAttribute="todo">
<form:hidden path="id"/>
<form:hidden path="user"/>
<fieldset class="form-group">
<form:label path="desc" >Description</form:label>
<form:input path="desc" type="text" class="form-control"  required="required"/>
<form:errors path="desc" cssClass="text-warning"/>
</fieldset>
<input type="submit" value="Submit" class="btn btn-success">
</form:form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
