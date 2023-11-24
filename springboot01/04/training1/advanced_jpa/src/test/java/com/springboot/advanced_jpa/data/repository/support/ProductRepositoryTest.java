package com.springboot.advanced_jpa.data.repository.support;

import com.springboot.advanced_jpa.data.entity.Product;
import com.springboot.advanced_jpa.data.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.List;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    void findByNameTest() {
        List<Product> productList = productRepository.findByName("펜");

        for (Product product : productList) {
            System.out.println(product.getNumber());
            System.out.println(product.getName());
            System.out.println(product.getPrice());
            System.out.println(product.getStock());
        }
    }

}
