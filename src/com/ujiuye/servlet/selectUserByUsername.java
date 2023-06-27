package com.ujiuye.servlet;

import com.ujiuye.bean.User;
import com.ujiuye.service.UserService;
import com.ujiuye.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectUserByUsername")
public class selectUserByUsername extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
//        获取名
        String username = request.getParameter("username");
        System.out.println(username);
//        通过调用方法去查询是否存在该用户
        UserService us = new UserServiceImpl();
        User user = us.selectUserByUsername(username);
//        判断用户是否存在
        if(user == null){   //不存在  可用
            response.getWriter().print("yes");
        }else{
            response.getWriter().print("no");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
