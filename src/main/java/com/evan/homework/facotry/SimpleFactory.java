package com.evan.homework.facotry;

import com.evan.homework.facotry.work.Box;
import com.evan.homework.facotry.work.Combine;
import com.evan.homework.facotry.work.Shoes;
import com.evan.homework.facotry.work.Work;


public class SimpleFactory  extends  AbstractFactory{

    public static final String name  = "SimpleFactory";


    @Override
    Work getBox() {
        return new Box();
    }

    @Override
    Work getShoes() {
        return new Shoes();
    }

    @Override
    Work getCombine() {
        return new Combine();
    }
}
