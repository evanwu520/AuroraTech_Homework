package com.evan.homework.facotry.work;

import com.evan.homework.repository.BoxRepository;
import com.evan.homework.repository.ProductRepository;
import com.evan.homework.repository.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CombineWork implements Work {


    @Autowired
    BoxRepository boxRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShoesRepository shoesRepository;

    @Override
    public void produce() {



    }
}
