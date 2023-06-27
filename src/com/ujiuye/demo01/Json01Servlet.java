package com.ujiuye.demo01;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Json01Servlet")
public class Json01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        准备对象
        User user = new User(1, "wjh", "123456");

//        对象转成json
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(user);
        System.out.println(json);    //{"id":1,"username":"wjh","password":"123456"}
    }

}