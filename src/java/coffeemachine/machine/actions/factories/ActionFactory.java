package coffeemachine.machine.actions.factories;

import coffeemachine.machine.IOHandler;
import coffeemachine.machine.actions.Action;

public interface ActionFactory {

    Action create(String type, IOHandler io);
}
