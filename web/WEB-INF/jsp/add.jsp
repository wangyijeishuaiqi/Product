<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/9
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addProduct" method="post">
    产品名称:<input type="text" name="productname" value="">
    产品描述：<input type="text" name="descs" value="">
    商品类型：
    <select name="cid">
        <option value="1">数码产品</option>
        <option value="2">衣服鞋帽</option>
        <option value="3">书籍图书</option>
        <option value="4">家庭用品</option>
    </select>
    <input type="submit" name="tj" value="提交">
</form>
</body>
</html>
