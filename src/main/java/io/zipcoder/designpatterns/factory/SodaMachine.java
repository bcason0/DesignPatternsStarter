package io.zipcoder.designpatterns.factory;


public class SodaMachine extends DrinkDispenser{

    public Soda dispense(){
        return new Soda();
    }
}