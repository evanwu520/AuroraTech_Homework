package com.evan.homework.service.impl;

import com.evan.homework.model.Box;
import com.evan.homework.model.Product;
import com.evan.homework.repository.ProductRepository;
import com.evan.homework.service.ProductService;
import com.evan.homework.service.ShoesService;
import jdk.nashorn.internal.runtime.options.Option;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> getProductList() {

        List<Product> target = new ArrayList<>();
        productRepository.findAll().forEach(target::add);
        return target;
    }
}
