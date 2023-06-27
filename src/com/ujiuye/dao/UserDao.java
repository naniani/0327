package com.ujiuye.dao;

import com.ujiuye.bean.User;
import com.ujiuye.servlet.selectCityByCountryId;

public interface UserDao {

//    通过名字查询用户
    User selectUserByUsername(String username);

}
