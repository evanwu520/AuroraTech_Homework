package com.evan.homework.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Scheduler {


    @Scheduled(cron="0/30 * * * * ?")
    void generateBox(){
        System.out.printf("%s - %s \n", "generateBox" ,new Date());
    }

    @Scheduled(cron="0 0/1 * * * ?")
    void generateShoes(){
        System.out.printf("%s - %s\n", "generateShoes" ,new Date());
    }

    @Scheduled(cron="20 0/1 * * * ?")
    void generateProduct(){
        System.out.printf("%s - %s\n", "generateProduct" ,new Date());
    }

}
