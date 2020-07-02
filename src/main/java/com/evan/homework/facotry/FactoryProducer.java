package com.evan.homework.facotry;

public class FactoryProducer {


    public AbstractFactory getFactory(String name){

        if (name.equals(SimpleFactory.name)) {
            return new SimpleFactory();
        }
        return null;

    }
}
