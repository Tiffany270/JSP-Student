<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="gb2312"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<h1>填写注册信息</h1>

<body>
	<form action="servlet/loginServlet?action=insert" method="POST">
		用户名：<input type="text" name="username" >
	    密码：<input type="password" name="password" > 
	     <input type="submit" value="注册">
	</form>


</body>
</html>
