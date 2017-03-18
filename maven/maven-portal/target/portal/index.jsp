<%--
  Created by IntelliJ IDEA.
  User: Eisen7
  Date: 17/3/9 009
  Time: 下午 7:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.maven.pojo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
$END$
<br>
<%
    out.println("客户端IP: " + request.getRemoteAddr() + "<br>");
    for (int i = 0; i < 10; i++) {
        out.println(i + "<br>");
    }
%>
<p>
    现在时间：<%= new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss").format(new Date()) %>
</p><br>
<%@include file="include.jsp" %>
<br>
<jsp:useBean id="list" class="java.util.ArrayList"/>
<%
    for (int i = 1; i <= 7; i++) {
        User user = new User();
        user.setId(i);
        user.setName("" + i);
        user.setPassword("" + i);
        list.add(user);
    }
%>
<c:forEach items="${list}" var="user">
    <p>id:${user.id}&nbsp;&nbsp;name:${user.name}&nbsp;&nbsp;password:${user.password}&nbsp;&nbsp;</p>
</c:forEach>


</body>
</html>
