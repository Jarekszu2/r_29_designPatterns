package event_dispatcher.actors;

import event_dispatcher.Order;
import event_dispatcher.listeners.IGuestOrderedListener;
import event_dispatcher.listeners.IGuestReceivedOrderListener;

import java.util.ArrayList;
import java.util.List;

public class Chef extends IBaseClass implements IGuestOrderedListener, IGuestReceivedOrderListener {
    List<Order> ordersToMake = new ArrayList<>();
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    @Override
    public void guestOrdered(Guest g, Order o) {
        ordersToMake.add(o);
        System.out.println("Dodaje zamówienie: " + o + " - " + name);
    }

    @Override
    public void guestReceivedOrder(Guest g, Order o) {
        ordersToMake.remove(o);
        System.out.println("Zrealizowano zamówienie: " + o);
    }
}
