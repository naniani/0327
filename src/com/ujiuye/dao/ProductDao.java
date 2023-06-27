package com.ujiuye.dao;

import com.ujiuye.bean.Product;

import java.util.List;

public interface ProductDao {

    List<Product> selectProduct(String productname);

}
