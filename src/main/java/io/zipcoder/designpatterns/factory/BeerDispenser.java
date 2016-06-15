package io.zipcoder.designpatterns.factory;

/**
 * Created by bryantcason on 6/13/16.
 */
public class BeerDispenser extends DrinkDispenser {

    private static BeerDispenser instance;
    private BeerDispenser(){}

    public static BeerDispenser getInstance(){
        if(instance == null)
            instance = new BeerDispenser();
        return instance;
    }

    @Override
    public Drink dispense() {
        return new Beer();
    }
}
