<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>form 태그 이해 </title>
</head>
<body>

<!-- method는 안쓰면 get 방식  url에 넣는 방식-->
	<form action="loginfo.jsp" method="get" >
		<fieldset>
			<legend>로그인 폼</legend>
			<ul>
				<li>
					<label for="userid">id</label> <!-- jsp에서 사용하는 name  -->
					<input type="text" name="userid"> 
				</li>
				<li>
					<label for="password">PW</label> <!-- jsp에서 사용하는 name  -->
					<input type="password" name="password"> 
				</li>
				<li>
				<input type="submit" value="로그인">
				</li>
			</ul>
		</fieldset>	
		
	
	</form>


</body>
</html>