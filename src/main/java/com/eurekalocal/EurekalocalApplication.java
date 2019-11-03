package com.eurekalocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类，微服务注册中心
 *
 * @author f
 * @date 2018-05-14
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekalocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekalocalApplication.class, args);
    }
}
