<%--
  Created by IntelliJ IDEA.
  User: 13578
  Date: 2023/6/21
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
</head>
<body>
<input type="button" value="json" onclick="fun()">
<script>
    /*
        $.getJSON(url,[data],[success],[returnType])
     */
    function fun() {
        $.getJSON("Ajax03Servlet",function (data) {
            alert(data);
            alert(data.age);
            alert(data.name);
        })
    }
</script>
</body>
</html>
