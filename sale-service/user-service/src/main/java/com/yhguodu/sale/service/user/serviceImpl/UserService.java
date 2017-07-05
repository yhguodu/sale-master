package com.yhguodu.sale.service.user.serviceImpl;

import com.yhguodu.sale.common.result.ArkResult;
import com.yhguodu.sale.service.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public ArkResult addUser() {
        return null;
    }
}
