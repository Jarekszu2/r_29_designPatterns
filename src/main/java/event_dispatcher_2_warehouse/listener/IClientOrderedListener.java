package event_dispatcher_2_warehouse.listener;

import event_dispatcher_2_warehouse.model.Client;
import event_dispatcher_2_warehouse.model.Order;

public interface IClientOrderedListener {
    void clientOrdered(Client client, Order order);
}
