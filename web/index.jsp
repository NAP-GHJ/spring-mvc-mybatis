<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>测试@ModelAttribute</title>

  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>


<h3>测试@ModelAttribute的不同用法</h3>
<a href="loginForm1">测试@ModelAttribute(value="")注释返回具体类的方法 </a><br><br>
<a href="loginForm2">测试@ModelAttribute注释void返回值的方法</a><br><br>
<a href="loginForm3">测试@ModelAttribute注释返回具体类的方法</a><br><br>
<a href="loginForm4">测试@ModelAttribute和@RequestMapping同时注释一个方法 </a><br><br>
<a href="loginForm5">测试@ModelAttribute注释一个方法的参数 </a><br><br>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>