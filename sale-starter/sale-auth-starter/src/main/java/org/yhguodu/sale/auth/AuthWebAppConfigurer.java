package org.yhguodu.sale.auth;



import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.yhguodu.sale.auth.interceptor.AuthInterceptor;


public class AuthWebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
