package com.antbell.spring.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.antbell.spring.mbg.mapper","com.antbell.spring.dao"})
public class MyBatisConfig {
}