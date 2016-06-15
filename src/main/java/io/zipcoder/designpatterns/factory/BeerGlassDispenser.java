package io.zipcoder.designpatterns.factory;

/**
 * Created by bryantcason on 6/13/16.
 */
public class BeerGlassDispenser extends CupDispenser {

    private static BeerGlassDispenser instance;

    private BeerGlassDispenser(){}

    public static BeerGlassDispenser getInstance(){
        if(instance == null)
            instance = new BeerGlassDispenser();

        return instance;
    }

    @Override
    public Cup cupType() {
        return new BeerGlass();
    }
}
