package com.wen.data.mart;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

@MapperScan("com.wen.data.mart.**.mapper")
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@EnableApolloConfig("application")
public class MartApplication {

    public static void main(String[] args) {
        SpringApplication.run(MartApplication.class);
    }

}
