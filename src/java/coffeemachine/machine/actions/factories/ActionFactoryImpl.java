package coffeemachine.machine.actions.factories;

import coffeemachine.machine.IOHandler;
import coffeemachine.machine.actions.*;
import coffeemachine.machine.coffeemakers.factories.CoffeeMakerFactory;
import coffeemachine.machine.coffeemakers.factories.CoffeeMakerFactoryImpl;
import coffeemachine.machine.exceptions.CoffeeMachineException;

public class ActionFactoryImpl implements ActionFactory {

    private final static CoffeeMakerFactory coffeeMakerFactory = new CoffeeMakerFactoryImpl();

    @Override
    public Action create(String type, IOHandler io) {
        switch (type) {
            case "buy":
                return new ActionBuy(io, coffeeMakerFactory);

            case "fill":
                return new ActionFill(io);

            case "take":
                return new ActionTake(io);

            case "remaining":
                return new ActionRemaining(io);

            default:
                throw new CoffeeMachineException("Unknown action");
        }
    }
}
