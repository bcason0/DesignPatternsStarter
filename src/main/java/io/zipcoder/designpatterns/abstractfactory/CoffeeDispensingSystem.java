package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;
import io.zipcoder.designpatterns.factory.CoffeeMachine;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;


public class CoffeeDispensingSystem extends DispensingSystem{
    public DrinkDispenser drinkDispenser(){
        return CoffeeMachine.getInstance();
    }


    public CupDispenser cupDispenser(){
        return CoffeeCupDispenser.getInstance();
    }
}
