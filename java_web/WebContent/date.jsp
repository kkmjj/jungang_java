<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>



<h1>현재 날짜 출력 </h1><br>
<%
	Date d = new Date();

%>
현재 날짜  : <%=d.getDate() %>




</body>
</html>