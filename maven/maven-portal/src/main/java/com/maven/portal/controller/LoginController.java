package com.maven.portal.controller;

import com.maven.pojo.User;
import com.maven.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Eisen7 on 17/3/12 012.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(User userForm, HttpServletRequest request, Model model) {
        User user  = loginService.login();

        //springMVC可以直接把参数封装成类，在形参声明即可
        System.out.println(userForm.toString());

        if (request.getParameter("name").equals(user.getName())) {
            model.addAttribute("name", user.getName());
            model.addAttribute("result", "success");
        }

        return "loginResult";

    }
}
