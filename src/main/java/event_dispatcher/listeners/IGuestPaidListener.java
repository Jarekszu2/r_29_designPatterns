package event_dispatcher.listeners;

import event_dispatcher.actors.Guest;

public interface IGuestPaidListener {
    void guestPaid(Guest g, double amount);
}
