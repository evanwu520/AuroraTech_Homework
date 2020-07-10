package com.evan.homework.facotry;

import com.evan.homework.facotry.work.BoxWork;
import com.evan.homework.facotry.work.CombineWork;
import com.evan.homework.facotry.work.ShoesWork;
import com.evan.homework.facotry.work.Work;


public class SimpleFactory  extends  AbstractFactory{

    public static final String name  = "SimpleFactory";


    @Override
    Work getBox() {
        return new BoxWork();
    }

    @Override
    Work getShoes() {
        return new ShoesWork();
    }

    @Override
    Work getCombine() {
        return new CombineWork();
    }
}
