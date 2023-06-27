package com.ujiuye.service;

import com.ujiuye.bean.User;

public interface UserService {
    User selectUserByUsername(String username);
}
