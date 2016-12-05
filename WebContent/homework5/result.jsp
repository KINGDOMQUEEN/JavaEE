<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="work5.FileMessage"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>resullt</title>
<style>
body {
	margin: 0 auto;
}

div {
	width: 400px;
	height: 500px;
	margin: 100px auto;
	background-image:url(../img/background5.jpg);
}
</style>
</head>
<body>
	<jsp:useBean id="fileMessage" class="work5.FileMessage"
		scope="session" />
	<div align="center">
	</br>
	</br>
		<h1>文件信息</h1>
	文件名：<jsp:getProperty property="fileName" name="fileMessage"/><br>
	大       小：<jsp:getProperty property="size" name="fileMessage" /><br>
	字数（汉子）：<jsp:getProperty property="words" name="fileMessage" /> <br> 
              行    数：<jsp:getProperty property="rows" name="fileMessage" /> <br>
             数字个数：<jsp:getProperty property="shuzi" name="fileMessage" /> <br>
             字母个数：<jsp:getProperty property="zimu" name="fileMessage" /> <br>	
	</div>
</body>
</html>