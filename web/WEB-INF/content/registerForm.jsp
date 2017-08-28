<%--
  Created by IntelliJ IDEA.
  User: ghj
  Date: 2017/8/4
  Time: 下午5:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
    <form method="post">
        <table>
            <tr>
                <td><label>登录名:</label></td>
                <td><input type="text" id="loginname" name="loginname"></td>
            </tr>
            <tr>
                <td><label>密码: </label></td>
                <td><input type="password" id="password" name="password"></td>
            </tr>
            <tr>
                <td><label>真实姓名: </label></td>
                <td><input type="text" id="username" name="username" ></td>
            </tr>
            <tr>
                <td><input id="submit" type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</body>
</html>
