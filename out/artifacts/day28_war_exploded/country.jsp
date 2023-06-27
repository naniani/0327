<%--
  Created by IntelliJ IDEA.
  User: 13578
  Date: 2023/6/21
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
<%--    页面加载完成    --%>
        $(function () {
            $.getJSON("selectAllCountry",function (data) {
            //    <option value='1'>中国</option>
                var str = "";
                for (var i = 0; i < data.length; i++) {    //data[i].id  data[i].name
                    str += "<option value='" + data[i].id + "'>" + data[i].name + "</option>";
                }
            //    国家下拉选择框中加入str
                $("#countryname").html($("#countryname").html() + str);
            });
        //    选择国家  国家输入框中值改变  根据国家id查询城市
            $("#countryname").change(function () {
                var id =  $("#countryname").val();    //国家id
                $.getJSON("selectCityByCountryId",{"id":id},function (data) {
                //    判断是否选择国家
                    if(data.length > 0){    //选择国家
                        var str = "";
                        for (var i = 0; i < data.length; i++) {    //data[i].id  data[i].name
                            str += "<option value='" + data[i].id + "'>" + data[i].name + "</option>";
                        }
                    //    城市下拉选择框中加入str
                        $("#cityname").html(str);
                    }else{  //请选择
                        $("#cityname").html('<option value="0">-请选择-</option>');
                    }
                })
            })
        })
    </script>
</head>
<body>
    国家：
    <select name="countryname" id="countryname">
        <option value="0">-请选择-</option>
    </select>
    城市：
    <select name="cityname" id="cityname">
        <option value="0">-请选择-</option>
    </select>
</body>
</html>
