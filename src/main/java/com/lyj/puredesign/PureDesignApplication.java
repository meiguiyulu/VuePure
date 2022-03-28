package com.lyj.puredesign;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyj.puredesign.mapper")
public class PureDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(PureDesignApplication.class, args);
    }

}
