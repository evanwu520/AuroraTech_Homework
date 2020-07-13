package com.evan.homework.service.impl;

import com.evan.homework.model.Box;
import com.evan.homework.repository.BoxRepository;
import com.evan.homework.service.BoxService;
import jdk.nashorn.internal.runtime.options.Option;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BoxServiceImpl  implements BoxService {

    @Autowired
    BoxRepository boxRepository;

    @Override
    public List<Box> getBoxList() {

        List<Box> target = new ArrayList<>();
        boxRepository.findAll().forEach(target::add);
        return target;
    }
}
