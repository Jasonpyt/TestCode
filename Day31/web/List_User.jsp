<%@ page import="java.util.List" %>
<%@ page import="com.itheima.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/5
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<User> userList = new ArrayList<>();
    User user2 = new User("lucy",20);
    User user3 = new User("Cook",20);
    userList.add(user2);
    userList.add(user3);
    request.setAttribute("userList",userList);

%>
<h1>取出userList的数据</h1>
${userList[0].username} ${userList[0].age}<br/>
${userList[1].username}==${userList[1].age}<br/>
</body>
</html>
