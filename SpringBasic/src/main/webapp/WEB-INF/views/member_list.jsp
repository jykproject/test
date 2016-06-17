<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>맴버목록</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>User_id</th>
				<th>Pw</th>
				<th>User_name</th>
				<th>Email</th>
				<th>regdate</th>
			</tr>
		</thead>
	
		<c:forEach items="${list}" var="list">
			<tr>
				<td>${list.getUser_id()}</td>
				<td>${list.getPw()}</td>
				<td>${list.getUser_name()}</td>
				<td>${list.getEmail()}</td>	
				<td>${list.getRegdate()}</td>
			</tr>	
		</c:forEach>
	</table>
</body>
</html>