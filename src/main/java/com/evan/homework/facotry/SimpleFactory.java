package com.evan.homework.facotry;

import com.evan.homework.facotry.work.BoxWork;
import com.evan.homework.facotry.work.CombineWork;
import com.evan.homework.facotry.work.ShoesWork;
import com.evan.homework.facotry.work.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SimpleFactory  extends  AbstractFactory{

    public static final String name  = "SimpleFactory";

    @Autowired
    BoxWork boxWork;

    @Autowired
    ShoesWork shoesWork;

    @Autowired
    CombineWork combineWork;



    @Override
    public Work getBox() {
        return boxWork;
    }

    @Override
    public Work getShoes() {
        return shoesWork;
    }

    @Override
    public Work getCombine() {
        return combineWork;
    }
}
