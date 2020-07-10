package com.evan.homework.repository;

import com.evan.homework.model.Box;
import com.evan.homework.model.Shoes;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
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
        log.info(shoesRepository.findAll().toString());

    }
    @Test
    void findUnCombineShoes(){
        log.info(shoesRepository.findUnCombineShoes().toString());
    }

    @Test
    void update(){

        Optional<Shoes> optional = shoesRepository.findById("zzz");

        if (optional.isPresent()){

            Shoes shoes = optional.get();
            shoes.setStatus(1);
            shoesRepository.save(shoes);
        }
    }

}