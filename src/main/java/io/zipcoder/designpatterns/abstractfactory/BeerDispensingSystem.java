package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.BeerDispenser;
import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;


public class BeerDispensingSystem extends DispensingSystem {


    public DrinkDispenser drinkDispenser(){
        return BeerDispenser.getInstance();
    }

    public CupDispenser cupDispenser(){
        return BeerGlassDispenser.getInstance();
    }
}
