<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="URLtoreachresourceFolder/css/my-style-sheet.css">
<title>Insert title here</title>
</head>
<body>



<div align="center">
<h2>Student Management Application</h2>
<form:form modelAttribute="students1" action="/student-management1/showstudentpage">
<input type="submit" value="add" class="myButton">
</form:form>
<table border="1">
<tr>
<td>id</td>
<td>name</td>
<td>mobile</td>
<td>country</td>
</tr>
<c:forEach var="s" items="${students1 }">
<tr>
<td>${s.id }</td>
<td>${s.name }</td>
<td>${s.mobile }</td>
<td>${s.country}</td>
<td><a href="/student-management1/updatestudents?userId=${s.id }">Update</a></td>
<td><a href="/student-management1/deletestudents?userId=${s.id }" onclick="if(!(confirm('Are you sure to delete this student...')))return false">Delete</a></td>

</tr>
</c:forEach>
</table>
<h2>Below the table</h2>
</div>
</body>
<img alt="fake student photo" src="URLtoreachresourceFolder/images/student2.png">
</html>		
