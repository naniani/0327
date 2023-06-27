<%--
  Created by IntelliJ IDEA.
  User: 13578
  Date: 2023/6/21
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
        //    用户名输入完 失去焦点事件
            $("#username").blur(function () {
                $.ajax({
                    url:"selectUserByUsername",
                    data:{"username":$("#username").val()},
                    type:"post",
                    success:function (data) {   //"yes"可用  "no"不可用
                        if(data == "yes"){
                            $("#usernamespan").html("用户名可用");
                            $("#usernamespan").css({color:"green"});
                        }else{
                            $("#usernamespan").html("用户名不可用");
                            $("#usernamespan").css({color:"red"});
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
    <form action="registerServlet" method="post">
        <table border="1px" cellspacing="0" width="400px" align="center">
            <tr>
                <td align="right">用户名</td>
                <td>
                    <input type="text" name="username" id="username" placeholder="请输入用户名">
                    <span id="usernamespan"></span>
                </td>
            </tr>
            <%--    ...     --%>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="注册">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
