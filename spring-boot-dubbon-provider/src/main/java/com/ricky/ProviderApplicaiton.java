package com.ricky;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@EnableDubbo
@SpringBootApplication
public class ProviderApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicaiton.class, args);
        System.out.println("complete");
    }
}