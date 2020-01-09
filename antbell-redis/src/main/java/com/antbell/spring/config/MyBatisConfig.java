package com.antbell.spring.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.antbell.spring.mbg.mapper")
public class MyBatisConfig {
}