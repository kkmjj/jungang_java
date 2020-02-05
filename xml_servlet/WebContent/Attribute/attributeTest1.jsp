<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//form 에서 날라온 값을 저장한뒤 , application이라는 공간에 넣어 둔다 .
String name = request.getParameter("name");		
String id = request.getParameter("id");

if(name!=null && id!=null )
{
	application.setAttribute("name", name);
	application.setAttribute("id", id);
}







	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Attribute Test</title>
</head>
<body>
<h3>영역과 속성 테스트</h3>
<%=name %>님 반값습니다.
<%=name %>의 아이디는 <%=id %>입니다. 


<form action="attributeTest2.jsp" method="get">
<table width="300" border="1">

	<tr> <td colspan="2">session 영역에 저장할 내용들</td></tr>
	<tr>
		<td>email 주소</td>
		<td> <input type="text" name="email"></td>
	
	</tr>
	
	<tr>
	<td>집주소</td>
		<td> <input type="id" name="home"></td>
	
	</tr>
	<tr>
	<td>전화번호</td>
		<td> <input type="text" name="phone"></td>
	
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="전송"></td>
	</tr>
	
</table>
</form>












</body>
</html>
