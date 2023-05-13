package org.hdcd.imageshop01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.hdcd.imageshop01")
public class ImageShop01Application {

    public static void main(String[] args) {
        SpringApplication.run(ImageShop01Application.class, args);
    }

}
