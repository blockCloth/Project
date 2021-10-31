<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <form action="/saveVip" method="get">
            <h1>欢迎来到购物网站</h1>
            <input type="radio" name="user" value="vip" >VIP会员
            <input type="radio" name="user" value="user" checked>普通用户
            <br><br>
            <button>进入百货商店</button>
        </form>
    </center>
</body>
</html>
