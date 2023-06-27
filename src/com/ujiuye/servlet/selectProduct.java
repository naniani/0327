package com.ujiuye.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.bean.Product;
import com.ujiuye.service.ProductService;
import com.ujiuye.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectProduct")
public class selectProduct extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
//        获得产品名称
        String productname = request.getParameter("productname");
        ProductService ps = new ProductServiceImpl();
        List<Product> list = ps.selectProduct(productname);

        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(list);
        response.getWriter().print(s);

    }
}
