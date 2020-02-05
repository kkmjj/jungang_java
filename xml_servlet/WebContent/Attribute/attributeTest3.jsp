<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Attribute Test</title>
</head>
<body>
<h3>영역과 속성 테스트</h3>

<table width="300" border="1">

	<tr> <td colspan="2">Appilcation 영역에 저장할 내용들</td></tr>
	<tr>
		<td>이름</td>
		<td><%=application.getAttribute("name") %></td>
	
	</tr>
	
	<tr>
	<td>아이디</td>
		<td><%=application.getAttribute("id") %></td>
	
	</tr>
	
</table>



<table width="300" border="1">

	<tr> <td colspan="2">session 영역에 저장할 내용들</td></tr>
	<tr>
		<td>address</td>
		<td><%=session.getAttribute("home") %></td>
	
	</tr>
	
	<tr>
	<td>tel</td>
		<td><%=session.getAttribute("phone") %></td>
	
	</tr>
	<tr>
	<td>email</td>
		<td><%=session.getAttribute("email") %></td>
	
	</tr>
</table>










</body>
</html>
