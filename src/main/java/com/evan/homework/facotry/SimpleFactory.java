package com.evan.homework.facotry;

import com.evan.homework.facotry.work.BoxWork;
import com.evan.homework.facotry.work.CombineWork;
import com.evan.homework.facotry.work.ShoesWork;
import com.evan.homework.facotry.work.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleFactory  extends  AbstractFactory{

    public static final String name  = "SimpleFactory";

    @Autowired
    BoxWork boxWork;



    @Override
    public Work getBox() {
        return boxWork;
    }

//    @Override
//    Work getShoes() {
//        return new ShoesWork();
//    }
//
//    @Override
//    Work getCombine() {
//        return new CombineWork();
//    }
}
