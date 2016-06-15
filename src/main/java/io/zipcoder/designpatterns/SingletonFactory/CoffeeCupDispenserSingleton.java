package io.zipcoder.designpatterns.SingletonFactory;

import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;

/**
 * Created by bryantcason on 6/15/16.
 */
public class CoffeeCupDispenserSingleton extends CoffeeCupDispenser {
    private static CoffeeCupDispenserSingleton instance;
    private CoffeeCupDispenserSingleton(){

    }

    public static CoffeeCupDispenserSingleton getInstance(){
        if(instance == null)
            instance = new CoffeeCupDispenserSingleton();
        return instance;
    }

}
