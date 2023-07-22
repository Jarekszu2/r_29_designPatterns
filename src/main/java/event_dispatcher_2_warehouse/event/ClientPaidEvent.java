package event_dispatcher_2_warehouse.event;

import event_dispatcher_2_warehouse.dispatcher.Dispatcher;
import event_dispatcher_2_warehouse.listener.IClientPaidListener;
import event_dispatcher_2_warehouse.model.Client;
import event_dispatcher_2_warehouse.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@Data
public class ClientPaidEvent implements IEvent {

    private Client client;
    private Order order;

    @Override
    public void execute() {
        List<IClientPaidListener> listeners = Dispatcher.DISPATCHER.getObjectsTheyImplementInterface(IClientPaidListener.class);
        listeners.sort(Comparator.comparing(iClientPaidListener -> iClientPaidListener.getClass().getName()));
        for (IClientPaidListener listener : listeners) {
            listener.clientPaid(client, order);
        }

    }
}
