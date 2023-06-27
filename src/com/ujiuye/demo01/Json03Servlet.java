package com.ujiuye.demo01;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/Json03Servlet")
public class Json03Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        创建对象
        User user1 = new User(1, "wjh", "123456");
        User user2 = new User(2, "xje", "123");
        User user3 = new User(3, "ccf", "1234");
        User user4 = new User(4, "fzj", "12345");
//        集合
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        List<User> list2 = new ArrayList<>();
        list2.add(user3);
        list2.add(user4);
//        map集合  list集合存储到map集合中
        Map<String, List<User>> map = new HashMap<>();
        map.put("1",list);
        map.put("2",list2);

//        map集合转成json
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(map);
        System.out.println(json);  //{"1":[{"id":1,"username":"wjh","password":"123456"},{"id":2,"username":"xje","password":"123"}],"2":[{"id":3,"username":"ccf","password":"1234"},{"id":4,"username":"fzj","password":"12345"}]}
    }
}
