package io.zipcoder.designpatterns.factory;

/**
 * Created by bryantcason on 6/13/16.
 */
public class CoffeeCupDispenser extends CupDispenser {

    private static CoffeeCupDispenser instance;
    private CoffeeCupDispenser(){

    }

    public static CoffeeCupDispenser getInstance(){
        if(instance == null)
         instance = new CoffeeCupDispenser();
        return instance;
    }

    @Override
    public Cup cupType() {
        return new CoffeeCup();
    }
}
