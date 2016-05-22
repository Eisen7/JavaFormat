<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Eisen7
  Date: 17/3/9 009
  Time: 下午 7:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="domain.User" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <br>
  <%
      out.println("客户端IP: "+request.getRemoteAddr()+"<br>");
      for (int i=0;i<10;i++) {
          out.println(i + "<br>");
      }
  %>
  <p>
      现在时间：<%= new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss").format(new Date()) %>
  </p><br>
    <%@include file="include.jsp"%><br>
  <jsp:useBean id="user"  class="domain.User"/>
  <%
      user.setId(1);
      user.setName("1");
      user.setPassword("1");
  %>
  <p>id:${user.id}<br>name:${user.name}<br>password:${user.password}</p>
  </body>
</html>
