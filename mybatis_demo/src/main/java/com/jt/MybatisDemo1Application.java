package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.jt.mapper")
//根据指定的包路径为接口创建代理对象,交给Spring容器管理
//@MapperScan("com.jt.mapper")
public class MybatisDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDemo1Application.class, args);
    }
}
