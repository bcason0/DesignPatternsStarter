package io.zipcoder.designpatterns.factory;

/**
 * Created by bryantcason on 6/13/16.
 */
public class BeerDispenser extends DrinkDispenser {

    @Override
    public Drink dispense() {
        return new Beer();
    }
}
