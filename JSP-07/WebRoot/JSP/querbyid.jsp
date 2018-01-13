<%@page import="com.yiki.dbutil.*"%>
<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<body>
<center>
<h1>查询成功</h1>
	<table align="center" border="1">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>age</td>
		</tr>
		<tr>
			<td>${requestScope.quer["id"]}</td>
			<td>${requestScope.quer["name"]}</td>
			<td>${requestScope.quer["age"]}</td>
		</tr>
		
	</table>

		<a href="loginServlet?action=back&success=yes">返回</a>
</center>

</body>
</html>
