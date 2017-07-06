package com.yhguodu.sale.service.user.serviceImpl;

import com.yhguodu.sale.common.dao.SaleUser;
import com.yhguodu.sale.common.exception.MetaMessage;
import com.yhguodu.sale.common.result.ArkResult;
import com.yhguodu.sale.common.result.ArkResultGenerator;
import com.yhguodu.sale.service.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public ArkResult addUser(String name,String password,String email,String address) {
        SaleUser user = new SaleUser(0,name,password,email,address);
        userMapper.insertUser(user);
        return ArkResultGenerator.genSuccess(true);
    }

    public ArkResult getUserByName(String username) {
        SaleUser user = userMapper.getUserByName(username);
        if(user == null)
            return ArkResultGenerator.genFail(MetaMessage.USER_NOT_FOUND);

        return ArkResultGenerator.genSuccess(user);
    }
}
