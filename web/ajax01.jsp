<%--
  Created by IntelliJ IDEA.
  User: 13578
  Date: 2023/6/21
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
</head>
<body>
    <input type="button" value="ajax" onclick="fun()">
    <script>
        /*
        $.ajax({
            url:””,     路径
            data:{},    参数
            type:””,    类型：post/get
            dataType:””,返回类型
            success:function(){},  成功
            error:function(){}     失败
            });
         */
        function fun() {
            $.ajax({
                url:"Ajax01Servlet",
                data:{id:1,uname:'zs'},
                type:"post",
                dataType:"text",
                success:function (data) {
                    alert(data);
                },
                error:function () {
                    alert("error");
                }
            })
        }


    </script>
</body>
</html>
