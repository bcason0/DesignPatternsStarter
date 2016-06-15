package io.zipcoder.designpatterns;

import io.zipcoder.designpatterns.abstractfactory.BeerDispensingSystem;

import io.zipcoder.designpatterns.factory.BeerDispenser;
import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class BeerDispensingSystemSpec {

    BeerDispensingSystem beerDispensingSystem;
    @Before
    public void init(){
        beerDispensingSystem = new BeerDispensingSystem();
    }
    @Test
    public void drinkDispenserTest(){
        DrinkDispenser beerDispenser = beerDispensingSystem.drinkDispenser();
        assertTrue(beerDispenser instanceof BeerDispenser);
    }

    @Test
    public void cupDispenserTest(){
        CupDispenser beerGlassDispenser = beerDispensingSystem.cupDispenser();
        assertTrue(beerGlassDispenser instanceof BeerGlassDispenser);
    }

}
