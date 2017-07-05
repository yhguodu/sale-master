package org.yhguodu.sale.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(AuthProperties.class)
public class AuthAutoConfiguration {

    @Autowired
    private AuthProperties authProperties;

    @Bean
    @ConditionalOnMissingBean
    public AuthService authService() {
        return new AuthService(authProperties);
    }

    @Bean
    public AuthWebAppConfigurer authWebAppConfigurer() {
        return new AuthWebAppConfigurer();
    }
}
