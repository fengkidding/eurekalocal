package com.eurekalocal;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * eureka开启安全策略后，在新版本的security中，添加了csrf过滤,csrf将微服务的注册也给过滤了！
 * 因为Spring Cloud 2.0 以上的Spring Security默认启用了 csrf 检验，需要手动关闭 csrf 。
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
