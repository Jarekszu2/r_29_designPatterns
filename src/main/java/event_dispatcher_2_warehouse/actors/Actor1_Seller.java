package event_dispatcher_2_warehouse.actors;

import event_dispatcher_2_warehouse.listener.IClientArrivedListener;
import event_dispatcher_2_warehouse.listener.IClientOrderedListener;
import event_dispatcher_2_warehouse.model.Client;
import event_dispatcher_2_warehouse.model.Order;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Actor1_Seller extends IBaseClass implements IClientArrivedListener, IClientOrderedListener {
    private String name;

    @Override
    public void clientArrived(Client client) {
        System.out.println("Wellcome: client nr " + client.getNummer() + " - seller " + name);
    }

    @Override
    public void clientOrdered(Client client, Order order) {
        System.out.println("Client nr: " + client.getNummer() + ", ordered " + order.getName() + " - seller " + name);
    }
}
