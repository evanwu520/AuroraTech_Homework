package com.evan.homework.job;

import com.evan.homework.facotry.AbstractFactory;
import com.evan.homework.facotry.FactoryProducer;
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
    FactoryProducer factoryProducer;

    @Scheduled(cron="0/30 * * * * ?")
    void generateBox(){

        log.info("{} - {} \n", "generateBox start" ,new Date());

        AbstractFactory AbstractFactory = factoryProducer.getFactory(SimpleFactory.name);
        AbstractFactory.getBox().produce();

        log.info("{} - {} \n", "generateBox end" ,new Date());
    }

    @Scheduled(cron="0 0/1 * * * ?")
    void generateShoes(){

        log.info("{} - {} \n", "generateShoes start" ,new Date());

        AbstractFactory AbstractFactory = factoryProducer.getFactory(SimpleFactory.name);
        AbstractFactory.getShoes().produce();

        log.info("{} - {} \n", "generateShoes end" ,new Date());
    }

    @Scheduled(cron="20 0/1 * * * ?")
    void generateProduct(){

        log.info("{} - {} \n", "generateProduct start" ,new Date());

        AbstractFactory AbstractFactory = factoryProducer.getFactory(SimpleFactory.name);
        AbstractFactory.getCombine().produce();

        log.info("{} - {} \n", "generateProduct end" ,new Date());
    }

}
