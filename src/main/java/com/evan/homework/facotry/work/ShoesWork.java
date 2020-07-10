package com.evan.homework.facotry.work;

import com.evan.homework.repository.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ShoesWork implements Work {

    @Autowired
    ShoesRepository shoesRepository;

    private final String key = "efg";

    @Override
    public void produce() {

    }
}
