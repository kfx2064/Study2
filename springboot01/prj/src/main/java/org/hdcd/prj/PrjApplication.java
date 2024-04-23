package org.hdcd.prj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.hdcd.prj.mapper")
public class PrjApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrjApplication.class, args);
	}

}
