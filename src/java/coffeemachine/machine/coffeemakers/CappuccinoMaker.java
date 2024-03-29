package coffeemachine.machine.coffeemakers;

import coffeemachine.machine.IOHandler;
import coffeemachine.machine.Resources;

public class CappuccinoMaker extends CoffeeMaker {

    public CappuccinoMaker(IOHandler io) {
        super(new Resources(200, 100, 12, 1, 6), io);
    }

    @Override
    public Resources make(Resources resources) {
        return super.make(resources);
    }
}
