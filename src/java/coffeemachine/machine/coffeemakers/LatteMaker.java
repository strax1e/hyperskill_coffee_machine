package coffeemachine.machine.coffeemakers;

import coffeemachine.machine.IOHandler;
import coffeemachine.machine.Resources;

public class LatteMaker extends CoffeeMaker {

    public LatteMaker(IOHandler io) {
        super(new Resources(350, 75, 20, 1,  7), io);
    }

    @Override
    public Resources make(Resources resources) {
        return super.make(resources);
    }
}
