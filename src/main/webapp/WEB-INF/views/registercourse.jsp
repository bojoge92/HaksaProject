<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
	
<title>Insert title here</title>
</head>
<body>
	<sf:form method="get" action="${pageContext.request.contextPath}/docreate" modelAttribute="haksa" >
		<table class="formtable">
			<tr>
				<td class="label">Year:</td>
				<td><sf:input class="control" path="year" type="text" /> <br />
			</tr>
			<tr>
				<td class="label">Semester:</td>
				<td><sf:input class="control" path="semester" type="text" /> <br />
			</tr>
			<tr>
				<td class="label">Code:</td>
				<td><sf:input class="control" path="code" type="text" />  <br /> 
				<sf:errors cssClass="error" path="code"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Name:</td>
				<td><sf:input class="control" path="name" type="text" />  <br />
				<sf:errors cssClass="error" path="name"></sf:errors></td>
			</tr><tr>
				<td class="label">Section:</td>
				<td><sf:input class="control" path="section" type="text" />  <br /> 
				<sf:errors cssClass="error" path="section"></sf:errors></td>
			</tr><tr>
				<td class="label">Point:</td>
				<td><sf:input class="control" path="point" type="text" />  <br /> 
			</tr>
			<tr>
				<td class="label"></td>
				<td><input class="control" value="Create new Haksa" type="submit" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>