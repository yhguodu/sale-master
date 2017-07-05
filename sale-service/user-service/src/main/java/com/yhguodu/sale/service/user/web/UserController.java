package com.yhguodu.sale.service.user.web;


import com.yhguodu.sale.common.dao.SaleUser;
import com.yhguodu.sale.common.result.ArkResult;
import com.yhguodu.sale.service.user.serviceImpl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sale/service/user")
public class UserController {
    @Autowired
    private UserService userService;


    public ArkResult addUser(){
        return userService.addUser();
    }


}
