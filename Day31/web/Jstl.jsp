<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; UTF-8" language="java" %>
<html>
<head>
   <title>Jstl</title> 
</head>
<body>
<%request.setCharacterEncoding("utf-8"); response.setContentType("text/html;charset=utf-8");%>
<c:if test="${num>5}">
    num大于5
</c:if>
<c:if test="${num<=5}">
    num小于等于5
</c:if>

<c:if test="${num==100}" var="res" scope="request"></c:if>
<h1>取出结果</h1>
${res}
</body>
</html>
