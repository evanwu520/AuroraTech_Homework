package com.evan.homework.facotry.work;

import com.evan.homework.model.Box;
import com.evan.homework.repository.BoxRepository;
import com.evan.homework.util.GenerateSeq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
public class BoxWork implements Work {

    @Autowired
    BoxRepository boxRepository;


    @Override
    public void produce() {


        try{
            Optional<Long> optional = boxRepository.findBoxMaxSeq();

            long seq = 1;

            if (optional.isPresent()){
                seq =  optional.get().longValue()+1;

            }


            Box box = new Box();
            box.setId(GenerateSeq.genBoxSeq(seq));
            log.info("{}",   boxRepository.save(box).toString());

        }catch (Exception ex){
           log.error("{}", ex);
        }

    }
}
