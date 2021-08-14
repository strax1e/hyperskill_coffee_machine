package coffeemachine.machine.coffeemakers;

import coffeemachine.machine.IOHandler;
import coffeemachine.machine.Resources;

public class EspressoMaker extends CoffeeMaker {

    public EspressoMaker(IOHandler io) {
        super(new Resources(250, 0, 16, 1, 4), io);
    }

    @Override
    public Resources make(Resources resources) {
        return super.make(resources);
    }
}
