package io.zipcoder.designpatterns.SingletonFactory;

import io.zipcoder.designpatterns.factory.CoffeeMachine;

/**
 * Created by bryantcason on 6/15/16.
 */
public class CoffeeMachineSingleton extends CoffeeMachine {
    private static CoffeeMachineSingleton instance;
    private CoffeeMachineSingleton(){

    }

    public static CoffeeMachineSingleton getInstance() {
        if (instance == null)
            instance = new CoffeeMachineSingleton();
        return instance;

    }

}
