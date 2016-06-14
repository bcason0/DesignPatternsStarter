package io.zipcoder.designpatterns;
import io.zipcoder.designpatterns.abstractfactory.CoffeeDispensingSystem;
import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;
import io.zipcoder.designpatterns.factory.CoffeeMachine;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by bryantcason on 6/13/16.
 */
public class CoffeeDispensingSystemSpec {

    CoffeeDispensingSystem coffeeDispensingSystem;

    @Before
    public void init(){
        coffeeDispensingSystem = new CoffeeDispensingSystem();
    }

    @Test
    public void drinkDispenserTest(){
        DrinkDispenser coffeeDispenser = coffeeDispensingSystem.drinkDispenser();
        assertTrue(coffeeDispenser instanceof CoffeeMachine);
    }

    @Test
    public void cupDispenserTest(){
        CupDispenser coffeeCupDispenser = coffeeDispensingSystem.cupDispenser();
        assertTrue(coffeeCupDispenser instanceof CoffeeCupDispenser);
    }
}
