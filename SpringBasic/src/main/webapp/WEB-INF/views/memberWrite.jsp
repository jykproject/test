<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>맴버등록</title>
</head>
<body>
	<form action="/spring/member" method="post">
		<table>
			<tr>
				<th>User_id</th>
					<td><input type="text" id="user_id" name="user_id"></td>
				<th>Pw</th>
					<td><input type="password" id="pw" name="pw"></td>
				<th>User_name</th>
					<td><input type="text" id="user_name" name="user_name"></td>
				<th>Email</th>
					<td><input type="text" id="email" name="email"></td>		
			</tr>
		</table>
		<input type="submit" value="등록">
	</form>
</body>
</html>