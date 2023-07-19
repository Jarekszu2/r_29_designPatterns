package event_dispatcher.listeners;

import event_dispatcher.actors.Guest;

public interface IGuestArrivedListener {
    void guestArrived(Guest g);
}
