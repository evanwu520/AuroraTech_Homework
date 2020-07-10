package com.evan.homework.repository;

import com.evan.homework.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@Slf4j
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    void insert() {

        Product product = new Product();


        product.setId("adfasdf-zzz");
        product.setBoxId("adfasdf");
        product.setShoesId("zzz");
        productRepository.save(product);

    }

    @Test
    void select() {
        log.info(productRepository.findAll().toString());
    }

}