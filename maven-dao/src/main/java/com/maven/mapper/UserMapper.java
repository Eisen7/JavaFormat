package com.maven.mapper;

import com.maven.pojo.User;

import java.util.List;

/**
 * Created by Eisen7 on 17/3/12 012.
 */
public interface UserMapper {
    List findAll();

    User find();
}
