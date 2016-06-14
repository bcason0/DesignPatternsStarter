package io.zipcoder.designpatterns;

import io.zipcoder.designpatterns.factory.Cup;
import io.zipcoder.designpatterns.factory.SodaCup;
import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by bryantcason on 6/13/16.
 */
public class SodaCupDispenserTest {

    @Test
    public void cupTypeTest(){
        SodaCupDispenser sodaCupDispenser = new SodaCupDispenser();
        Cup sodaCup = sodaCupDispenser.cupType();
        assertTrue(sodaCup instanceof SodaCup);
    }
}
