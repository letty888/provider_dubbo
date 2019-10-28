package com.weilin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.weilin.service.UserService;


@Service(interfaceClass = UserService.class)

public class UserServiceImpl implements UserService {

    @Override
    public String say(String name) {
        return "hello,name project.";
    }
}
