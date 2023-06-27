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
import java.util.List;

@WebServlet("/Json02Servlet")
public class Json02Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        创建对象
        User user1 = new User(1, "wjh", "123456");
        User user2 = new User(2, "xje", "123");
//        集合
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);

//        集合转成json
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(list);
        System.out.println(json);    //[{"id":1,"username":"wjh","password":"123456"},{"id":2,"username":"xje","password":"123"}]
    }
}
