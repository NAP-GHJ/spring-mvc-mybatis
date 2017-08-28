<%--
  Created by IntelliJ IDEA.
  User: ghj
  Date: 2017/8/4
  Time: 下午6:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试@RequestMapping注解</title>
</head>
<body>
<!-- 页面可以访问Controller传递传递出来的模型User对象 -->
欢迎[${requestScope.user.username }]登陆
<br>
</body>
</html>