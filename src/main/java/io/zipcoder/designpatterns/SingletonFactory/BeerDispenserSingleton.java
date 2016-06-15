package io.zipcoder.designpatterns.SingletonFactory;

import io.zipcoder.designpatterns.factory.BeerDispenser;

/**
 * Created by bryantcason on 6/15/16.
 */
public class BeerDispenserSingleton extends BeerDispenser{

    private static BeerDispenserSingleton instance;
    private BeerDispenserSingleton(){}

    public static BeerDispenserSingleton getInstance(){
        if(instance == null)
            instance = new BeerDispenserSingleton();
        return instance;
    }
}
