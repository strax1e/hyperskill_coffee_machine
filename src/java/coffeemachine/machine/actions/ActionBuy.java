package coffeemachine.machine.actions;

import coffeemachine.machine.IOHandler;
import coffeemachine.machine.Resources;
import coffeemachine.machine.coffeemakers.factories.CoffeeMakerFactory;

public class ActionBuy extends Action {

    private final CoffeeMakerFactory coffeeMakerFactory;

    public ActionBuy(IOHandler io, CoffeeMakerFactory coffeeMakerFactory) {
        super(io);
        this.coffeeMakerFactory = coffeeMakerFactory;
    }

    @Override
    public Resources act(Resources resources) {
        String coffeeType = askForCoffeeType();
        if (coffeeType.equals("back")) {
            return resources;
        }

        var coffeeMaker = coffeeMakerFactory.create(coffeeType, io);
        return coffeeMaker.make(resources);
    }

    private String askForCoffeeType() {
        io.send("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        return getCoffeeType();
    }

    private String getCoffeeType() {
        String type = io.readWord().toLowerCase();

        // The input check code may be here in the future

        return type;
    }
}
