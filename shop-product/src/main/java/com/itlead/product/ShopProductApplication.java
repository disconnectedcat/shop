package com.itlead.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author cheng
 * date 2022/12/8 16:11
 */
@SpringBootApplication
@MapperScan("com.itlead.product.mapper")
public class ShopProductApplication {



    public static void main(String[] args) {
        SpringApplication.run(ShopProductApplication.class,args);
    }
}
