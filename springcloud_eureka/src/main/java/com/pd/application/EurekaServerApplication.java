package com.pd.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication

@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {

        //run的第一个参数 一定是添加了@SpringBootApplication注解的类，不是当前类
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
