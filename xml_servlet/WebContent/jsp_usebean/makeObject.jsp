<%@page import="jsp_usebean.Memberinfo"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
//Memberinfo  m = new Memberinfo();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="m" scope="request" class="jsp_usebean.Memberinfo"></jsp:useBean>
<% 
 m.setId("madvirus");
 m.setName("홍길동");

%>
<jsp:forward page="useObject.jsp"></jsp:forward>






</body>
</html>