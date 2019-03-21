<%--
  Created by IntelliJ IDEA.
  User: spt
  Date: 2018/12/1
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>首页</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="resource/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="resource/js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="resource/js/bootstrap.min.js"></script>
    <script type="text/javascript">
    </script>
</head>
<body>
<div align="center">
    <a
            href=${ctx}/findAll style="text-decoration:none;font-size:33px">查询所有用户信息
    </a><br>
    <%--跳转到多条件查询页面--%>
    <a
            href=${ctx}/ConditionList.jsp style="text-decoration:none;font-size:33px">根据条件查询用户信息
    </a>
    <br>
    <%--使用分页操作查询所有用户信息--%>
    <a
            href=${ctx}/findByPage?pageNumber=1 style="text-decoration:none;font-size:33px">分页查询所有用户信息
    </a>
    <br>
    <%--使用分页操作查询所有用户信息--%>
    <a
            href=${ctx}/findByPage2?pageNumber=1 style="text-decoration:none;font-size:33px">高级分页查询所有用户信息
    </a>
</div>
</body>
</html>
