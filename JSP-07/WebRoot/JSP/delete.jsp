<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="gb2312"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <body>
    <center>
    <h1 align="center">输入要删除的id</h1> 
   <form action="myServlet?action=delete" method="POST" >
  id：<input type="text" name="ids" value="<%=request.getParameter("id")%>">
  <input type="submit" value="提交">
   </form>
   <a href="myServlet?action=look">返回</a>
    </center>
   
  </body>
</html>
