<%--
  Created by IntelliJ IDEA.
  User: 13578
  Date: 2023/6/21
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
        //    输入产品名称 触发键盘键盘抬起
            $("#productname").keyup(function () {
            //    获取产品名称
                var productname = $("#productname").val();
                // 由于keyup事件响应时，凡是键盘松开时的数据都会被监控，所以需要正则表达式检测是否为中文，不是中文，不发送请求。
                var reg =  /^[\u4e00-\u9f5a]+$/;
                if(reg.test(productname)){  //true
                    $.getJSON("selectProduct",{"productname":productname},function (data) {
                        var str = "";
                        for (var i = 0; i < data.length; i++) {
                            //div添加产品名称
                            str += "<div>" + data[i].productname + "</div>";
                        }
                    //    div中添加str
                        $("#div").html(str);
                    })
                }

            })
        });

        function changeContent(e){
            var target = e.target;   //事件源
        //    把点击div中的文本赋值到input输入框中
            $("#productname").val($(target).text());
        //    清除div中内容
            $("#div").html("");
        }


    </script>
</head>
<body>
    <input type="text" style="width: 300px" name="productname" id="productname"  >
    <div id="div" style="width: 300px;" onmouseover="changebgc(event)" onmouseout="changebgcback(event)" onclick="changeContent(event)"></div>
</body>
</html>
