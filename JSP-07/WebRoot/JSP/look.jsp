<%@page import="com.yiki.dbutil.*"%>
<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<body>

	<table align="center" border="1">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>age</td>
			<td>更新</td>
			<td>删除</td>
		</tr>

		<c:forEach var="student" items="${requestScope.list}">
			<tr>
			 <td>${student.id}</td>
             <td>${student.name}</td>
             <td>${student.age}</td>
				<td>
				<a href="loginServlet?action=update&success=yes&id=${student.id}&name=${student.name}&age=${student.age}">更新</a></td>
				<td><a href="loginServlet?action=delete&success=yes&id=${student.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<center>
		一共${requestScope.count}条记录 
		<a href="loginServlet?action=back&success=yes">返回</a>
	</center>



</body>
</html>
