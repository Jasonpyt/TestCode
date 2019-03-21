<%@ page import="com.itheima.User" %><%--
  Created by IntelliJ IDEA.
  com.itheima.User: Administrator
  Date: 2018/12/5
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //存储User实体数据
User user = new User("tom",18);
request.setAttribute("user",user);
%>

<h1>取出User的数据</h1>
${user.name}==${user.age}
</body>
</html>
