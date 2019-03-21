<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  com.itheima.User: Administrator
  Date: 2018/12/5
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试jsp</title>
</head>
<body>
<%
    Date date = new Date();

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");

    String curTime = dateFormat.format(date);

    request.setAttribute("curTime",curTime);


%>

当前系统时间<span style="color: red"><%= request.getAttribute("curTime")%></span>
</body>
</html>
