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
	margin-left: 20%;
	margin-top: 10%;
	font-size: 17px;
}

.main {
	border-collapse: collapse;
	width: 680px;
}

table.main thead td {
	border: 0;
	font-size: 23px;
	height: 50px;
	position: relative;
}

table.main thead td span {
	display: block;
	width: 170px;
	position: absolute;
	left: 140%;                           
	top: 4px;
}
table.main tbody tr td:first-child {
	text-align: right;
	font-size: 20px;
	width: 150px;
}
table.main tbody input {
	width: 200px;
	height: 35px;
	font-size: 20px;
	}
	table.main tbody tr td:nth-child(2){
	font-size: 20px;
	width: 200px;
	border-right:0px;
}

</style>
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<link rel="stylesheet" href="../jquery/jquery-ui.css">
<script src="../jquery/jquery-ui.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				$('.selectDate')
						.datepicker(
								{
									numberOfMonths : 1,//显示几个月
									dateFormat : "yy-mm-dd",
									showButtonPanel : true,//是否显示按钮面板
									dateFormat : 'yy-mm-dd',//日期格式
									clearText : "清除",//清除日期的按钮名称
									closeText : "关闭",//关闭选择框的按钮名称
									prevText : "上月",
									nextText : "下月",
									autoSize : "true",
									changeMonth : "true",
									changeYear : "true",
									yearSuffix : '年', //年的后缀
									monthSuffix : "月",
									showMonthAfterYear : true,//是否把月放在年的后面
									defaultDate : new Date(),//默认日期
									monthNames : [ '一月', '二月', '三月', '四月',
											'五月', '六月', '七月', '八月', '九月', '十月',
											'十一月', '十二月' ],
									dayNames : [ '星期日', '星期一', '星期二', '星期三',
											'星期四', '星期五', '星期六' ],
									dayNamesShort : [ '周日', '周一', '周二', '周三',
											'周四', '周五', '周六' ],
									dayNamesMin : [ '日', '一', '二', '三', '四',
											'五', '六' ],
									monthNamesShort : [ '一月', '二月', '三月', '四月',
											'五月', '六月', '七月', '八月', '九月', '十月',
											'十一月', '十二月' ],
									onSelect : function(selectedDate) {//选择日期后执行的操作
										alert(selectedDate);
									}
								});
			});
</script>
</head>
<body>
	<div>
		<form action="../DoCaculateTime" method="post">
			<table border="1" class="main" style="background-image:url(../img/background6.jpg)">
				<thead>
					<tr>
						<td><span>事件间隔计算</span></td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>第一个日期</td>
						<td><input type="text" name="date1" class="selectDate"></td>
						<td>时间：<input type="text" name="time1" placeholder=" 格式 hh:mm:ss"></td>

					</tr>
					<tr>
						<td>第二个日期</td>
						<td><input type="text" name="date2" class="selectDate"></td>
						<td>时间：<input type="text" name="time2"  placeholder=" 格式 hh:mm:ss"></td>

					</tr>
					<tr>
						<td><input value="计算" type="submit" style="width: 110px;"></td>
						<td><input type="reset" value="取消"
							style="width: 60px; margin-left: 60px;"></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>