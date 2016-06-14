package io.zipcoder.designpatterns;


import io.zipcoder.designpatterns.abstractfactory.SodaDispensingSystem;
import io.zipcoder.designpatterns.factory.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SodaDispensingSystemSpec {

    SodaDispensingSystem sodaDispensingSystem;

    @Before
    public void init(){
        sodaDispensingSystem = new SodaDispensingSystem();
    }

    @Test
    public void drinkDispenserTest(){
        DrinkDispenser sodaDispenser = sodaDispensingSystem.drinkDispenser();
        assertTrue(sodaDispenser instanceof SodaMachine);
    }

    @Test
    public void cupDispenserTest(){
        CupDispenser sodaCupDispenser = sodaDispensingSystem.cupDispenser();
        assertTrue(sodaCupDispenser instanceof SodaCupDispenser);
    }

}

