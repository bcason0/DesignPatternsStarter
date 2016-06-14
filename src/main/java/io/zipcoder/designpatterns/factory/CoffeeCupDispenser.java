package io.zipcoder.designpatterns.factory;

/**
 * Created by bryantcason on 6/13/16.
 */
public class CoffeeCupDispenser extends CupDispenser {


    @Override
    public Cup cupType() {
        return new CoffeeCup();
    }
}
