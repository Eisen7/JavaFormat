package com.maven.portal.service.impl;

import com.maven.pojo.User;
import com.maven.portal.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * Created by Eisen7 on 17/3/12 012.
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Override
    public User login() {
        User user = new User();
        user.setName("name");
        return user;
    }
}
