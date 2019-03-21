<%--
  Created by IntelliJ IDEA.
  User: spt
  Date: 2018/12/1
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>


<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="resource/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="resource/js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="resource/js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
</head>
<body>

<%--

   当前的jsp就拿到了一个pageBean对象
        pb
           data 当前页数据
           pageNum 当前页码
           pageSize 每页条数
           total 总条数
           totalPage 总页数


--%>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>
    总共有${pb.total}条
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
           <%--
             如果   pb
           data 当前页数据是null或者是一个空集合 没有找到数据
           --%>
        <c:if test="${empty pb.data}">
            <tr>
                <td colspan="8" align="center">找不到用户</td>
            </tr>

        </c:if>


        <c:if test="${not empty pb.data}">
            <%--
            ${contactlist}从域中转发而来的集合
              遍历拿到每一个contact对象  c:forEach标签
         --%>
            <c:forEach items="${pb.data}" var="contact">
                <tr>
                    <td>${contact.id}</td>
                    <td>${contact.name}</td>
                    <td>${contact.sex}</td>
                    <td>${contact.age}</td>
                    <td>${contact.address}</td>
                    <td>${contact.qq}</td>
                    <td>${contact.email}</td>
                    <td><a class="btn btn-default btn-sm" href="update.html">修改</a>&nbsp;<a class="btn btn-default btn-sm" href="javascript:;" onclick="deleteById(${contact.id})">删除</a></td>
                </tr>

            </c:forEach>
        </c:if>



        <tr>
            <td colspan="8" align="center"><a class="btn btn-primary" href="add.html">添加联系人</a></td>
        </tr>

    </table>
    <nav aria-label="Page navigation" class="text-center">
        <ul class="pagination pagination-lg">
            <%--上一页
               class = "disable"  禁用
                     第一页禁用
                      其他不禁用
            --%>
            <c:if test="${pb.pageNum==1}">
                <li class="disabled">
                        <%--  href 跳转到   当前页的上一页 当前页减1
                             假如当前页 pageNum
                             "${ctx}/findByPage?pageNumber="+(pageNum-1)
                         --%>
                    <a href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
            </c:if>
                <c:if test="${pb.pageNum!=1}">
                    <li>
                            <%--  href 跳转到   当前页的上一页 当前页减1
                                 假如当前页 pageNum
                                 "${ctx}/findByPage2?pageNumber="+(pageNum-1)
                             --%>
                        <a href="${ctx}/findByPage2?pageNumber=${pb.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                </c:if>
           <%--
               class="active"
                  如果页码=当前页  就激活  否则不激活

                  href="${ctx}/findByPage?pageNumber="+页码
           --%>
                <%-- 遍历总页数--%>
                <c:forEach begin="1" end="${pb.totalPage}" var="n">
                       <%--判断是不是当前页--%>
                       <c:if test="${pb.pageNum==n}">
                           <li class="active"><a href="#">${n}</a></li>
                      </c:if>

                    <c:if test="${pb.pageNum!=n}">
                        <li><a href="${ctx}/findByPage2?pageNumber=${n}">${n}</a></li>
                    </c:if>
                </c:forEach>



                <%--
                   下一页
                       最后一页禁用
                        其他不禁用
                       href= "${ctx}/findByPage?pageNumber="+(pageNum+1)
                --%>
                <c:if test="${pb.pageNum==pb.totalPage}">
                    <li class="disabled">
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </c:if>

                <c:if test="${pb.pageNum!=pb.totalPage}">
                    <li>
                        <a href="${ctx}/findByPage2?pageNumber=${pb.pageNum+1}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </c:if>

        </ul>
    </nav>
    <script type="text/javascript">
        // 用户点击删除 触发的事件
        function deleteById(id){
             // 给个提示

            var b = confirm("请问您是否要删除该条信息？");

            if(b){
                // 要执行删除
                // 访问 servlet?  怎么访问
                location.href = "${ctx}/delete?id="+id;
            }
        }

    </script>
</div>
</body>
</html>
