package com.yhguodu.sale.service.user.web;


import com.yhguodu.sale.common.dao.SaleUser;
import com.yhguodu.sale.common.result.ArkResult;
import com.yhguodu.sale.service.user.serviceImpl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sale/service/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public ArkResult addUser(){
        return userService.addUser("root","earth&moon","yonghnguodu@hotmail.com","长山村");
    }

    @RequestMapping(value = "/{username}",method = RequestMethod.GET)
    public ArkResult getUserByName(@PathVariable("username") String username) {
        return userService.getUserByName(username);
    }

}
