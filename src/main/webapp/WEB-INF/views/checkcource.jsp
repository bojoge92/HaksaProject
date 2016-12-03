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

	<c:set var="haksa" value="${haksa}" />

	<table>
		<tr>
			<th>수강년도</th>
			<th>학기</th>
			<th>교과코드</th>
			<th>교과목명</th>
			<th>구분</th>
			<th>학점</th>
		</tr>

		<c:forEach var="h" items="${haksa}">
			<tr>
				<td><c:out value="${h.year}" /></td>
				<td><c:out value="${h.semester}" /></td>
				<td><c:out value="${h.code}" /></td>
				<td><c:out value="${h.name}" /></td>
				<td><c:out value="${h.section}" /></td>
				<td><c:out value="${h.point}" /></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/home"> go home</a>

</body>
</html>