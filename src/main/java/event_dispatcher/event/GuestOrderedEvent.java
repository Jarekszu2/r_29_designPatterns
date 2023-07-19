package event_dispatcher.event;

import event_dispatcher.Order;
import event_dispatcher.actors.Guest;
import event_dispatcher.dispatcher.Dispatcher;
import event_dispatcher.listeners.IGuestOrderedListener;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GuestOrderedEvent implements IEvent {
    private Guest guest;
    private Order order;

    @Override
    public void execute() {
        List<IGuestOrderedListener> listenerList = Dispatcher.getInstance().getAllListenersOf(IGuestOrderedListener.class);
        for (IGuestOrderedListener iGuestOrderedListener : listenerList) {
            iGuestOrderedListener.guestOrdered(guest, order);
        }

    }
}
