<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "model.vo.MemberVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% MemberVO vo = (MemberVO)request.getAttribute("objreq"); %>
<h1>회원정보</h1><hr>
			<h2>회원이름 :<%= vo.getName() %></h2>   
			<h2>회원계정 :<%=vo.getId() %></h2>
			<h2>암호 :<%=vo.getPassword()%></h2>
			<h2>회원 전화번호 :<%=vo.getPhone()%></h2>
</body>
</html>