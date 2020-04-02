package com.shadow.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //排除数据源自动配置
public class ShadowGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShadowGatewayApplication.class, args);
    }

}
