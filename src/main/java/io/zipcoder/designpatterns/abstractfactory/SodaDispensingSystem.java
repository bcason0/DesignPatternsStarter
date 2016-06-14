package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.*;

/**
 * Created by bryantcason on 6/13/16.
 */
public class SodaDispensingSystem extends DispensingSystem {

    public DrinkDispenser drinkDispenser(){
        return new SodaMachine();
    }

    public CupDispenser cupDispenser(){
        return new SodaCupDispenser();
    }
}
