package com.evan.homework.job;

import com.evan.homework.facotry.SimpleFactory;
import com.evan.homework.facotry.work.BoxWork;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class Scheduler {

    @Autowired
    SimpleFactory factory;

    @Scheduled(cron="0/1 * * * * ?")
    void generateBox(){

        log.info("{} - {} \n", "generateBox start" ,new Date());

        factory.getBox().produce();

        log.info("{} - {} \n", "generateBox end" ,new Date());
    }

//    @Scheduled(cron="0 0/1 * * * ?")
//    void generateShoes(){
//        log.info("{} - {}\n", "generateShoes" ,new Date());
//    }
//
//    @Scheduled(cron="20 0/1 * * * ?")
//    void generateProduct(){
//        
//
//        log.info("{} - {}\n", "generateProduct" ,new Date());
//    }

}
