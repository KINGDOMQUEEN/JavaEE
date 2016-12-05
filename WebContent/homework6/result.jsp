<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="work6.Info"%>
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
	background-image:url(../img/background6.jpg);
}
</style>
</head>
<body>
	<jsp:useBean id="gepInfo" class="work6.Info"
		scope="session" />
	<div align="center">
	</br>
	</br>
		<h1>计算结果信息</h1>
		第一个时间：<jsp:getProperty property="date1" name="gepInfo"/><br>
		第二个时间：<jsp:getProperty property="date2" name="gepInfo" /><br>
		间隔天数：<jsp:getProperty property="days" name="gepInfo" /> <br> 
	      间隔小时数：<jsp:getProperty property="hours" name="gepInfo" /> <br>
		间隔分钟数：<jsp:getProperty property="mins" name="gepInfo" /> <br>
	          间隔秒数：<jsp:getProperty property="second" name="gepInfo" /> <br>	
	</div>
</body>
</html>