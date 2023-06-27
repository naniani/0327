package com.ujiuye.dao;

import com.ujiuye.bean.Product;
import com.ujiuye.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements ProductDao{

    private QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());

    @Override
    public List<Product> selectProduct(String productname) {
        String sql = "select * from product where productname like ?";
        List<Product> list = null;
        try {
            list = qr.query(sql, new BeanListHandler<>(Product.class), "%" + productname + "%");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
