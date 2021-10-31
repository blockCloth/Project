<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录界面</title>
</head>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
    $(function (){
        $("#regist").click(function (){
            document.location.href = "regist.jsp";
        })
    })
</script>
<body>
<center>
    <form action="/userLogin" method="post">
        <span style="color: red;font-size: 20px">${msg}</span>
        <table border="2">
            <tr>
                <th colspan="2">登录到购物系统</th>
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
                <th><button id="regist" type="button">注册用户</button> </th>
                <th><button id="login" type="submit">登录</button> </th>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
