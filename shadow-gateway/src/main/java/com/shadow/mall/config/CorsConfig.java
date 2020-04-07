package com.shadow.mall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {


    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource  source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 1.配置跨域
        corsConfiguration.addAllowedHeader("*"); // 允许哪些头
        corsConfiguration.addAllowedMethod("*"); // 允许哪些请求方式
        corsConfiguration.addAllowedOrigin("*"); // 允许哪些请求来源
        corsConfiguration.setAllowCredentials(true); // 允许携带cookie

        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
    }


}
