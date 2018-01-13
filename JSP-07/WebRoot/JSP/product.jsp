<%@page import="com.yiki.dbutil.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  <body>
   <table align="center" border="1">
        <tr>
            <td align="center" colspan="5">
                <h2>所有信息</h2>
            </td>
        </tr>
        <tr align="center">
            <td><b>ID</b></td>
            <td><b>姓名</b></td>
            <td><b>年龄</b></td>
        </tr>
            <c:forEach var="student"  items="${requestScope.list}">  
         <tr align="center">
             <td>${student.id}</td>
             <td>${student.name}</td>
             <td>${student.age}</td>
         </tr>
       </c:forEach>
          <tr>
              <td align="center" colspan="5">
                 ${requestScope.bar}
              </td>
          </tr>
    </table>
    <center>
    <a href="loginServlet?action=back&success=yes">返回</a>
    </center>
  </body>
</html>
