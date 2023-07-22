package event_dispatcher_2_warehouse.listener;

import event_dispatcher_2_warehouse.model.Client;
import event_dispatcher_2_warehouse.model.Order;

public interface IClientPaidListener {
    void clientPaid(Client client, Order order);
}
