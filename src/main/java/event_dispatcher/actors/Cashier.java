package event_dispatcher.actors;

import event_dispatcher.Order;
import event_dispatcher.listeners.IGuestOrderedListener;
import event_dispatcher.listeners.IGuestPaidListener;

import java.util.HashMap;
import java.util.Map;

public class Cashier extends IBaseClass implements IGuestOrderedListener, IGuestPaidListener {
    Map<Guest, Order> oorders = new HashMap<>();    // zakładamy mapę zamówień

    @Override
    public void guestOrdered(Guest g, Order o) {
        System.out.println(g + " ordered " + o + " - cashier");
        oorders.put(g, o);
    }

    @Override
    public void guestPaid(Guest g, double amount) {
        System.out.println(g + " ordered " + amount + " - cashier");
        if (oorders.get(g).getPrice() < amount) {
            System.out.println("Gościu nie dopłacił.");
        } else {
            System.out.println("Hajs sie zgadza.");
            oorders.remove(g);
        }
    }
}
