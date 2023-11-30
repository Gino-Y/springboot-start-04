package com.heima.springbootstart04.service.impl;

import com.heima.springbootstart04.mapper.UserMapper;
import com.heima.springbootstart04.pojo.User;
import com.heima.springbootstart04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
