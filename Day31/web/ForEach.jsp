<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/5
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>模拟增强for循环</h1>
<c:forEach begin="0" end ="${100}" var="i" step="10">
    ${i}<br>

</c:forEach>

</body>
</html>
