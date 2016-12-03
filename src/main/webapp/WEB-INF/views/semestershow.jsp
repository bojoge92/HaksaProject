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
	<c:set var="haksa" value="${haksas}" />
	<c:set var="point" value="${list}" />
	<table>
		<tr>
			<th>수강년도</th>
			<th>학기</th>
			<th>이수 학점</th>
			<th>상세보기</th>
		</tr>

		<tr>
			<td><c:out value="2012" /></td>
			<td><c:out value="1" /></td>
			<td><c:out value="${point.get(0)}" /></td>
			<td><a href="${pageContext.request.contextPath}/re20121">link</a></td>
		</tr>
		<tr>
			<td><c:out value="2012" /></td>
			<td><c:out value="2" /></td>
			<td><c:out value="${point.get(1)}" /></td>
			<td><a href="${pageContext.request.contextPath}/re20122">link</a></td>
		</tr>
		<tr>
			<td><c:out value="2013" /></td>
			<td><c:out value="1" /></td>
			<td><c:out value="${point.get(2)}" /></td>
			<td><a href="${pageContext.request.contextPath}/re20131">link</a></td>
		</tr>
		<tr>
			<td><c:out value="2013" /></td>
			<td><c:out value="2" /></td>
			<td><c:out value="${point.get(3)}" /></td>
			<td><a href="${pageContext.request.contextPath}/re20132">link</a></td>
		</tr>
		<tr>
			<td><c:out value="2014" /></td>
			<td><c:out value="1" /></td>
			<td><c:out value="${point.get(4)}" /></td>
			<td><a href="${pageContext.request.contextPath}/re20141">link</a></td>
		</tr>
		<tr>
			<td><c:out value="2014" /></td>
			<td><c:out value="2" /></td>
			<td><c:out value="${point.get(5)}" /></td>
			<td><a href="${pageContext.request.contextPath}/re20142">link</a></td>
		</tr>
		<tr>
			<td><c:out value="2016" /></td>
			<td><c:out value="1" /></td>
			<td><c:out value="${point.get(6)}" /></td>
			<td><a href="${pageContext.request.contextPath}/re20161">link</a></td>
		</tr>

	</table>
<br>
<br>
<a href="${pageContext.request.contextPath}/home"> go home</a>

</body>
</html>