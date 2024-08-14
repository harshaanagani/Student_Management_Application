<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color: red;
position: fixed;
text-align: left;
margin left: 30px;
}
</style>

<script type="text/javascript">
function validateUserName() {
	var uname=document.getElementById('yn').value;
	if(uname.length < 3){
		alert("Atleast 2-3 characters required...")
		return false;
	}else{
		return true;
	}
}
</script>

</head>
<body>
<h1 align="center">Love Calculator</h1>
<form:form action="process-homepage" align="center" modelAttribute="twoway" onsubmit="return validateUserName()">
<hr/>
<p>
<label for="yn">YourName:</label>
<form:input id="yn" path="uname" />
<form:errors path="uname" cssClass="error"/>
</p>
<p>
<label for="cn">CrushName:</label>
<form:input id="cn" path="cname" />
</p>
<p>

<form:checkbox path="termsAndCOndition" id="check"/>
<label>I'm agreeing this is for fun</label>
<form:errors path="termsAndCOndition" cssClass="error"/>
</p>
<input type="submit" value="calculate">
</form:form>
</body>
</html>