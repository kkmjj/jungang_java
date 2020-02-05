<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>




<%
	String name= (String)application.getAttribute("name"); 
		//form.jsp 에서 날라와서 test1에서 application 에 저장 된 값을 불러옴 
		
		String email= (String)request.getParameter("email"); 
		String home= (String)request.getParameter("home"); 
		String phone=(String)request.getParameter("phone"); 
		
//test1에서 날라온 값은 session 영역에 저장해서 로그인 한 사람 만 값을 사용할수 있게 저장 
	session.setAttribute("email", email);
	session.setAttribute("home", home);
	session.setAttribute("phone", phone);
%>














<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Attribute Test</title>
</head>
<body>
<h3>영역과 속성 테스트</h3>
<%=name %>님의 정보가 모두 저장 되었습니다. <a href="attributeTest3.jsp">확인하러가기</a>



</body>
</html>
