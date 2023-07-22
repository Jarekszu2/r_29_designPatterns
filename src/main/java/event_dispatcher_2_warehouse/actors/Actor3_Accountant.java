package event_dispatcher_2_warehouse.actors;

import event_dispatcher_2_warehouse.listener.IClientOrderedListener;
import event_dispatcher_2_warehouse.listener.IClientPaidListener;
import event_dispatcher_2_warehouse.model.Client;
import event_dispatcher_2_warehouse.model.Order;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Actor3_Accountant extends IBaseClass implements IClientOrderedListener, IClientPaidListener {
    private String name;

    @Override
    public void clientOrdered(Client client, Order order) {
        System.out.println("Client nr: " + client.getNummer() + ", ordered for value " + order.getPrice() + " - accountant " + name);
    }

    @Override
    public void clientPaid(Client client, Order order) {
        System.out.println("Client nr: " + client.getNummer() + ", paid " + order.getPrice() + " - accountant " + name);
        System.out.println("Goods can be delivered.");
    }
}
