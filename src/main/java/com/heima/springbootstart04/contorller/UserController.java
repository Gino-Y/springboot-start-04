package com.heima.springbootstart04.contorller;

import com.heima.springbootstart04.pojo.User;
import com.heima.springbootstart04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/findById")
    public User findById(Integer id) {
        return userService.findById(id);
    }
}
