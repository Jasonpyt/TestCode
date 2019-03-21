<%@ page import="java.util.Map" %>
<%@ page import="com.itheima.User" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/5
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String,User> userMap = new HashMap<>();
    User user = new User("liuqi",17);
    User user1 = new User("changqi",17);
    userMap.put("user",user);
    userMap.put("user1",user1);
    request.setAttribute("userMap",userMap);
%>
<h1>取出userMap的数据</h1>
${userMap.user.name}==${userMap.user.age}<br>
${userMap.user1.name}==${userMap.user1.age}<br>
${userMap['user'].name}==${userMap['user'].age}<br>
${userMap['user1'].name}==${userMap['user1'].age}<br>
</body>
</html>
