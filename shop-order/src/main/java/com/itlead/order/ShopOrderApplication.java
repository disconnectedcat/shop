package com.itlead.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author cheng
 * date 2023/3/27 16:05
 */
@SpringBootApplication
@MapperScan("com.itlead.order.mapper")
public class ShopOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopOrderApplication.class,args);
    }
}
