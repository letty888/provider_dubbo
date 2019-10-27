package com.weilin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.weilin.service.UserService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = UserService.class)
@Transactional
public class UserServiceImpl implements UserService {

    @Override

    public String say(String name) {
        return "hello,name project.";
    }
}
