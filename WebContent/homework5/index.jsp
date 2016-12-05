<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<style type="text/css">
body {
	margin: 0 auto;
	padding: 0;
}

div {
	margin-left: 30%;
	margin-top: 10%;
	font-size: 17px;
}

table {
	border-collapse: collapse;
	width: 500px;
}

table thead td {
	border: 0;
	font-size: 23px;
	height: 50px;
	position: relative;
}

table thead td span {
	display: block;
	width: 170px;
	position: absolute;
	left: 90%;
	top: 4px;
}

table tbody input {
	width: 200px;
	height: 40px;
	font-size: 20px;
}

table tbody tr td:first-child {
	text-align: right;
	font-size: 20px;
	width: 200px;
}

table tbody tr:last-child td {
	border: 0px;
}
</style>
</head>
<body>
	<div>
		<form action="../StatisticFile" method="post" enctype="multipart/form-data">
			<table border="1" style="background-image:url(../img/background5.jpg)">
				<thead>
					<tr>
						<td><span>文件信息统计</span></td>
					</tr>
				</thead>
				<tbody>
					<tr>
					<td>请选择要统计的文件</td>
					<td><input type="file" name="myFile" size="30"></td>
					</tr>
					<tr>
						<td><input value="上传" type="submit" style="width: 110px;"></td>
						<td><input type="reset" value="取消"
							style="width: 60px; margin-left: 60px;"></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>