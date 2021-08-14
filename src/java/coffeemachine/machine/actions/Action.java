package coffeemachine.machine.actions;

import coffeemachine.machine.IOHandler;
import coffeemachine.machine.Resources;

public abstract class Action {

    protected final IOHandler io;

    protected Action(IOHandler io) {
        this.io = io;
    }

    /**
     * @param resources current resources
     * @return resources after action
     */
    public abstract Resources act(Resources resources);
}
