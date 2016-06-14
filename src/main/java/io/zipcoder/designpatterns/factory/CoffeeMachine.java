package io.zipcoder.designpatterns.factory;

public class CoffeeMachine extends DrinkDispenser{

    public Coffee dispense(){
        return new Coffee();
    }
}
