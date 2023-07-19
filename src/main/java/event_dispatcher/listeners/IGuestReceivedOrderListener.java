package event_dispatcher.listeners;

import event_dispatcher.Order;
import event_dispatcher.actors.Guest;

public interface IGuestReceivedOrderListener {
    void guestReceivedOrder(Guest g, Order o);
}
