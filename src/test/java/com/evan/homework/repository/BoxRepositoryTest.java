package com.evan.homework.repository;

import com.evan.homework.model.Box;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@SpringBootTest
@Slf4j
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
        log.info(boxRepository.findAll().toString());
    }

    @Test
    void findUnCombineBox(){
        log.info(boxRepository.findUnCombineBox().toString());
    }

    @Test
    void update(){

        Optional<Box> optional = boxRepository.findById("adfasdf");

        if (optional.isPresent()){

            Box box = optional.get();
            box.setStatus(1);
            boxRepository.save(box);
        }
    }

}