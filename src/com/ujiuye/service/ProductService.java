package com.ujiuye.service;

import com.ujiuye.bean.Product;

import java.util.List;

public interface ProductService {

    List<Product> selectProduct(String productname);
}
