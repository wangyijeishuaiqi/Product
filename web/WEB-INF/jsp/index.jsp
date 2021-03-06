<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/9
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>显示页面</title>
    <h1>帅气的人啊</h1>

    <table width="1000" border="1">
        <tr>
            <th>产品名称</th>
            <th>产品描述</th>
            <th>类型</th>
            <th>状态</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${page.products}" var="p">
            <tr>
                <td>${p.productname}</td>
                <td>${p.descs}</td>
                <td>${p.catagory.name}</td>
                <td>${p.catagory.explain}</td>
                <td><a href="delProduct?id=${p.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>

    <c:if test="${page.pageNo>1}">
        <a href="index?pageNo=1">首页</a>
        <a href="index?pageNo=${page.pageNo-1}">上一页</a>
    </c:if>

    <c:if test="${page.pageNo<page.pages}">
        <a href="index?pageNo=${page.pageNo+1}">下一页</a>
        <a href="index?pageNo=${page.pages}">末页</a>
    </c:if>

    <h1><a href="add">新增</a></h1>
</head>
<body>

</body>
</html>
