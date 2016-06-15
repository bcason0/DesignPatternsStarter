package io.zipcoder.designpatterns.factory;

/**
 * Created by bryantcason on 6/13/16.
 */
public class SodaCupDispenser extends CupDispenser {

    private static SodaCupDispenser instance;
    private SodaCupDispenser(){

    }

    public static SodaCupDispenser getInstance(){
        if(instance == null)
            instance = new SodaCupDispenser();
        return instance;
    }
    @Override
    public Cup cupType() {
        return new SodaCup();
    }
}
