package event_dispatcher.actors;

import event_dispatcher.dispatcher.Dispatcher;

public abstract class IBaseClass {
    public IBaseClass() {
        Dispatcher.getInstance().register(this);    // obiekty rozszerzające tę klasę będą się same rejestrowały
                                                       // do Dispatchera po stworzeniu przez new
    }
}
