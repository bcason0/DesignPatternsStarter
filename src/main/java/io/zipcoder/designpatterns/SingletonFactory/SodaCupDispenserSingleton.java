package io.zipcoder.designpatterns.SingletonFactory;

import io.zipcoder.designpatterns.factory.SodaCupDispenser;

/**
 * Created by bryantcason on 6/15/16.
 */
public class SodaCupDispenserSingleton extends SodaCupDispenser {

    private static SodaCupDispenserSingleton instance;
    private SodaCupDispenserSingleton(){

    }

    public static SodaCupDispenserSingleton getInstance(){
        if(instance == null)
            instance = new SodaCupDispenserSingleton();
        return instance;
    }
}
