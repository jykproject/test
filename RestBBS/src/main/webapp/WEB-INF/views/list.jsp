<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ include file="./include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>글 목록</title>
</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>No.</th>
					<th>제목</th>
					<th>내용</th>
					<th>글쓴이</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
			</thead>
		
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.getBoard_no()}</td>					
					<td>${list.getTitle()}
					<a href="/rest/${list.getBoard_no()}">${list.getTitle()}</a></td>		
	 				<td>${list.getContent()}</td>		
					<td>${list.getUser_name()}</td>	
					<td>${list.getRegdate()}</td>
					<td>${list.getView_cnt()}</td>
				</tr>	
							
				
			
			</c:forEach>
		</table>
		<input type="button" onclick="a()" value="글쓰기"/>
	</div>
</body>
<script type="text/javascript">
	function a(){
		location.href="/rest/new";
	}
</script>
</html>