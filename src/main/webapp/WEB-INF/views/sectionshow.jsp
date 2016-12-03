<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="pl" value="${pointList}" />
	<table>
		<tr>
			<th>핵교A</th>
			<th>핵교B</th>
			<th>교필</th>
			<th>일교</th>
			<th>전기</th>
			<th>전지</th>
			<th>전선</th>
			<th>총합</th>
		</tr>

		<tr>
			<td><c:out value="${pl.get(0)}" /></td>
			<td><c:out value="${pl.get(1)}" /></td>
			<td><c:out value="${pl.get(2)}" /></td>
			<td><c:out value="${pl.get(3)}" /></td>
			<td><c:out value="${pl.get(4)}" /></td>
			<td><c:out value="${pl.get(5)}" /></td>
			<td><c:out value="${pl.get(6)}" /></td>
			<td><c:out value="${pl.get(7)}" /></td>
		</tr>
	</table>

	<br>
	<br>
	<a href="${pageContext.request.contextPath}/home"> go home</a>
</body>
</html>