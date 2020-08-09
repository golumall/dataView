package com.dataView.dataView.controller;

import com.dataView.dataView.model.UserLogin;
import com.dataView.dataView.service.UsersService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/users")
public class UsersController {
    private final static Logger logger = LogManager.getLogger(UsersController.class);

    @Autowired
    UsersService usersService;

    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    public String userLogin(@RequestBody final UserLogin userLogin)
    {
            logger.info("Login Initiated for user: "+userLogin.getUser_name());
            return usersService.verifyUserLogin(userLogin.getUser_name(), userLogin.getPassword());
    }

}
