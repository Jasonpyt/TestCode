<%--
  Created by IntelliJ IDEA.
  com.itheima.User: Administrator
  Date: 2018/12/5
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--存储普通数据--%>

<%
//向request域中存储数据
    request.setAttribute("name","zhangsan");
//向session域中存储数据
request.getSession().setAttribute("name","lisi");
//向servletContext域中存储数据
    request.getServletContext().setAttribute("name","wangwu");
%>


<h1>取出request域中的数据</h1>
${requestScope.name}
<h1>取出session域中的数据</h1>
${sessionScope.name}
<h1>取出servletContext域中的数据</h1>
${applicationScope.name}

<h1>按照从小到大依次搜书域数据</h1>
${name}
</body>
</html>
