<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="gb2312"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <h1 align="center">输入要查询的id</h1>
  <body>
<center>
   <form action="myServlet?action=quer" method="POST">
  id：<input type="text" name="ids">
  <input type="submit" value="提交">
   </form>
    <a href="loginServlet?action=back&success=yes">返回</a>
   </center>
  </body>
</html>
