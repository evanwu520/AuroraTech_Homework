package com.evan.homework.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class GenerateSeqTest {

    @Test
    void genShoeSeq(){

        log.info("{}",  GenerateSeq.genShoeSeq(3));

    }

    @Test
    void genBoxSeq(){

        log.info("{}",  GenerateSeq.genBoxSeq(2));

    }

    @Test
    void genCombineSeq(){

        log.info("{}",  GenerateSeq.genCombineSeq("001ABCD", "001EFGH"));

        log.info("{}",  GenerateSeq.genCombineSeq("0002ABCD", "0002EFGH"));

        log.info("{}",  GenerateSeq.genCombineSeq("0003ABCD", "003EFGH"));

        log.info("{}",  GenerateSeq.genCombineSeq("004ABCD", "0004EFGH"));

    }

}