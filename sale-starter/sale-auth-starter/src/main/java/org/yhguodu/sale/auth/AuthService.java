package org.yhguodu.sale.auth;

/**
 * Created by Administrator on 2017/6/23.
 */
public class AuthService {

    private AuthProperties authProperties;

    public AuthService(AuthProperties authProperties) {
        this.authProperties = authProperties;
    }

    public String authUser(int id) {
        return "success";
    }
}
