package com.dcits.test.controller;

import com.dcits.test.model.User;
import com.dcits.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Qisong
 * 2021/1/2
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/saveCreateUser.do")
    public @ResponseBody Object saveCreateUser(User user){
        int result = userService.saveCreateUser(user);
        return result;
    }
}
