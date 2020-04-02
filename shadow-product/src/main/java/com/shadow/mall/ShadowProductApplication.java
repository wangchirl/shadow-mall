package com.shadow.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合 Mybatis-Plus
 *      1) 导入依赖
 *        <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *       2) 配置
 *          1. 配置数据源
 *              1) 导入mysql驱动
 *                  <dependency>
 *                      <groupId>mysql</groupId>
 *                      <artifactId>mysql-connector-java</artifactId>
 *                      <version>8.0.17</version>
 *                   </dependency>
 *               2) 配置数据源信息 application.yml
 *          2. 配置 Mybatis-Plus
 *              1) @Mapper扫码@MapperScan
 *              2) mapper.xml映射文件配置 application.yml
 */
@SpringBootApplication
@MapperScan(value = "com.shadow.mall.product.dao")
public class ShadowProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShadowProductApplication.class, args);
    }

}
