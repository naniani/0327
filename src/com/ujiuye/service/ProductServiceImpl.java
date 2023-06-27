package com.ujiuye.service;

import com.ujiuye.bean.Product;
import com.ujiuye.dao.ProductDao;
import com.ujiuye.dao.ProductDaoImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private ProductDao pd = new ProductDaoImpl();
    @Override
    public List<Product> selectProduct(String productname) {
        return pd.selectProduct(productname);
    }
}
