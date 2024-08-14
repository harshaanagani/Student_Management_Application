<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<link rel="stylesheet" type="text/css" href="/student-management1/URLtoreachresourceFolder/css/add-student.css">
<link rel="stylesheet" type="text/css" href="URLtoreachresourceFolder/css/my-style-sheet.css">
<h2 align="center">Add Student</h2>
</head>
<body class="myFonts">
<div style="color: light blue" align="center">
<form:form action="save-student" modelAttribute="students2" method="post">

<form:hidden path="id"/>

<label >Name:</label>
<form:input path="name"/><br><br><br>
<label >Mobile:</label>
<form:input path="mobile"/><br><br><br>
<label >country:</label>
<form:input path="country"/><br><br><br>
<input type="submit" value="submit" class="myButton">
</form:form>
</div>
</body>
</html>	