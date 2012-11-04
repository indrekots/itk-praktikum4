<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dao" class="ee.itcollege.i377.praktikum4.GuardDAO" />
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<c:forEach var="guard" items="${dao.guards}">
		<tr>
			<td>${guard.id}</td>
			<td>${guard.name}</td>
			<td>${guard.age}</td>
		</tr>
		</c:forEach>
		
	</table>

</body>
</html>