package com.evan.homework.repository;

import com.evan.homework.model.Box;
import com.evan.homework.model.Shoes;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShoesRepositoryTest {

    @Autowired
    ShoesRepository shoesRepository;

    @Test
    void insert() {

        Shoes shoes = new Shoes();
        shoes.setId("zzz");
        shoesRepository.save(shoes);

    }

    @Test
    void select() {
        System.out.println(shoesRepository.findAll().toString());

    }

}