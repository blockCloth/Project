<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品选择页面</title>
</head>
<body>
    <center>
        <form action="/buyGoods" method="post">
        <h4>欢迎${name}来到购物商场</h4>
        请选择需要购买的商品：
        <table border="2">
            <tr>
                <th>衣服：</th>
                <th>
                    <input type="checkbox" name="clothing" value="120">卫衣120 <br>
                    <input type="checkbox" name="clothing" value="220">风衣220 <br>
                    <input type="checkbox" name="clothing" value="500">羽绒服500 <br>
                </th>
            </tr>
            <tr>
                <th>裤子：</th>
                <th>
                    <input type="checkbox" name="trouser" value="69">牛仔裤69 <br>
                    <input type="checkbox" name="trouser" value="152">西装裤152 <br>
                    <input type="checkbox" name="trouser" value="200">登山裤200 <br>
                </th>
            </tr>
            <tr>
                <th>鞋子：</th>
                <th>
                    <input type="checkbox" name="shoe" value="230">跑步鞋230 <br>
                    <input type="checkbox" name="shoe" value="352">篮球鞋352 <br>
                    <input type="checkbox" name="shoe" value="100">平板鞋100 <br>
                </th>
            </tr>
            <tr>
                <th colspan="2"><button>确认购买</button></th>
            </tr>
        </table>
        </form>
    </center>
</body>
</html>
