<%@ page language="java" import="java.util.*" pageEncoding="gb2312"
	contentType="text/html; charset=gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<body>
	<table align="center">
		<tr>
			<td>��ӭ����${sessionScope.username}</td>
			<td><a href="loginServlet?action=out">�˳�</a></td>
		</tr>
	</table>
	<h1 align="center">Welcome</h1>

	<table align="center">
		<tr>
			<td><a href="myServlet?action=look">�鿴�ܱ�</a></td>
			<td><a href="loginServlet?action=delete&success=yes">ɾ������</a></td>
			<td><a href="loginServlet?action=insertdata&success=yes">��������</a></td>
			<td><a href="loginServlet?action=update&success=yes">��������</a></td>
			<td><a href="loginServlet?action=querdata&success=yes">��ѯ����</a></td>
			<td><a href="findServler">��ҳ��ʾ</a></td>
	</table>
</body>
</html>
