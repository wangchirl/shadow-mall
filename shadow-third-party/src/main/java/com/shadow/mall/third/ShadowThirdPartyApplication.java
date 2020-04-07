package com.shadow.mall.third;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShadowThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShadowThirdPartyApplication.class, args);
    }

}
