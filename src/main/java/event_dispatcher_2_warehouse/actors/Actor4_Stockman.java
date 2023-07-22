package event_dispatcher_2_warehouse.actors;

import event_dispatcher_2_warehouse.listener.IClientPaidListener;
import event_dispatcher_2_warehouse.model.Client;
import event_dispatcher_2_warehouse.model.Order;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Actor4_Stockman extends IBaseClass implements IClientPaidListener {
    private String name;

    @Override
    public void clientPaid(Client client, Order order) {
        System.out.println("Goods: " + order.getName() + ", delivered to client nr: " + client.getNummer() + " - stockman " + name);

    }
}
