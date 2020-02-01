<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>

<%
	pageContext.setAttribute("aa","hello");

%>
<meta charset="EUC-KR">
<title>Model2 방식  - servlet 파일 따로 정리 </title>
</head>
<body>
	 <! --<%=request.getAttribute("result")%>-->
	 ${result} <!-- EL 표기법으로 가능 --><br>
	 
	  ${notice.id}
	  
	  ${ pageScope.aa}
</body>
</html>