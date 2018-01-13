<%@ page language="java" import="java.util.*" pageEncoding="gb2312"
	contentType="text/html; charset=gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<body>
	<table align="center">
		<tr>
			<td>欢迎您，${sessionScope.username}</td>
			<td><a href="loginServlet?action=out">退出</a></td>
		</tr>
	</table>
	<h1 align="center">Welcome</h1>

	<table align="center">
		<tr>
			<td><a href="myServlet?action=look">查看总表</a></td>
			<td><a href="loginServlet?action=delete&success=yes">删除数据</a></td>
			<td><a href="loginServlet?action=insertdata&success=yes">插入数据</a></td>
			<td><a href="loginServlet?action=update&success=yes">更新数据</a></td>
			<td><a href="loginServlet?action=querdata&success=yes">查询数据</a></td>
			<td><a href="findServler">分页显示</a></td>
	</table>
</body>
</html>
