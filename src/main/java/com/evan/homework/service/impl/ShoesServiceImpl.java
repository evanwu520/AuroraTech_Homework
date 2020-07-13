package com.evan.homework.service.impl;


import com.evan.homework.model.Product;
import com.evan.homework.model.Shoes;
import com.evan.homework.repository.ShoesRepository;
import com.evan.homework.service.ShoesService;
import jdk.nashorn.internal.runtime.options.Option;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ShoesServiceImpl implements ShoesService {

    @Autowired
    ShoesRepository shoesRepository;

    @Override
    public List<Shoes> getShoesList() {
        List<Shoes> target = new ArrayList<>();
        shoesRepository.findAll().forEach(target::add);
        return target;
    }
}
