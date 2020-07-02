package com.evan.homework.repository;

import com.evan.homework.model.Box;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
class BoxRepositoryTest {

    @Autowired
    BoxRepository boxRepository;

    @Test
    void insert() {

        Box box = new Box();
        box.setId("adfasdf");
        boxRepository.save(box);
    }

    @Test
    void select() {
        System.out.println(boxRepository.findAll().toString());

    }

}