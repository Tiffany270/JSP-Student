<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="gb2312"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <h1 align="center">����Ҫ��ѯ��id</h1>
  <body>
<center>
   <form action="myServlet?action=quer" method="POST">
  id��<input type="text" name="ids">
  <input type="submit" value="�ύ">
   </form>
    <a href="loginServlet?action=back&success=yes">����</a>
   </center>
  </body>
</html>
