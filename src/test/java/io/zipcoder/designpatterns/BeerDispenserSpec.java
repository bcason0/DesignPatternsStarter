package io.zipcoder.designpatterns;


import io.zipcoder.designpatterns.factory.Beer;
import io.zipcoder.designpatterns.factory.BeerDispenser;
import io.zipcoder.designpatterns.factory.Drink;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by bryantcason on 6/13/16.
 */
public class BeerDispenserSpec {

    @Test
    public void dispense(){
        BeerDispenser beerDispenser = new BeerDispenser();
        Drink beer = beerDispenser.dispense();
        assertTrue(beer instanceof Beer);
    }
}
