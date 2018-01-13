<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="gb2312"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<h1 align="center">更新数据</h1>
<%!
	String name;
	int id;
	int age;%>
	<% 
	if (request.getParameter("name") != null) {
		byte[] n = request.getParameter("name").getBytes("iso8859-1");
		id = Integer.parseInt(request.getParameter("id"));
		age = Integer.parseInt(request.getParameter("age"));
		name = new String(n);
	} else {
		name = " ";
		
	}
%>
<body>
<center>
	<form action="myServlet?action=update" method="POST">
		id：<input type="text" name="ids" value="<%=id%>"> 名字：<input
			type="text" name="name" value="<%=name%>"> 年龄：<input
			type="text" name="age" value="<%=age%>"> <input
			type="submit" value="更新">
	</form>
<a href="myServlet?action=look">返回</a>
</center>
</body>
</html>
