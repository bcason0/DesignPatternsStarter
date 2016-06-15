package io.zipcoder.designpatterns.factory;


public class SodaMachine extends DrinkDispenser{
    private static SodaMachine instance;
    private SodaMachine(){}

    public static SodaMachine getInstance(){
        if(instance == null)
            instance = new SodaMachine();
        return instance;
    }


    public Soda dispense(){
        return new Soda();
    }
}