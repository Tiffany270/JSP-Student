<%@ page language="java" import="java.util.*" pageEncoding="gb2312"
	contentType="text/html; charset=gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<body>
	<table align="center">
		<tr>
			<td><a href="login.jsp">登陆</a></td>
			<td><a href="signup.jsp">注册</a></td>
		</tr>
	</table>
	<h1 align="center">请先登录</h1>

	<table align="center">
		<tr>
			<td><a href="servlet/myServlet?action=look">查看总表</a></td>
			<td><a href="JSP/delete.jsp">删除数据</a></td>
			<td><a href="JSP/insert.jsp">插入数据</a></td>
			<td><a href="JSP/update.jsp">更新数据</a></td>
			<td><a href="JSP/querbyform.jsp">查询数据</a></td>
			<td><a href="servlet/findServler">分页显示</a></td>
	</table>
</body>
</html>
