package io.zipcoder.designpatterns;

import io.zipcoder.designpatterns.factory.Drink;
import io.zipcoder.designpatterns.factory.Soda;
import io.zipcoder.designpatterns.factory.SodaMachine;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by bryantcason on 6/13/16.
 */
public class SodaMachineTest {

    @Test
    public void dispenseTest(){
        SodaMachine sodaMachine = new SodaMachine();
        Drink soda = sodaMachine.dispense();
        assertTrue(soda instanceof Soda);
    }
}
