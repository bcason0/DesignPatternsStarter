package io.zipcoder.designpatterns.SingletonFactory;

import io.zipcoder.designpatterns.factory.BeerGlassDispenser;

/**
 * Created by bryantcason on 6/15/16.
 */
public class BeerGlassDispenserSingleton extends BeerGlassDispenser {

    private static BeerGlassDispenserSingleton instance;

    private BeerGlassDispenserSingleton(){
    }

    public static BeerGlassDispenser getInstance(){
        if(instance == null)
            instance = new BeerGlassDispenserSingleton();
        return instance;
    }
}
