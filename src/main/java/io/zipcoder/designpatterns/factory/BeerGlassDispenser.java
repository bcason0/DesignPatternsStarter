package io.zipcoder.designpatterns.factory;

/**
 * Created by bryantcason on 6/13/16.
 */
public class BeerGlassDispenser extends CupDispenser {

    @Override
    public Cup cupType() {
        return new BeerGlass();
    }
}
