package coffeemachine;

import coffeemachine.machine.CoffeeMachine;
import coffeemachine.machine.IOHandler;
import coffeemachine.machine.actions.factories.ActionFactoryImpl;

public class Main {
    public static void main(String[] args) {
        final var coffeeMachine = new CoffeeMachine(new IOHandler(), new ActionFactoryImpl());
        coffeeMachine.start();
    }
}
