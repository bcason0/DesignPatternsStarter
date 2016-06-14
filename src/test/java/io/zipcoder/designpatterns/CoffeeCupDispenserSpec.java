package io.zipcoder.designpatterns;

import io.zipcoder.designpatterns.factory.CoffeeCup;
import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;

import io.zipcoder.designpatterns.factory.Cup;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeCupDispenserSpec {

    @Test
    public void cupTypeTest(){
        CoffeeCupDispenser coffeeCupDispenser = new CoffeeCupDispenser();
        Cup coffeeCup = coffeeCupDispenser.cupType();
        assertTrue(coffeeCup instanceof CoffeeCup);
    }
}
