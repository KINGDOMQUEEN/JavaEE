<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
    <title>简单计算器</title>
    <link rel="stylesheet" href="../css/SC.css" />
</head>
<body>
      <form action="../SCServlet" method="post">
          <table width="30%" border="1">
            <caption>简单计算器</caption>
            <tr>
                <td>第一个参数:&nbsp;&nbsp;</td>
                <td>
                    &nbsp;&nbsp;
                    <input type="number" name="firstNum" step="0.01" />
                </td>
            </tr>
            <tr>
            <td>第一个操作符:&nbsp;&nbsp;</td>
            <td>
                &nbsp;&nbsp;
                <select name="operator1">
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                    <option value="%">%</option>
                </select>
            </td>
            </tr>
            <tr>
                <td>第二个参数:&nbsp;&nbsp;</td>
                <td>
                    &nbsp;&nbsp;
                    <input type="number" name="secondNum" step="0.01" />
                </td>
            </tr>
            <tr>
                <td>第二个操作符:&nbsp;&nbsp;</td>
                <td>
                    &nbsp;&nbsp;
                    <select name="operator2">
                        <option value="+">+</option>
                        <option value="-">-</option>
                        <option value="*">*</option>
                        <option value="/">/</option>
                        <option value="%">%</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>第三个参数:&nbsp;&nbsp;</td>
                <td>
                    &nbsp;&nbsp;
                    <input type="number" name="lastNum" step="0.01" />
                </td>
            </tr>
            <tr>
                <td colspan="2" id="op">
                    <input type="submit" value="计算" />
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="reset" value="清除" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>