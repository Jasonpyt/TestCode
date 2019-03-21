<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/5
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取List中的数据</title>
</head>
<body>
<%--存储List<String>数据--%>
<%
List<String> strList = new ArrayList<String>();
strList.add("aaa");
strList.add("bbb");
strList.add("ccc");
request.setAttribute("strList",strList);
%>

<h1>取出strList的数据</h1>
${strList[0]}==${strList[1]}
</body>
</html>
