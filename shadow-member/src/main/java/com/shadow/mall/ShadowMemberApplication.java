package com.shadow.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.shadow.mall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ShadowMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShadowMemberApplication.class, args);
    }

}
