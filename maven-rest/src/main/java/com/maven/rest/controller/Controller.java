package com.maven.rest.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maven.rest.service.Impl.LoginServiceImpl;
import com.maven.rest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Eisen7 on 17/3/12 012.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Resource
    private LoginService loginService;

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() {
        List list = loginService.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = null;
        try {
            json = objectMapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
