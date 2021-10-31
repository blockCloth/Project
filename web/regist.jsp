<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册界面</title>
</head>
<body>
    <center>
        <form action="/registUser" method="post">
            <span style="color: red;font-size: 20px">${msg}</span>
            <table border="2">
                <tr>
                    <th colspan="2">注册用户</th>
                </tr>
                <tr>
                    <th>用户名</th>
                    <th><input type="text" name="name"></th>
                </tr>
                <tr>
                    <th>密码</th>
                    <th><input type="password" name="passwd"></th>
                </tr>
                <tr>
                    <th colspan="2"><button type="submit">确认注册</button> </th>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
