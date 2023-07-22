package event_dispatcher_2_warehouse.listener;

import event_dispatcher_2_warehouse.model.Client;

public interface IClientArrivedListener {
    void clientArrived(Client client);
}
