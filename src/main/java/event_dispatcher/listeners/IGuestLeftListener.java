package event_dispatcher.listeners;

import event_dispatcher.actors.Guest;

public interface IGuestLeftListener {
    void guestLeft(Guest g);
}
