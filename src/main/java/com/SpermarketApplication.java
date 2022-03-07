package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@SpringBootApplication
//@ComponentScan(basePackages = {"com.admin.controller,com.admin.service"})
////扫描service和controller包
//@MapperScan(value = "com.admin.mapper")
//public class Hotel210607Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(Hotel210607Application.class, args);
//	}
//
//}

@SpringBootApplication
public class SpermarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpermarketApplication.class, args);
    }

}
