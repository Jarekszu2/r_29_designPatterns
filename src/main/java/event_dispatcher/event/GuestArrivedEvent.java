package event_dispatcher.event;

import event_dispatcher.actors.Guest;
import event_dispatcher.dispatcher.Dispatcher;
import event_dispatcher.listeners.IGuestArrivedListener;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GuestArrivedEvent implements IEvent{
    private Guest g;

    @Override
    public void execute() {
        List<IGuestArrivedListener> listenerList = Dispatcher.getInstance().getAllListenersOf(IGuestArrivedListener.class);
        for (IGuestArrivedListener iGuestArrivedListener : listenerList) {
            iGuestArrivedListener.guestArrived(g);
        }

    }
}
