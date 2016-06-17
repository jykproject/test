<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>글 등록</title>
</head>
<body>
	<div class="container">
		<table class="table">
			<form action="/rest" method="post">
				<table>
					<tr>
						<th>제목</th> 
							<td><input type="text" id="title" name="title"></td>	
						<th>내용</th>
							<td><input type="text" id="content" name="content" size="100" height="200"/></td>	
						<th>글쓴이</th>
							<td><input type="text" id="user_name" name="user_name"></td>				
					</tr>
				</table>
				<input type="submit" value="등록">
			</form>
		</table>
	</div>
</body>
</html>