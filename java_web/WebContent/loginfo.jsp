<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>전송 받기 </title>
</head>
<body>
	
	<h1>로그인 입력 파라미터 출력 </h1>
	<%
		String name = request.getParameter("userid");
		String pw = request.getParameter("password");
	%>	


	아이디<%=name %><br>
	비밀번호<%=pw %>
	
	





</body>
</html>