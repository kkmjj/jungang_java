<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>

<%
	pageContext.setAttribute("aa","hello");

%>
<meta charset="EUC-KR">
<title>Model2 ���  - servlet ���� ���� ���� </title>
</head>
<body>
	 <! --<%=request.getAttribute("result")%>-->
	 ${result} <!-- EL ǥ������� ���� --><br>
	 
	  ${notice.id}
	  
	  ${ pageScope.aa}
</body>
</html>