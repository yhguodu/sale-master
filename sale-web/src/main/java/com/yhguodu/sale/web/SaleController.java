package com.yhguodu.sale.web;


import com.yhguodu.sale.common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yhguodu.sale.auth.AuthService;


@RestController
public class SaleController {

    @Autowired
    private AuthService authService;

    @RequestMapping(value="sale/user/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id) {
        return new User(1,"yhguodu","yhguodu@sale.com");
    }

    @RequestMapping(value="/test/auth", method = RequestMethod.GET)
    public String authTest() {
        return authService.authUser(1);
    }
}
