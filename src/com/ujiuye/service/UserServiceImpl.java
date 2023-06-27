package com.ujiuye.service;

import com.ujiuye.bean.User;
import com.ujiuye.dao.UserDao;
import com.ujiuye.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao ud = new UserDaoImpl();

    @Override
    public User selectUserByUsername(String username) {
        return ud.selectUserByUsername(username);
    }
}
