package com.company.abstractfactory;

public class BarracksProducer {
    public static AbstractBarracks getBarracks(boolean isSuper){
        if (isSuper)
            return new SuperBarracks();
        else
            return new Barracks();
    }
}
