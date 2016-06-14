package io.zipcoder.designpatterns;

import io.zipcoder.designpatterns.factory.BeerGlass;
import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.Cup;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by bryantcason on 6/13/16.
 */
public class BeerGlassDispenserSpec {

    @Test
    public void cupTypeTest(){
        BeerGlassDispenser beerGlassDispenser = new BeerGlassDispenser();
        Cup beerGlass = beerGlassDispenser.cupType();
        assertTrue(beerGlass instanceof BeerGlass);
    }
}
