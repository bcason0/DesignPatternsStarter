package io.zipcoder.designpatterns;

import io.zipcoder.designpatterns.factory.Coffee;
import io.zipcoder.designpatterns.factory.CoffeeMachine;
import io.zipcoder.designpatterns.factory.Drink;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by bryantcason on 6/13/16.
 */
public class CoffeeMachineSpec {

    @Test
    public void dispenseTest(){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Drink coffee = coffeeMachine.dispense();
        assertTrue(coffee instanceof Coffee);
    }
}
