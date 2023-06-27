package com.ujiuye.dao;

import com.ujiuye.bean.User;
import com.ujiuye.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    private QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
    @Override
    public User selectUserByUsername(String username) {
        String sql = "select * from user where username = ?";
        User user = null;
        try {
            user = qr.query(sql, new BeanHandler<>(User.class), username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
