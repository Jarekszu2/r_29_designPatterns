package event_dispatcher_2_warehouse.actors;

import event_dispatcher_2_warehouse.dispatcher.Dispatcher;

public abstract class IBaseClass {
    public IBaseClass() {
        Dispatcher.DISPATCHER.register(this);
    }
}
