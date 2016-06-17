<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page session="false" %>
<%@ include file="./include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>REST BBS</title>
</head>
<body>
<h1>
	제목 : ${vo.title}
</h1>

<table>
	<tr>
		<th>글쓴이</th>
		<td>${vo.user_name}</td>
	</tr>
	
	<tr>
		<th>날짜</th>
		<td>${vo.regdate}</td>
	</tr>
	
	<tr>
		<th>내용</th>
		<td>${vo.content}</td>
	</tr>
</table>

<form action="/rest/${vo.board_no }" method="post">
	<input type="hidden" id="_method" name="_method" value="delete"/>
	<input type="submit" value="삭제"/>
</form>

<h3>덧글</h3>

<div id="reply_list"></div>

<form id = "reply" action="/reply" method="post">
<input type="text" id="content" name="content" size="50"/>
작성자 : <input type="text" id="user_name" name="user_name" size="10"/>
<input type="button" class="btn btn-primary" value="등록" onclick="setReplyList()"/>
</form>

<script>
	function setReplyList(list){
		var result ="<ul>";
		
		$(list).each(function(){
			result += "<li>" + this.content + ":" +this.user_name+"</li>";
		});
		
		result += "</ul>"
		document.getElementById("reply_list").innerHTML = result;
	}
	
	function getReplyList(){
		
		var bno = 6;
		
		$.ajax({
			type:'get',
			url:'/reply/'+bno,
			headers:{
				"Content-Type" : "application/json",
				
			},
			dataType:'json',
			data : '',
			success : function(result){
				alert(result);
			}
		});
	}
	
	getReplyList();
</script>

</body>
</html>
