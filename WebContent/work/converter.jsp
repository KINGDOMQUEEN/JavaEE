<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	errorPage="../error.jsp" pageEncoding="UTF-8"%>

	<jsp:useBean id="CBean" class="com.work.ConverterBean" scope="page" />
	
	<jsp:setProperty name="CBean" property="source" />
	<jsp:setProperty name="CBean" property="destination" />
	<jsp:setProperty name="CBean" property="s_input" />
	<%
		CBean.init();
	%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict/EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>converter</title>
<link rel="stylesheet" href="../css/converter.css" />
</head>
<body>
	
	<form action="converter.jsp" method="post">
		<table>
			<caption>万能进制转换器</caption>
			<tr>
				<td class="col1" bgcolor="yellow">从:</td>
				<td class="col2"><select name="source" id="select1">
						<option value="decimalism"
							<%="decimalism".equals(CBean.getSource()) ? "selected" : ""%>>十进制</option>
						<option value="binary"
							<%="binary".equals(CBean.getSource()) ? "selected" : ""%>>二进制</option>
						<option value="octonary"
							<%="octonary".equals(CBean.getSource()) ? "selected" : ""%>>八进制</option>
						<option value="hexadecimal"
							<%="hexadecimal".equals(CBean.getSource()) ? "selected" : ""%>>十六进制</option>
				</select></td>
			</tr>
			<tr>
				<td class="col1" bgcolor="yellow">转换为:</td>
				<td class="col2"><select name="destination" id="select2">
						<option value="decimalism"
							<%="decimalism".equals(CBean.getDestination()) ? "selected" : ""%>>十进制</option>
						<option value="binary"
							<%="binary".equals(CBean.getDestination()) ? "selected" : ""%>>二进制</option>
						<option value="octonary"
							<%="octonary".equals(CBean.getDestination()) ? "selected" : ""%>>八进制</option>
						<option value="hexadecimal"
							<%="hexadecimal".equals(CBean.getDestination()) ? "selected" : ""%>>十六进制</option>
				</select></td>
			</tr>
			<tr>
				<td class="col1" bgcolor="yellow">原进制数:</td>
				<td class="col2"><input type="text" name="s_input" id="s_input"
					value="<%=CBean.getS_input()%>" /></td>
			</tr>
			<tr>
				<td class="col1" bgcolor="yellow">结果:</td>
				<td class="col2"><input type="text" name="d_output"
					id="d_output" value="<%=CBean.getD_output()%>" readOnly /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="开始转换" /> <input
					type="button" onclick="checkReset()" value="取消" /></td>
			</tr>
		</table>
	</form>
	<script src="../javascript/converter.js"></script>
</body>
</html>