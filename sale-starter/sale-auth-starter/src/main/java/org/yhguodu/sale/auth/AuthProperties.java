package org.yhguodu.sale.auth;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("sale.auth")
public class AuthProperties {
    private String authAddress;

    public String getAuthAddress() {
        return authAddress;
    }

    public void setAuthAddress(String authAddress) {
        this.authAddress = authAddress;
    }
}
