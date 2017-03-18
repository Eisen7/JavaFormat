<%--
  Created by IntelliJ IDEA.
  User: Eisen7
  Date: 17/3/12 012
  Time: 下午 6:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SUCCESS</title>
</head>
<body>
<%
    if (request.getAttribute("result") == "success") {
        out.print("欢迎登陆: " + request.getParameter("name"));
    } else {
        out.print("error" + " " + request.getAttribute("result"));
    }
%>
</body>
</html>
