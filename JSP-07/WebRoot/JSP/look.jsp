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
			<td>����</td>
			<td>ɾ��</td>
		</tr>

		<c:forEach var="student" items="${requestScope.list}">
			<tr>
			 <td>${student.id}</td>
             <td>${student.name}</td>
             <td>${student.age}</td>
				<td>
				<a href="loginServlet?action=update&success=yes&id=${student.id}&name=${student.name}&age=${student.age}">����</a></td>
				<td><a href="loginServlet?action=delete&success=yes&id=${student.id}">ɾ��</a></td>
			</tr>
		</c:forEach>
	</table>
	<center>
		һ��${requestScope.count}����¼ 
		<a href="loginServlet?action=back&success=yes">����</a>
	</center>



</body>
</html>
