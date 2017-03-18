package com.maven.rest.service.Impl;

import com.maven.mapper.UserMapper;
import com.maven.pojo.User;
import com.maven.rest.service.LoginService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eisen7 on 17/3/12 012.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List findAll() {
        List userList = userMapper.findAll();
        return userList;
    }
}
