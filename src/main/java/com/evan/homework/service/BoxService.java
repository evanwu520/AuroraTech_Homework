package com.evan.homework.service;

import com.evan.homework.facotry.work.BoxWork;
import com.evan.homework.repository.BoxRepository;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BoxService {


    @Autowired
    BoxRepository boxRepository;


    private final String key = "abc";

    public void produce(){
        try {
            long seq = boxRepository.findBoxMaxSeq().get().longValue() + 1;


            LocalDate localDate = new LocalDate();
            int days = localDate.getDayOfMonth();

            String id =  String.format("%3s", seq) + key;

            if (days % 2 == 0) {
                id =  String.format("%4s", seq) + key;
            }


            log.info("{}", id);

        }catch (Exception ex){
            log.error("{}", ex);
        }
    }
}
