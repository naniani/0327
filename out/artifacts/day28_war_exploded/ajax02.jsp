<%--
  Created by IntelliJ IDEA.
  User: 13578
  Date: 2023/6/21
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
</head>
<body>
    <input type="button" value="get" onclick="fun()">
    <input type="button" value="post" onclick="fun2()">
    <script>
        /*
            $.get(url,[data],[success],[returnType])
         */
        function fun() {
            $.get("Ajax02Servlet","uname=lisi",function (data) {
                alert(data);
            },"text");
        }

        /*
            $.post(url, [data] , [success] , [returnType])
         */
        function fun2() {
            $.post("Ajax02Servlet","pwd=123",function (data) {
                alert(data);
            },"text");
        }

    </script>
</body>
</html>
