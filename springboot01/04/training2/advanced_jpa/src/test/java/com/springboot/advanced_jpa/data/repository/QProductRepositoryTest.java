package com.springboot.advanced_jpa.data.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.springboot.advanced_jpa.data.entity.Product;
import com.springboot.advanced_jpa.data.entity.QProduct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.function.Predicate;

@SpringBootTest
public class QProductRepositoryTest {

    @Autowired
    QProductRepository qProductRepository;

    @Test
    public void queryDSLTest2() {
        QProduct qProduct = QProduct.product;
        Iterable<Product> productList = qProductRepository.findAll(
                qProduct.name.contains("펜")
                        .and(qProduct.price.between(550, 1500))
        );

        for (Product product : productList) {
            System.out.println(product.getNumber());
            System.out.println(product.getName());
            System.out.println(product.getPrice());
            System.out.println(product.getStock());
        }
    }

    @Test
    public void queryDSLTest1() {
        /*Predicate predicate = QProduct.product.name.containsIgnoreCase("펜")
                .and(QProduct.product.price.between(1000, 2500));

        Optional<Product> foundProduct = qProductRepository
                .findOne((com.querydsl.core.types.Predicate) predicate);

        if (foundProduct.isPresent()) {
            Product product = foundProduct.get();
            System.out.println(product.getNumber());
            System.out.println(product.getName());
            System.out.println(product.getPrice());
            System.out.println(product.getStock());
        }*/
    }
}
