package com.evan.homework.facotry.work;

import com.evan.homework.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BoxWork implements Work {

    @Autowired
    BoxRepository boxRepository;


    private final String key = "abc";

    @Override
    public void produce() {




    }
}
