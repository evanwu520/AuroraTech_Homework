package com.evan.homework.facotry.work;

import com.evan.homework.model.Shoes;
import com.evan.homework.repository.ShoesRepository;
import com.evan.homework.util.GenerateSeq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@Slf4j
public class ShoesWork implements Work {

    @Autowired
    ShoesRepository shoesRepository;

    @Override
    public void produce() {

        try{

            Optional<Long> optional = shoesRepository.findShoesMaxSeq();

            long seq = 1;

            if (optional.isPresent()){
                seq =  optional.get().longValue()+1;

            }

            Shoes shoes = new Shoes();
            shoes.setId(GenerateSeq.genShoeSeq(seq));
            log.info("{}",   shoesRepository.save(shoes).toString());

        }catch (Exception ex){
            log.error("{}", ex);
        }


    }
}
