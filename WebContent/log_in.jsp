<%@ page import="java.io.File" %><%--
  Created by liushb
  Date: 2016/11/14
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<jsp:useBean id="LogInBean" class="LogIn.LogInBean" scope="page"></jsp:useBean>
<jsp:setProperty name="LogInBean" property="*"/>

<%
    try {
        LogInBean.write();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
%>


请输入您的信息：
<form action="" method="post">
    <table width="30%" border="1">
        <tr >
            <td bgcolor="#7fffd4"><center>用户名:</center></td>
            <td ><input type="text" name="userName" style="width: 100%"></td>

        </tr>
        <tr >
            <td bgcolor="#7fffd4"><center>密码:</center></td>
            <td ><input type="password" style="width: 100%"></td>

        </tr>

        <tr >
            <td bgcolor="#7fffd4"><center>确认密码:</center></td>
            <td ><input type="password" name="password" style="width: 100%"></td>

        </tr>

        <tr >
            <td bgcolor="#7fffd4"><center>邮箱:</center></td>
            <td ><input type="email" name="email" style="width: 100%"></td>

        </tr>
        <tr >
            <td bgcolor="#7fffd4"><center>生日:</center></td>
            <td ><input type="text"  name="birthday" style="width: 100%"></td>

        </tr>

        <tr>
            <td bgcolor="#2f4f4f"><center>
                <input type="reset" value="清空" style="width:50%;background-color: darkcyan">
                </center>
            </td>
            <td bgcolor="#2f4f4f"><center>
                <input type="submit" value="注册" style=" background-color:darkcyan;width:40%">
                </center>
            </td>
        </tr>

    </table>
</form>

</body>
</html>
