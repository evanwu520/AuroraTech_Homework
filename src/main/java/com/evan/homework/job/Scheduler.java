package com.evan.homework.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class Scheduler {


    @Scheduled(cron="0/30 * * * * ?")
    void generateBox(){
        log.info("{} - {} \n", "generateBox" ,new Date());
    }

    @Scheduled(cron="0 0/1 * * * ?")
    void generateShoes(){
        log.info("{} - {}\n", "generateShoes" ,new Date());
    }

    @Scheduled(cron="20 0/1 * * * ?")
    void generateProduct(){
        

        log.info("{} - {}\n", "generateProduct" ,new Date());
    }

}
