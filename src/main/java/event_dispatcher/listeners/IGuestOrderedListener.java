package event_dispatcher.listeners;

import event_dispatcher.Order;
import event_dispatcher.actors.Guest;

public interface IGuestOrderedListener {
    void guestOrdered(Guest g, Order o);
}
