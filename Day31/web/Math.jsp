<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/5
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${3==3}<br>
${3>=4}<br>
${3<5}<br>
${3!=3}<br>
${3+4}}<br>
${3==3&&3<4}<br>
${3==5||3>4}<br>
<%
request.setAttribute("str",null);
request.setAttribute("list",new ArrayList<>());
%>
${empty str}<br>
${empty list}<br>
${str==null ? "数据为空":str}<br>
</body>
</html>
