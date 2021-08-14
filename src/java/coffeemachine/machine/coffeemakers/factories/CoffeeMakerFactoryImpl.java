package coffeemachine.machine.coffeemakers.factories;

import coffeemachine.machine.IOHandler;
import coffeemachine.machine.coffeemakers.CappuccinoMaker;
import coffeemachine.machine.coffeemakers.CoffeeMaker;
import coffeemachine.machine.coffeemakers.EspressoMaker;
import coffeemachine.machine.coffeemakers.LatteMaker;
import coffeemachine.machine.exceptions.CoffeeMachineException;

public class CoffeeMakerFactoryImpl implements CoffeeMakerFactory {

    @Override
    public CoffeeMaker create(String coffeeType, IOHandler io) {
        switch (coffeeType) {
            case "1":
                return new EspressoMaker(io);

            case "2":
                return new LatteMaker(io);

            case "3":
                return new CappuccinoMaker(io);

            default:
                throw new CoffeeMachineException("Unknown coffee type");
        }
    }
}
