package event_dispatcher.actors;

import event_dispatcher.Order;
import event_dispatcher.listeners.IGuestLeftListener;
import event_dispatcher.listeners.IGuestPaidListener;
import event_dispatcher.listeners.IGuestReceivedOrderListener;

import java.util.ArrayList;
import java.util.List;

public class SecurityGuy extends IBaseClass implements IGuestReceivedOrderListener, IGuestPaidListener, IGuestLeftListener {
    List<Guest> listGuestNotPaid = new ArrayList<>();

    @Override
    public void guestPaid(Guest g, double amount) {
        listGuestNotPaid.remove(g);
        System.out.println("Usuwam gościa, którey zapłacił za zamówienie: " + g);
    }

    @Override
    public void guestReceivedOrder(Guest g, Order o) {
        listGuestNotPaid.add(g);
        System.out.println("Gościu: " + g + " otrzymał zamówienie: " + o);
    }

    @Override
    public void guestLeft(Guest g) {
        if (listGuestNotPaid.contains(g)){
            System.err.println("Dzwonię na policję - nie zapłacił za obiadek. ): " + g);
        }
    }
}
