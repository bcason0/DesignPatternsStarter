package io.zipcoder.designpatterns.SingletonFactory;

import io.zipcoder.designpatterns.factory.SodaMachine;

/**
 * Created by bryantcason on 6/15/16.
 */
public class SodaMachineSingleton extends SodaMachine{

    private static SodaMachineSingleton instance;
    private SodaMachineSingleton(){}

    public static SodaMachineSingleton getInstance(){
        if(instance == null)
            instance = new SodaMachineSingleton();
        return instance;
    }

}
