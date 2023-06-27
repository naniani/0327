package com.ujiuye.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.bean.Country;
import com.ujiuye.service.CountryService;
import com.ujiuye.service.CountryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllCountry")
public class selectAllCountry extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        CountryService cs = new CountryServiceImpl();
        List<Country> list = cs.selectAllCountry();
        System.out.println(list);

//        list->json   响应
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(list);
        response.getWriter().print(s);
    }
}
