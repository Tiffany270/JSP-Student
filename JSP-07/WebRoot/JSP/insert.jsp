<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="gb2312"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
  <center>
   <form action="myServlet?action=insertdata" method="POST">
   名字：<input type="text" name="name">
  年龄：<input type="text" name="age">
  <input type="submit" value="提交">
   </form>
   
   <a href="loginServlet?action=back&success=yes">返回</a>
  </center>
   
   
  </body>
</html>
