package coffeemachine.machine.coffeemakers.factories;

import coffeemachine.machine.IOHandler;
import coffeemachine.machine.coffeemakers.CoffeeMaker;

public interface CoffeeMakerFactory {

    CoffeeMaker create(String coffeeType, IOHandler io);
}
