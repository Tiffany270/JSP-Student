<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="gb2312"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
  <center>
   <form action="myServlet?action=insertdata" method="POST">
   ���֣�<input type="text" name="name">
  ���䣺<input type="text" name="age">
  <input type="submit" value="�ύ">
   </form>
   
   <a href="loginServlet?action=back&success=yes">����</a>
  </center>
   
   
  </body>
</html>
